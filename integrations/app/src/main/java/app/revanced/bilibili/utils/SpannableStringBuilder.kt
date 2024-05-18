/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.revanced.bilibili.utils

import android.graphics.Typeface.BOLD
import android.graphics.Typeface.ITALIC
import android.text.Layout.Alignment
import android.text.Spannable.SPAN_INCLUSIVE_EXCLUSIVE
import android.text.SpannableStringBuilder
import android.text.SpannedString
import android.text.TextPaint
import android.text.style.*
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.FloatRange
import androidx.core.text.inSpans

/**
 * Builds new string by populating a newly created [SpannableStringBuilder] using the provided
 * [builderAction] and then converting it to [SpannedString].
 */
inline fun buildSpannedString(
    builderAction: SpannableStringBuilder.() -> Unit
): SpannedString {
    val builder = SpannableStringBuilder()
    builder.builderAction()
    return SpannedString(builder)
}

/**
 * Wrap appended text in [builderAction] in [spans].
 *
 * Note: the spans will only have the correct position if the [builderAction] only appends or
 * replaces text. Inserting, deleting, or clearing the text will cause the span to be placed at
 * an incorrect position.
 */
inline fun SpannableStringBuilder.inSpans(
    vararg spans: Any,
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder {
    val start = length
    builderAction()
    for (span in spans) setSpan(span, start, length, SPAN_INCLUSIVE_EXCLUSIVE)
    return this
}

/**
 * Wrap appended text in [builderAction] in [span].
 *
 * Note: the span will only have the correct position if the `builderAction` only appends or
 * replaces text. Inserting, deleting, or clearing the text will cause the span to be placed at
 * an incorrect position.
 */
inline fun SpannableStringBuilder.inSpans(
    span: Any,
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder {
    val start = length
    builderAction()
    setSpan(span, start, length, SPAN_INCLUSIVE_EXCLUSIVE)
    return this
}

/**
 * Wrap appended text in [builderAction] in a bold [StyleSpan].
 *
 * @see SpannableStringBuilder.inSpans
 */
inline fun SpannableStringBuilder.bold(
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(StyleSpan(BOLD), builderAction = builderAction)

/**
 * Wrap appended text in [builderAction] in an italic [StyleSpan].
 *
 * @see SpannableStringBuilder.inSpans
 */
inline fun SpannableStringBuilder.italic(
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(StyleSpan(ITALIC), builderAction = builderAction)

/**
 * Wrap appended text in [builderAction] in an [UnderlineSpan].
 *
 * @see SpannableStringBuilder.inSpans
 */
inline fun SpannableStringBuilder.underline(
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(UnderlineSpan(), builderAction = builderAction)

/**
 * Wrap appended text in [builderAction] in a [ForegroundColorSpan].
 *
 * @see SpannableStringBuilder.inSpans
 */
inline fun SpannableStringBuilder.color(
    @ColorInt color: Int,
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(ForegroundColorSpan(color), builderAction = builderAction)

/**
 * Wrap appended text in [builderAction] in a [BackgroundColorSpan].
 *
 * @see SpannableStringBuilder.inSpans
 */
inline fun SpannableStringBuilder.backgroundColor(
    @ColorInt color: Int,
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(BackgroundColorSpan(color), builderAction = builderAction)

/**
 * Wrap appended text in [builderAction] in a [StrikethroughSpan].
 *
 * @see SpannableStringBuilder.inSpans
 */
inline fun SpannableStringBuilder.strikeThrough(
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(StrikethroughSpan(), builderAction = builderAction)

/**
 * Wrap appended text in [builderAction] in a [RelativeSizeSpan].
 *
 * @see SpannableStringBuilder.inSpans
 */
inline fun SpannableStringBuilder.scale(
    proportion: Float,
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(RelativeSizeSpan(proportion), builderAction = builderAction)

/**
 * Wrap appended text in [builderAction] in a [SuperscriptSpan].
 *
 * @see SpannableStringBuilder.inSpans
 */
inline fun SpannableStringBuilder.superscript(
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(SuperscriptSpan(), builderAction = builderAction)

/**
 * Wrap appended text in [builderAction] in a [SubscriptSpan].
 *
 * @see SpannableStringBuilder.inSpans
 */
inline fun SpannableStringBuilder.subscript(
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(SubscriptSpan(), builderAction = builderAction)

inline fun SpannableStringBuilder.clickable(
    @ColorInt color: Int,
    underline: Boolean = false,
    crossinline onClick: (View) -> Unit,
    builderAction: SpannableStringBuilder.() -> Unit
) = inSpans(object : ClickableSpan() {
    override fun onClick(widget: View) = onClick(widget)
    override fun updateDrawState(ds: TextPaint) {
        ds.color = color
        ds.isUnderlineText = underline
    }
}, builderAction = builderAction)

inline fun SpannableStringBuilder.relativeSize(
    @FloatRange(from = 0.0) proportion: Float,
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(RelativeSizeSpan(proportion), builderAction = builderAction)

inline fun SpannableStringBuilder.absoluteSize(
    size: Int,
    dp: Boolean = false,
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(AbsoluteSizeSpan(size, dp), builderAction = builderAction)

inline fun SpannableStringBuilder.align(
    align: Alignment,
    builderAction: SpannableStringBuilder.() -> Unit
): SpannableStringBuilder = inSpans(AlignmentSpan.Standard(align), builderAction = builderAction)
