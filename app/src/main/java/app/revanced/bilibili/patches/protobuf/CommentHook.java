package app.revanced.bilibili.patches.protobuf;

import com.bapis.bilibili.main.community.reply.v1.EmptyPage;
import com.bapis.bilibili.main.community.reply.v1.EmptyPageEx;
import com.bapis.bilibili.main.community.reply.v1.MainListReply;
import com.bapis.bilibili.main.community.reply.v1.SubjectControl;
import com.bapis.bilibili.main.community.reply.v1.SubjectControlEx;
import com.bapis.bilibili.main.community.reply.v1.TextStyle;
import com.bilibili.lib.moss.api.MossResponseHandler;

@SuppressWarnings({"unchecked", "rawtypes"})
public class CommentHook {
    public static void blockVideoComment(MossResponseHandler handler) {
        var textStyle = TextStyle.newBuilder()
                .setFontSize(14)
                .setTextDayColor("#FF61666D")
                .setTextNightColor("#FFA2A7AE")
                .build();
        var text = EmptyPage.Text.newBuilder()
                .setRaw("评论区已由漫游屏蔽")
                .setStyle(textStyle)
                .build();
        var emptyPage = EmptyPage.newBuilder()
                .setImageUrl("https://i0.hdslb.com/bfs/app-res/android/img_holder_forbid_style1.webp")
                .addTexts(text)
                .build();
        var subjectControl = SubjectControl.newBuilder()
                .setEmptyPage(emptyPage)
                .build();
        var reply = MainListReply.newBuilder()
                .setSubjectControl(subjectControl)
                .build();
        handler.onNext(reply);
    }

    public static void blockCommentGuide(MainListReply reply) {
        var subjectControl = reply.getSubjectControl();
        SubjectControlEx.clearEmptyBackgroundTextPlain(subjectControl);
        SubjectControlEx.clearEmptyBackgroundTextHighlight(subjectControl);
        SubjectControlEx.clearEmptyBackgroundUri(subjectControl);
        var emptyPage = subjectControl.getEmptyPage();
        EmptyPageEx.clearLeftButton(emptyPage);
        EmptyPageEx.clearRightButton(emptyPage);
        var textsList = emptyPage.getTextsList();
        if (textsList.size() > 1) {
            EmptyPageEx.clearTexts(emptyPage);
            var textStyle = TextStyle.newBuilder()
                    .setFontSize(14)
                    .setTextDayColor("#FF61666D")
                    .setTextNightColor("#FFA2A7AE")
                    .build();
            var text = EmptyPage.Text.newBuilder()
                    .setRaw("还没有评论哦")
                    .setStyle(textStyle)
                    .build();
            EmptyPageEx.addTexts(emptyPage, text);
        }
    }
}
