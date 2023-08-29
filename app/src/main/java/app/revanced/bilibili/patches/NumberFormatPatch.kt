package app.revanced.bilibili.patches

import android.widget.TextView
import androidx.fragment.app.Fragment
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.findViewByIdName
import com.bilibili.app.authorspace.api.BiliMemberCard
import tv.danmaku.bili.ui.main2.api.AccountMine

object NumberFormatPatch {
    @JvmStatic
    fun onMineBindAccountState(fragment: Fragment, accountMine: AccountMine?) {
        if (!Settings.NUMBER_FORMAT.boolean) return
        val view = fragment.view ?: return
        if (accountMine == null || !Utils.isLogin()) return

        val followingCount = view.findViewByIdName<TextView>("following_count")
        val attentionCount = view.findViewByIdName<TextView>("attention_count")
        val fansCount = view.findViewByIdName<TextView>("fans_count")

        followingCount.text = accountMine.dynamic.toString()
        attentionCount.text = accountMine.following.toString()
        fansCount.text = accountMine.follower.toString()
    }

    @JvmStatic
    fun onSpaceBindAccountState(fragment: Fragment, memberCard: BiliMemberCard?) {
        if (!Settings.NUMBER_FORMAT.boolean) return
        val view = fragment.view ?: return
        memberCard ?: return

        val fans = view.findViewByIdName<TextView>("fans")
        val attentions = view.findViewByIdName<TextView>("attentions")
        val likes = view.findViewByIdName<TextView>("likes")

        fans.text = memberCard.mFollowers.toString()
        attentions.text = memberCard.mFollowings.toString()
        likes.text = memberCard.likes?.likeNum?.toString().orEmpty().ifEmpty { "-" }
    }
}
