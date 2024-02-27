package app.revanced.bilibili.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;

import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceManager;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import app.revanced.bilibili.utils.Utils;

public class CheckBoxGroupPreference extends PreferenceCategory implements CheckBoxButtonPreference.OnPreferenceClickListener {
    private CharSequence[] mEntries;
    private CharSequence[] mEntryValues;
    private CharSequence[] mEntrySummaries;

    private OnPreferenceItemClickListener mItemClickListener;

    private final Set<String> mValues = new HashSet<>();

    private final static int sSummariesAttr;

    static {
        // borrowed from tv.danmaku.bili.widget.RadioGroupPreference
        sSummariesAttr = Utils.getResId("radioEntrySummaries", "attr");
    }

    public interface OnPreferenceItemClickListener {
        boolean onItemClick(CheckBoxGroupPreference groupPreference, CheckBoxButtonPreference itemPreference);
    }

    public CheckBoxGroupPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPreference(context, attrs);
    }

    public CheckBoxGroupPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPreference(context, attrs);
    }

    private void initPreference(Context context, AttributeSet attrs) {
        int[] attr = new int[]{android.R.attr.entries, android.R.attr.entryValues, sSummariesAttr};
        TypedArray ta = context.obtainStyledAttributes(attrs, attr);
        mEntries = ta.getTextArray(0);
        mEntryValues = ta.getTextArray(1);
        mEntrySummaries = ta.getTextArray(2);
        ta.recycle();
    }

    public CheckBoxGroupPreference(@NonNull Context context) {
        this(context, null);
    }

    public CharSequence[] getEntries() {
        return mEntries;
    }

    public void setEntries(CharSequence[] entries) {
        mEntries = entries;
    }

    public void setEntries(@ArrayRes int entriesResId) {
        setEntries(getContext().getResources().getTextArray(entriesResId));
    }

    public CharSequence[] getEntryValues() {
        return mEntryValues;
    }

    public void setEntryValues(CharSequence[] entryValues) {
        mEntryValues = entryValues;
    }

    public void setEntryValues(@ArrayRes int entryValuesResId) {
        setEntryValues(getContext().getResources().getTextArray(entryValuesResId));
    }

    public CharSequence[] getEntrySummaries() {
        return mEntrySummaries;
    }

    public void setEntrySummaries(CharSequence[] entrySummaries) {
        mEntrySummaries = entrySummaries;
    }

    public void setEntrySummaries(@ArrayRes int entrySummariesResId) {
        setEntrySummaries(getContext().getResources().getTextArray(entrySummariesResId));
    }

    public OnPreferenceItemClickListener getItemClickListener() {
        return mItemClickListener;
    }

    public void setItemClickListener(OnPreferenceItemClickListener itemClickListener) {
        mItemClickListener = itemClickListener;
    }

    public CheckBoxButtonPreference findPreferenceByCheckBoxValue(String value) {
        for (int i = 0; i < getPreferenceCount(); i++) {
            Preference preference = getPreference(i);
            if (preference instanceof CheckBoxButtonPreference buttonPreference) {
                String prefValue = (buttonPreference).getValue();
                if (value.equals(prefValue))
                    return buttonPreference;
            }
        }
        return null;
    }

    @Nullable
    @Override
    protected Object onGetDefaultValue(@NonNull TypedArray a, int index) {
        CharSequence[] defaultValues = a.getTextArray(index);
        Set<String> result = new HashSet<>();
        for (CharSequence defaultValue : defaultValues)
            result.add(defaultValue.toString());
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void onSetInitialValue(@Nullable Object defaultValue) {
        setValues(getPersistedStringSet((Set<String>) defaultValue));
    }

    public Set<String> getValues() {
        return mValues;
    }

    public void setValues(Set<String> values) {
        mValues.clear();
        mValues.addAll(values);

        persistStringSet(values);
        checkPreferenceState();
    }

    private void checkPreferenceState() {
        for (int i = 0; i < getPreferenceCount(); i++) {
            Preference preference = getPreference(i);
            if (preference instanceof CheckBoxButtonPreference buttonPreference) {
                String value = buttonPreference.getValue();
                buttonPreference.setChecked(mValues.contains(value));
            }
        }
    }

    @Override
    public void notifyChanged() {
        onAttachedToHierarchy(getPreferenceManager());
    }

    @Override
    protected boolean onPrepareAddPreference(@NonNull Preference preference) {
        if (preference instanceof CheckBoxButtonPreference buttonPreference && super.onPrepareAddPreference(preference)) {
            buttonPreference.setPreferenceClickListener(this);
            return true;
        }
        return false;
    }

    @Override
    protected void onAttachedToHierarchy(@NonNull PreferenceManager preferenceManager) {
        removeAll();
        super.onAttachedToHierarchy(preferenceManager);
        CharSequence[] entries = mEntries;
        CharSequence[] values = mEntryValues;
        CharSequence[] summaries = mEntrySummaries;
        if (entries == null || entries.length == 0)
            return;
        for (int i = 0; i < entries.length; i++) {
            CharSequence entry = entries[i];
            if (TextUtils.isEmpty(entry))
                continue;
            CheckBoxButtonPreference preference = new CheckBoxButtonPreference(getContext());
            preference.setTitle(entry);
            preference.setPersistent(false);
            if (values == null || i >= values.length)
                continue;
            CharSequence value = values[i];
            if (!TextUtils.isEmpty(value))
                preference.setValue(value.toString());
            if (summaries != null && summaries.length > 0 && i < summaries.length) {
                CharSequence summary = summaries[i];
                if (!TextUtils.isEmpty(summary))
                    preference.setSummary(summary);
            }
            addPreference(preference);
        }
        checkPreferenceState();
    }

    @Override
    public void onPreferenceClick(CheckBoxButtonPreference preference) {
        if (mItemClickListener == null || !mItemClickListener.onItemClick(this, preference)) {
            String value = preference.getValue();
            Set<String> newValues = new HashSet<>(mValues);
            if (preference.isChecked()) {
                newValues.add(value);
            } else {
                newValues.remove(value);
            }
            setValues(newValues);
        }
    }

    @NonNull
    @Override
    protected Parcelable onSaveInstanceState() {
        final Parcelable superState = super.onSaveInstanceState();
        if (isPersistent()) {
            // No need to save instance state
            return superState;
        }

        final SavedState myState = new SavedState(superState);
        myState.mValues = getValues();
        return myState;
    }

    @Override
    protected void onRestoreInstanceState(@Nullable Parcelable state) {
        if (state == null || !state.getClass().equals(SavedState.class)) {
            // Didn't save state for us in onSaveInstanceState
            super.onRestoreInstanceState(state);
            return;
        }

        SavedState myState = (SavedState) state;
        super.onRestoreInstanceState(myState.getSuperState());
        setValues(myState.mValues);
    }

    private static class SavedState extends BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<>() {
            @Override
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }

            @Override
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };

        Set<String> mValues;

        SavedState(Parcel source) {
            super(source);
            final int size = source.readInt();
            mValues = new HashSet<>();
            String[] strings = new String[size];
            source.readStringArray(strings);

            Collections.addAll(mValues, strings);
        }

        SavedState(Parcelable superState) {
            super(superState);
        }

        @Override
        public void writeToParcel(@NonNull Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(mValues.size());
            dest.writeStringArray(mValues.toArray(new String[0]));
        }
    }
}
