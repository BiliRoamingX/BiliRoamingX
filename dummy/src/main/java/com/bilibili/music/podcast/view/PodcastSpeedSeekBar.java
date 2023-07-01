package com.bilibili.music.podcast.view;

import android.content.Context;

import androidx.appcompat.widget.AppCompatSeekBar;

import java.util.Collections;
import java.util.List;

import kotlin.Pair;

public class PodcastSpeedSeekBar extends AppCompatSeekBar {
    public PodcastSpeedSeekBar(Context context) {
        super(context);
    }

    // method will added by patcher
    public List<Pair<Float, String>> getSpeedNameListForBiliRoaming() {
        return Collections.emptyList();
    }

    // method will added by patcher
    public void setSpeedArrayForBiliRoaming(float[] array) {
    }
}
