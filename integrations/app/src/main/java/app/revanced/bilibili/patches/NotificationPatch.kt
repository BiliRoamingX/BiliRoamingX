package app.revanced.bilibili.patches

import android.annotation.SuppressLint
import android.app.Notification.Builder
import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.annotation.Keep
import app.revanced.bilibili.utils.Utils

object NotificationPatch {
    @Keep
    @JvmStatic
    fun setSmallIcon(builder: Builder, @DrawableRes icon: Int): Builder {
        return if (icon == Utils.getContext().applicationInfo.icon) {
            builder.setSmallIcon(Utils.getResId("ic_notify_msg", "drawable"))
        } else {
            builder.setSmallIcon(icon)
        }
    }

    @Keep
    @JvmStatic
    @SuppressLint("NewApi")
    fun setSmallIcon(builder: Builder, icon: Icon): Builder {
        return if (icon.type == Icon.TYPE_RESOURCE && icon.resId == Utils.getContext().applicationInfo.icon) {
            builder.setSmallIcon(Utils.getResId("ic_notify_msg", "drawable"))
        } else {
            builder.setSmallIcon(icon)
        }
    }
}
