package app.revanced.bilibili.settings;

import static java.lang.Boolean.FALSE;
import static app.revanced.bilibili.settings.Settings.ValueType.BOOLEAN;
import static app.revanced.bilibili.settings.Settings.ValueType.INTEGER;
import static app.revanced.bilibili.settings.Settings.ValueType.LONG;
import static app.revanced.bilibili.settings.Settings.ValueType.STRING;
import static app.revanced.bilibili.settings.Settings.ValueType.STRING_SET;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import app.revanced.bilibili.utils.Constants;
import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.Utils;


public enum Settings {
    DEBUG("debug", BOOLEAN, FALSE),
    HALF_SCREEN_QUALITY("half_screen_quality", STRING, "0"),
    FULL_SCREEN_QUALITY("full_screen_quality", STRING, "0"),
    FORCE_OLD_PLAYER("force_old_player", BOOLEAN, FALSE, true),

    DISABLE_STORY_FULL("disable_story_full", BOOLEAN, FALSE),
    SHOWING_DRAWER_ITEMS("showing_drawer_items", STRING_SET, Set.of(Constants.ALL_VALUE)),
    PURIFY_DRAWER_RED_DOT("purify_drawer_reddot", BOOLEAN, FALSE),
    DRAWER_STYLE("drawer_style_value", STRING, "0"),
    REMOVE_VIP_SECTION("remove_vip_section", BOOLEAN, FALSE, true),
    REMOVE_CMD_DMS("remove_video_cmd_dms", BOOLEAN, FALSE),
    SHOWING_BOTTOM_ITEMS("showing_bottom_items", STRING_SET, Set.of(Constants.ALL_VALUE)),
    DRAWER("drawer", BOOLEAN, FALSE),
    PURIFY_GAME("purify_game", BOOLEAN, FALSE),
    ADD_BANGUMI("add_bangumi", BOOLEAN, FALSE),
    ADD_MOVIE("add_movie", BOOLEAN, FALSE),
    ADD_KOREA("add_korea", BOOLEAN, FALSE),
    HIDED_HOME_TAB("customize_home_tab", STRING_SET, Collections.EMPTY_SET),
    FILTER_HOME_RECOMMEND("customize_home_recommend", STRING_SET, Collections.EMPTY_SET),
    LOW_PLAY_COUNT_LIMIT("hide_low_play_count_recommend_limit", LONG, 0L),
    SHORT_DURATION_LIMIT("hide_short_duration_recommend_limit", INTEGER, 0),
    LONG_DURATION_LIMIT("hide_long_duration_recommend_limit", INTEGER, 0),
    HOME_RCMD_FILTER_TITLE("home_filter_keywords_title", STRING_SET, Collections.EMPTY_SET),
    HOME_RCMD_FILTER_TITLE_REGEX_MODE("home_filter_title_regex_mode", BOOLEAN, FALSE),
    HOME_RCMD_FILTER_REASON("home_filter_keywords_reason", STRING_SET, Collections.EMPTY_SET),
    HOME_RCMD_FILTER_REASON_REGEX_MODE("home_filter_reason_regex_mode", BOOLEAN, FALSE),
    HOME_RCMD_FILTER_UID("home_filter_keywords_uid", STRING_SET, Collections.EMPTY_SET),
    HOME_RCMD_FILTER_UP("home_filter_keywords_up", STRING_SET, Collections.EMPTY_SET),
    HOME_RCMD_FILTER_UP_REGEX_MODE("home_filter_up_regex_mode", BOOLEAN, FALSE),
    HOME_RCMD_FILTER_CATEGORY("home_filter_keywords_category", STRING_SET, Collections.EMPTY_SET),
    HOME_RCMD_FILTER_CHANNEL("home_filter_keywords_channel", STRING_SET, Collections.EMPTY_SET),
    HOME_DISABLE_AUTO_REFRESH("disable_auto_refresh", BOOLEAN, FALSE),
    HOME_FILTER_APPLY_TO_VIDEO("home_filter_apply_to_relate", BOOLEAN, FALSE),

    TEENAGER_MODE_DIALOG("teenagers_mode_dialog", BOOLEAN, FALSE),
    REPLACE_STORY_VIDEO("replace_story_video", BOOLEAN, FALSE),
    FORBID_SWITCH_LIVE_ROOM("forbid_switch_live_room", BOOLEAN, FALSE),
    BLOCK_WORD_SEARCH("block_word_search", BOOLEAN, FALSE),
    BLOCK_UP_RCMD_ADS("block_up_rcmd_ads", BOOLEAN, FALSE),
    PURIFY_SPLASH("purify_splash", BOOLEAN, FALSE),
    PURIFY_SEARCH("purify_search", BOOLEAN, FALSE),
    PURIFY_LIVE_POPUPS("purify_live_popups", STRING_SET, Collections.EMPTY_SET);

    public static final String PREFS_NAME = "biliroaming";

    public static final SharedPreferences prefs;

    @NonNull
    public final String key;
    @NonNull
    public final ValueType valueType;
    @NonNull
    public final Object defValue;
    /**
     * If the app should be rebooted, if this setting is changed
     */
    public final boolean needReboot;

    private Object value;

    Settings(String key, ValueType valueType, Object defValue) {
        this(key, valueType, defValue, false);
    }

    Settings(@NonNull String key, @NonNull ValueType valueType, @NonNull Object defValue, boolean needReboot) {
        this.key = key;
        this.valueType = valueType;
        this.defValue = defValue;
        this.needReboot = needReboot;
    }

    static {
        Context context = Utils.getContext();
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        loadAllSettings();
    }

    private static void loadAllSettings() {
        try {
            for (Settings setting : values())
                setting.load(prefs);
        } catch (Exception ex) {
            LogHelper.error(() -> "Failed to load settings", ex);
        }
    }

    @SuppressWarnings("unchecked")
    private void load(SharedPreferences prefs) {
        try {
            switch (valueType) {
                case BOOLEAN:
                    setValue(prefs.getBoolean(key, (Boolean) defValue));
                    break;
                case INTEGER:
                    setValue(prefs.getInt(key, (Integer) defValue));
                    break;
                case LONG:
                    setValue(prefs.getLong(key, (Long) defValue));
                    break;
                case FLOAT:
                    setValue(prefs.getFloat(key, (Float) defValue));
                    break;
                case STRING:
                    setValue(prefs.getString(key, (String) defValue));
                    break;
                case STRING_SET:
                    setValue(prefs.getStringSet(key, (Set<String>) defValue));
                    break;
                default:
                    throw new IllegalStateException(name());
            }
            LogHelper.debug(() -> String.format("Loaded setting '%s' with value %s", name(), value));
        } catch (ClassCastException ex) {
            LogHelper.error(() -> "Failed to read value", ex);
        }
    }

    /**
     * Sets, but does _not_ persistently save the value.
     * <p>
     * This intentionally is a static method, to deter accidental usage
     * when {@link #saveValue(Object)} was intended.
     */
    public static void setValue(Settings setting, Object newValue) {
        setting.setValue(newValue);
    }

    private void setValue(Object newValue) {
        switch (valueType) {
            case FLOAT:
            case LONG:
            case INTEGER:
            case BOOLEAN:
            case STRING:
            case STRING_SET:
                value = newValue;
                break;
            default:
                throw new IllegalStateException(name());
        }
    }

    @SuppressWarnings("unchecked")
    public void saveValue(Object newValue) {
        SharedPreferences.Editor editor = prefs.edit();
        switch (valueType) {
            case BOOLEAN:
                editor.putBoolean(key, (Boolean) newValue);
                break;
            case INTEGER:
                editor.putInt(key, (Integer) newValue);
                break;
            case LONG:
                editor.putLong(key, (Long) newValue);
                break;
            case FLOAT:
                editor.putFloat(key, (Float) newValue);
                break;
            case STRING:
                editor.putString(key, (String) newValue);
                break;
            case STRING_SET:
                editor.putStringSet(key, (Set<String>) newValue);
                break;
            default:
                throw new IllegalStateException(name());
        }
        editor.apply();
        setValue(newValue);
    }

    public void appendValue(String value) {
        var stringSet = getStringSet();
        var newSet = new HashSet<>(stringSet);
        newSet.add(value);
        saveValue(newSet);
    }

    public boolean getBoolean() {
        return (Boolean) value;
    }

    public int getInt() {
        return (Integer) value;
    }

    public long getLong() {
        return (Long) value;
    }

    public float getFloat() {
        return (Float) value;
    }

    public String getString() {
        return (String) value;
    }

    @SuppressWarnings("unchecked")
    public Set<String> getStringSet() {
        return (Set<String>) value;
    }

    @NonNull
    public Object getValue() {
        return value;
    }

    public static void onPreferenceChanged(SharedPreferences preferences, String key) {
        for (Settings settings : values()) {
            if (settings.key.equals(key)) {
                switch (settings.valueType) {
                    case BOOLEAN:
                        boolean newBool = preferences.getBoolean(key, settings.getBoolean());
                        Settings.setValue(settings, newBool);
                        break;
                    case INTEGER:
                        int newInt = preferences.getInt(key, settings.getInt());
                        Settings.setValue(settings, newInt);
                        break;
                    case LONG:
                        long newLong = preferences.getLong(key, settings.getLong());
                        Settings.setValue(settings, newLong);
                        break;
                    case FLOAT:
                        float newFloat = preferences.getFloat(key, settings.getFloat());
                        Settings.setValue(settings, newFloat);
                        break;
                    case STRING:
                        String newStr = preferences.getString(key, settings.getString());
                        Settings.setValue(settings, newStr);
                        break;
                    case STRING_SET:
                        Set<String> newSet = preferences.getStringSet(key, settings.getStringSet());
                        Settings.setValue(settings, newSet);
                        break;
                    default:
                        throw new IllegalStateException(settings.name());
                }
                break;
            }
        }
    }

    public enum ValueType {
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING,
        STRING_SET,
    }
}
