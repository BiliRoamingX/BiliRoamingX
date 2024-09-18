package app.revanced.bilibili.patches

import android.os.Parcelable
import android.view.HapticFeedbackConstants
import android.view.View
import androidx.annotation.Keep
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bilibili.lib.imageviewer.fragment.ImageFragment

object CommentImagePatch {
    @Keep
    @JvmStatic
    fun bindClickListener(fragment: ImageFragment) {
        if (!Settings.SaveCommentImage() && !Versions.ge7_76_0()) return
        val imageItem = fragment.arguments?.parcelable<Parcelable>("image_item") ?: return
        val field = Reflex.findFirstFieldByExactTypeOrNull(
            imageItem.javaClass.superclass, String::class.java
        )?.name ?: return
        val imageUrl = imageItem.getFieldAs<String?>(field).orEmpty().substringBefore('@')
            .takeIf { it.startsWith("http") } ?: return
        fragment.view?.findView<View>("image_view")?.setOnLongClickListener {
            it.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS)
            saveImage(imageUrl)
            true
        }
    }

    @Keep
    @JvmStatic
    fun onCommentImageClick(pictures: List<*>, index: Int) {
        val imageViewerModelClass = runCatchingOrNull {
            Class.forName("com.bilibili.lib.imageviewer.ImageViewerModel")
        } ?: return
        val picturesField = imageViewerModelClass.declaredFields.first { it.type == List::class.java }
        val indexField = imageViewerModelClass.declaredFields.first { it.type == Int::class.javaPrimitiveType }
        val flagFields = imageViewerModelClass.declaredFields.filter {
            it.type == Boolean::class.javaPrimitiveType
        }.take(2)
        val goMethod = imageViewerModelClass.declaredMethods.first {
            it.returnType == Void.TYPE && it.parameterTypes.isEmpty()
        }
        imageViewerModelClass.new(ApplicationDelegate.getTopActivity()).apply {
            setField(picturesField.name, pictures)
            setField(indexField.name, index)
            flagFields.forEach { setField(it.name, true) }
            callMethod(goMethod.name)
        }
    }
}
