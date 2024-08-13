package app.revanced.bilibili.patches

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.annotation.Keep
import androidx.fragment.app.Fragment
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.findView
import com.bilibili.app.authorspace.api.BiliMemberCard
import tv.danmaku.bili.ui.main2.api.AccountMine

@Keep
@SuppressLint("SetTextI18n")
object NumberFormatPatch {
    @JvmStatic
    fun onMineBindAccountState(fragment: Fragment, accountMine: AccountMine?) {
        if (!Settings.NumberFormat()) return
        val view = fragment.view ?: return
        if (accountMine == null || !Accounts.isLogin) return

        val followingCount = view.findView<TextView>("following_count")
        val attentionCount = view.findView<TextView>("attention_count")
        val fansCount = view.findView<TextView>("fans_count")

        followingCount.text = accountMine.dynamic.toString()
        attentionCount.text = accountMine.following.toString()
        fansCount.text = accountMine.follower.toString()
    }

    @JvmStatic
    fun onSpaceBindAccountState(fragment: Fragment, memberCard: BiliMemberCard?) {
        if (!Settings.NumberFormat()) return
        val view = fragment.view ?: return
        memberCard ?: return

        val fans = view.findView<TextView>("fans")
        val attentions = view.findView<TextView>("attentions")
        val likes = view.findView<TextView>("likes")

        fans.text = memberCard.mFollowers.toString()
        attentions.text = memberCard.mFollowings.toString()
        likes.text = memberCard.likes?.likeNum?.toString().orEmpty().ifEmpty { "-" }
    }
}
