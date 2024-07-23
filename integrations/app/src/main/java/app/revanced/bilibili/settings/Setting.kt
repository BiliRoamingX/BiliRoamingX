package app.revanced.bilibili.settings

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.utils.*
import java.lang.ref.WeakReference

@Suppress("LeakingThis", "NOTHING_TO_INLINE")
sealed class Setting<out T : Any>(
    @JvmField val key: String,
    @JvmField val defValue: T,
    @JvmField val needReboot: Boolean = false,
    @JvmField val dependency: BooleanSetting? = null,
    private val onChange: ((value: T, async: Boolean) -> Unit)? = null
) {
    protected var value: @UnsafeVariance T = defValue

    init {
        _all.add(this)
        load()
    }

    @JvmSynthetic
    inline operator fun invoke(): T = get()

    protected abstract fun load()

    protected abstract fun saveInternal(newValue: @UnsafeVariance T)

    fun save(newValue: @UnsafeVariance T) {
        if (Utils.isMainProcess()) {
            saveInternal(newValue)
        } else {
            PreferenceUpdater.update(key to newValue)
        }
    }

    fun set(newValue: @UnsafeVariance T) {
        value = newValue
    }

    fun isSetToDefault(): Boolean {
        return value == defValue
    }

    fun restoreToDefault() {
        save(defValue)
    }

    fun get(): T {
        return if (Accounts.userBlocked || (dependency != null && !dependency.get())) defValue else value
    }

    fun executeOnChangeAction(async: Boolean) {
        onChange?.invoke(value, async)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Setting<*>) return false
        return key == other.key
    }

    override fun hashCode() = key.hashCode()

    override fun toString() = "$key: $value"

    companion object {

        private val _all = mutableSetOf<Setting<Any>>()
        val all: Set<Setting<Any>> = _all

        val prefs: SharedPreferences =
            Utils.getContext().getSharedPreferences(Constants.PREFS_SETTING, Context.MODE_PRIVATE)

        private val preferenceChangeListeners =
            mutableListOf<WeakReference<OnSharedPreferenceChangeListener>>()

        private val innerListener = OnSharedPreferenceChangeListener { preferences, key ->
            onPreferenceChanged(preferences, key.orEmpty())
        }

        private var async = true

        init {
            prefs.registerOnSharedPreferenceChangeListener(innerListener)
        }

        fun asyncExecuteOnChangeAction(async: Boolean) {
            this.async = async
        }

        private fun onPreferenceChanged(preferences: SharedPreferences, key: String) {
            Logger.debug { "onPreferenceChanged, key: $key" }
            all.find { it.key == key }?.run {
                load()
                SettingsSyncHelper.sync(key to get())
                executeOnChangeAction(async)
            }
            preferenceChangeListeners.forEach {
                it.get()?.onSharedPreferenceChanged(preferences, key)
            }
        }

        fun notifySettingsChangedForViceProcess(key: String, value: Any) {
            all.find { it.key == key }?.run {
                set(value)
                preferenceChangeListeners.forEach {
                    it.get()?.onSharedPreferenceChanged(prefs, key)
                }
            }
        }

        fun registerPreferenceChangeListener(listener: OnSharedPreferenceChangeListener) {
            preferenceChangeListeners.add(WeakReference(listener))
        }

        fun unregisterPreferenceChangeListener(listener: OnSharedPreferenceChangeListener) {
            preferenceChangeListeners.removeIf { it.get() === listener }
        }
    }
}

class BooleanSetting(
    key: String,
    defValue: Boolean = false,
    needReboot: Boolean = false,
    dependency: BooleanSetting? = null,
    onChange: ((value: Boolean, async: Boolean) -> Unit)? = null
) : Setting<Boolean>(key, defValue, needReboot, dependency, onChange) {
    override fun load() {
        value = prefs.getBoolean(key, defValue)
    }

    override fun saveInternal(newValue: Boolean) {
        value = newValue
        prefs.edit { putBoolean(key, newValue) }
    }
}

class IntSetting(
    key: String,
    defValue: Int = 0,
    needReboot: Boolean = false,
    dependency: BooleanSetting? = null,
    onChange: ((value: Int, async: Boolean) -> Unit)? = null
) : Setting<Int>(key, defValue, needReboot, dependency, onChange) {
    override fun load() {
        value = prefs.getInt(key, defValue)
    }

    override fun saveInternal(newValue: Int) {
        value = newValue
        prefs.edit { putInt(key, newValue) }
    }
}

class LongSetting(
    key: String,
    defValue: Long = 0L,
    needReboot: Boolean = false,
    dependency: BooleanSetting? = null,
    onChange: ((value: Long, async: Boolean) -> Unit)? = null
) : Setting<Long>(key, defValue, needReboot, dependency, onChange) {
    override fun load() {
        value = prefs.getLong(key, defValue)
    }

    override fun saveInternal(newValue: Long) {
        value = newValue
        prefs.edit { putLong(key, newValue) }
    }
}

class FloatSetting(
    key: String,
    defValue: Float = 0.0f,
    needReboot: Boolean = false,
    dependency: BooleanSetting? = null,
    onChange: ((value: Float, async: Boolean) -> Unit)? = null
) : Setting<Float>(key, defValue, needReboot, dependency, onChange) {
    override fun load() {
        value = prefs.getFloat(key, defValue)
    }

    override fun saveInternal(newValue: Float) {
        value = newValue
        prefs.edit { putFloat(key, newValue) }
    }
}

class StringSetting(
    key: String,
    defValue: String = "",
    needReboot: Boolean = false,
    dependency: BooleanSetting? = null,
    onChange: ((value: String, async: Boolean) -> Unit)? = null
) : Setting<String>(key, defValue, needReboot, dependency, onChange) {
    override fun load() {
        value = prefs.getString(key, defValue).orEmpty()
    }

    override fun saveInternal(newValue: String) {
        value = newValue
        prefs.edit { putString(key, newValue) }
    }
}

class StringSetSetting(
    key: String,
    defValue: Set<String> = setOf(),
    needReboot: Boolean = false,
    dependency: BooleanSetting? = null,
    onChange: ((value: Set<String>, async: Boolean) -> Unit)? = null
) : Setting<Set<String>>(key, defValue, needReboot, dependency, onChange) {
    override fun load() {
        value = prefs.getStringSet(key, defValue).orEmpty()
    }

    override fun saveInternal(newValue: Set<String>) {
        value = newValue
        prefs.edit { putStringSet(key, newValue) }
    }

    fun append(newValue: String) {
        save(value + newValue)
    }
}
