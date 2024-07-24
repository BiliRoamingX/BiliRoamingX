package app.revanced.bilibili.utils

import android.annotation.SuppressLint
import android.content.*
import androidx.annotation.GuardedBy
import java.io.Serializable
import java.lang.ref.WeakReference

/**
 * simple cross-process synchronized preferences implemented by broadcast.
 */
class CrossProcessPreferences(private val name: String) : SharedPreferences {
    private val prefs = context.getSharedPreferences(name, Context.MODE_PRIVATE)
    private val innerListener = SharedPreferences.OnSharedPreferenceChangeListener { sharedPreferences, key ->
        listeners.forEach {
            it.get()?.onSharedPreferenceChanged(sharedPreferences, key)
        }
        val value = sharedPreferences.all[key]
        val clear = key == null
        PreferenceSyncer.sync(name, clear, arrayListOf(PrefsPair(key.orEmpty(), value)))
    }
    private val listeners = mutableListOf<WeakReference<SharedPreferences.OnSharedPreferenceChangeListener>>()

    private val lock = Any()

    @GuardedBy("lock")
    private val values = hashMapOf<String, Any?>()

    init {
        if (!Utils.isMainProcess()) {
            synchronized(lock) {
                values.putAll(prefs.all)
            }
        } else {
            prefs.registerOnSharedPreferenceChangeListener(innerListener)
        }
    }

    private class PrefsPair(
        val key: String,
        val value: Any?, // should serializable, null to remove
    ) : Serializable {
        override fun toString() = "$key=$value"
        override fun hashCode() = key.hashCode()
        override fun equals(other: Any?): Boolean {
            if (this === other)
                return true
            if (other !is PrefsPair)
                return false
            return key == other.key
        }
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        private lateinit var context: Context
        private val prefsCache = mutableListOf<CrossProcessPreferences>()
        private val prefsLock = Any()

        private const val EXTRA_PREFS_NAME = "prefs_name"
        private const val EXTRA_PREFS_PAIRS = "prefs_pairs"
        private const val EXTRA_PREFS_CLEAR = "prefs_clear"
        private const val EXTRA_PREFS_COMMIT = "prefs_commit"

        @JvmStatic
        fun init(context: Context) {
            this.context = context.applicationContext
            if (Utils.isMainProcess()) {
                PreferenceUpdater.register()
            } else {
                PreferenceSyncer.register()
            }
        }

        @JvmStatic
        fun get(name: String): SharedPreferences {
            synchronized(prefsLock) {
                return prefsCache.find { it.name == name } ?: run {
                    CrossProcessPreferences(name).also { prefsCache.add(it) }
                }
            }
        }
    }

    private class PreferenceUpdater : BroadcastReceiver() {
        companion object {
            private const val ACTION = "biliroamingx.action.preferences.update"

            fun register() {
                context.registerReceiverCompat(PreferenceUpdater(), IntentFilter(ACTION))
            }

            fun update(prefsName: String, clear: Boolean, commit: Boolean, prefsPairs: ArrayList<PrefsPair>) {
                context.sendBroadcast(Intent(ACTION).apply {
                    `package` = context.packageName
                    putExtra(EXTRA_PREFS_NAME, prefsName)
                    putExtra(EXTRA_PREFS_PAIRS, prefsPairs)
                    putExtra(EXTRA_PREFS_CLEAR, clear)
                    putExtra(EXTRA_PREFS_COMMIT, commit)
                })
            }
        }

        @Suppress("UNCHECKED_CAST")
        @SuppressLint("ApplySharedPref")
        override fun onReceive(context: Context, intent: Intent) {
            val prefsName = intent.getStringExtra(EXTRA_PREFS_NAME).orEmpty()
            val prefsPairs = intent.serializableExtra<ArrayList<PrefsPair>>(EXTRA_PREFS_PAIRS)
            val clear = intent.getBooleanExtra(EXTRA_PREFS_CLEAR, false)
            val commit = intent.getBooleanExtra(EXTRA_PREFS_COMMIT, false)
            Logger.debug { "PreferenceUpdater, received update preferences request, prefsName: $prefsName, clear:$clear, commit: $commit, prefsPairs: $prefsPairs" }
            val prefs = prefsCache.find { it.name == prefsName }?.prefs?.edit() ?: return
            if (clear) {
                if (commit) {
                    prefs.clear().commit()
                } else {
                    prefs.clear().apply()
                }
                return
            }
            prefsPairs?.forEach { p ->
                val key = p.key
                val value = p.value
                if (value == null) {
                    prefs.remove(key)
                } else when (value) {
                    is Boolean -> prefs.putBoolean(key, value)
                    is Int -> prefs.putInt(key, value)
                    is Long -> prefs.putLong(key, value)
                    is Float -> prefs.putFloat(key, value)
                    is String -> prefs.putString(key, value)
                    is Set<*> -> prefs.putStringSet(key, value as Set<String>)
                }
            }
            if (commit) {
                prefs.commit()
            } else {
                prefs.apply()
            }
        }
    }

    private class PreferenceSyncer : BroadcastReceiver() {
        companion object {
            private const val ACTION = "biliroamingx.action.preferences.sync"

            fun register() {
                context.registerReceiverCompat(PreferenceSyncer(), IntentFilter(ACTION))
            }

            fun sync(prefsName: String, clear: Boolean, prefsPairs: ArrayList<PrefsPair>) {
                context.sendBroadcast(Intent(ACTION).apply {
                    `package` = context.packageName
                    putExtra(EXTRA_PREFS_NAME, prefsName)
                    putExtra(EXTRA_PREFS_PAIRS, prefsPairs)
                    putExtra(EXTRA_PREFS_CLEAR, clear)
                })
            }
        }

        override fun onReceive(context: Context, intent: Intent) {
            val prefsName = intent.getStringExtra(EXTRA_PREFS_NAME)
            val prefsPairs = intent.serializableExtra<ArrayList<PrefsPair>>(EXTRA_PREFS_PAIRS)
            val clear = intent.getBooleanExtra(EXTRA_PREFS_CLEAR, false)
            Logger.debug { "PreferenceSyncer, received sync preference request, pname: ${Utils.currentProcessName()}, prefsName: $prefsName, clear: $clear, prefsPairs: $prefsPairs" }
            val prefs = prefsCache.find { it.name == prefsName } ?: return
            synchronized(prefs.lock) {
                val values = prefs.values
                val listeners = prefs.listeners
                if (clear) {
                    values.clear()
                    listeners.forEach {
                        it.get()?.onSharedPreferenceChanged(prefs, null)
                    }
                    return
                }
                prefsPairs?.forEach { p ->
                    val key = p.key
                    val value = p.value
                    if (value == null) {
                        values.remove(key)
                    } else {
                        values[key] = value
                    }
                    listeners.forEach {
                        it.get()?.onSharedPreferenceChanged(prefs, key)
                    }
                }
            }
        }
    }

    override fun getAll(): Map<String, *> {
        return if (Utils.isMainProcess()) {
            prefs.all
        } else synchronized(lock) {
            values
        }
    }

    override fun getString(key: String, defValue: String?): String? {
        return if (Utils.isMainProcess()) {
            prefs.getString(key, defValue)
        } else synchronized(lock) {
            values[key] as? String ?: defValue
        }
    }

    override fun getStringSet(key: String, defValues: Set<String>?): Set<String>? {
        return if (Utils.isMainProcess()) {
            prefs.getStringSet(key, defValues)
        } else synchronized(lock) {
            @Suppress("UNCHECKED_CAST")
            values[key] as? Set<String> ?: defValues
        }
    }

    override fun getInt(key: String, defValue: Int): Int {
        return if (Utils.isMainProcess()) {
            prefs.getInt(key, defValue)
        } else synchronized(lock) {
            values[key] as? Int ?: defValue
        }
    }

    override fun getLong(key: String, defValue: Long): Long {
        return if (Utils.isMainProcess()) {
            prefs.getLong(key, defValue)
        } else synchronized(lock) {
            values[key] as? Long ?: defValue
        }
    }

    override fun getFloat(key: String, defValue: Float): Float {
        return if (Utils.isMainProcess()) {
            prefs.getFloat(key, defValue)
        } else synchronized(lock) {
            values[key] as? Float ?: defValue
        }
    }

    override fun getBoolean(key: String, defValue: Boolean): Boolean {
        return if (Utils.isMainProcess()) {
            prefs.getBoolean(key, defValue)
        } else synchronized(lock) {
            values[key] as? Boolean ?: defValue
        }
    }

    override fun contains(key: String): Boolean {
        return if (Utils.isMainProcess()) {
            prefs.contains(key)
        } else synchronized(lock) {
            values.contains(key)
        }
    }

    override fun edit(): SharedPreferences.Editor {
        return EditorImpl(name, prefs.edit())
    }

    override fun registerOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener) {
        listeners.add(WeakReference(listener))
    }

    override fun unregisterOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener) {
        listeners.removeIf { it.get() == listener }
    }

    private class EditorImpl(
        private val prefsName: String,
        private val delegate: SharedPreferences.Editor,
    ) : SharedPreferences.Editor {
        private val editorLock = Any()

        @GuardedBy("editorLock")
        private val editPairs = hashMapOf<String, PrefsPair>()

        @GuardedBy("editorLock")
        private var clear = false

        override fun putString(key: String, value: String?): SharedPreferences.Editor {
            if (Utils.isMainProcess()) {
                delegate.putString(key, value)
            } else synchronized(editorLock) {
                editPairs[key] = PrefsPair(key, value)
            }
            return this
        }

        override fun putStringSet(key: String, values: Set<String>?): SharedPreferences.Editor {
            if (Utils.isMainProcess()) {
                delegate.putStringSet(key, values)
            } else synchronized(editorLock) {
                val value = values?.let { HashSet(it) }
                editPairs[key] = PrefsPair(key, value)
            }
            return this
        }

        override fun putInt(key: String, value: Int): SharedPreferences.Editor {
            if (Utils.isMainProcess()) {
                delegate.putInt(key, value)
            } else synchronized(editorLock) {
                editPairs[key] = PrefsPair(key, value)
            }
            return this
        }

        override fun putLong(key: String, value: Long): SharedPreferences.Editor {
            if (Utils.isMainProcess()) {
                delegate.putLong(key, value)
            } else synchronized(editorLock) {
                editPairs[key] = PrefsPair(key, value)
            }
            return this
        }

        override fun putFloat(key: String, value: Float): SharedPreferences.Editor {
            if (Utils.isMainProcess()) {
                delegate.putFloat(key, value)
            } else synchronized(editorLock) {
                editPairs[key] = PrefsPair(key, value)
            }
            return this
        }

        override fun putBoolean(key: String, value: Boolean): SharedPreferences.Editor {
            if (Utils.isMainProcess()) {
                delegate.putBoolean(key, value)
            } else synchronized(editorLock) {
                editPairs[key] = PrefsPair(key, value)
            }
            return this
        }

        override fun remove(key: String): SharedPreferences.Editor {
            if (Utils.isMainProcess()) {
                delegate.remove(key)
            } else synchronized(editorLock) {
                editPairs[key] = PrefsPair(key, null)
            }
            return this
        }

        override fun clear(): SharedPreferences.Editor {
            if (Utils.isMainProcess()) {
                delegate.clear()
            } else synchronized(editorLock) {
                clear = true
            }
            return this
        }

        override fun commit(): Boolean {
            return if (Utils.isMainProcess()) {
                delegate.commit()
            } else synchronized(editorLock) {
                PreferenceUpdater.update(prefsName, clear, true, ArrayList(editPairs.values))
                true
            }
        }

        override fun apply() {
            if (Utils.isMainProcess()) {
                delegate.apply()
            } else synchronized(editorLock) {
                PreferenceUpdater.update(prefsName, clear, false, ArrayList(editPairs.values))
            }
        }
    }
}
