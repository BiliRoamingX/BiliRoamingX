package app.revanced.bilibili.patches.protobuf;

import android.text.TextUtils;

import com.bapis.bilibili.app.dynamic.v2.CardVideoDynList;
import com.bapis.bilibili.app.dynamic.v2.CardVideoDynListEx;
import com.bapis.bilibili.app.dynamic.v2.Description;
import com.bapis.bilibili.app.dynamic.v2.DynTab;
import com.bapis.bilibili.app.dynamic.v2.DynTabReply;
import com.bapis.bilibili.app.dynamic.v2.DynTabReplyEx;
import com.bapis.bilibili.app.dynamic.v2.DynamicItem;
import com.bapis.bilibili.app.dynamic.v2.DynamicList;
import com.bapis.bilibili.app.dynamic.v2.DynamicListEx;
import com.bapis.bilibili.app.dynamic.v2.Extend;
import com.bapis.bilibili.app.dynamic.v2.Module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.ArrayUtils;

public class DynamicHook {
    private static Set<String> cachedContentSet = Collections.emptySet();
    private static List<Pattern> cachedContentRegexes = Collections.emptyList();

    public static void purifyDynTabs(DynTabReply dynTabReply) {
        List<DynTab> dynTabList = dynTabReply.getDynTabList();
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < dynTabList.size(); i++) {
            DynTab dynTab = dynTabList.get(i);
            if (Settings.DYNAMIC_PURIFY_CITY.getBoolean() && dynTab.getCityId() != 0L)
                idxList.add(i);
            else if (Settings.DYNAMIC_PURIFY_CAMPUS.getBoolean() && dynTab.getAnchor().equals("campus"))
                idxList.add(i);
        }
        for (int i = idxList.size() - 1; i >= 0; i--)
            DynTabReplyEx.removeDynTab(dynTabReply, idxList.get(i));
    }

    public static void filterDynamicForAll(DynamicList list) {
        List<Integer> idxList = getToRemoveDynamicIdxList(list.getListList());
        for (int i = idxList.size() - 1; i >= 0; i--)
            DynamicListEx.removeList(list, idxList.get(i));
    }

    public static void filterDynamicForVideo(CardVideoDynList list) {
        List<Integer> idxList = getToRemoveDynamicIdxList(list.getListList());
        for (int i = idxList.size() - 1; i >= 0; i--)
            CardVideoDynListEx.removeList(list, idxList.get(i));
    }

    private static List<Integer> getToRemoveDynamicIdxList(List<DynamicItem> items) {
        Set<String> contentSet = Settings.DYNAMIC_PURIFY_CONTENT.getStringSet();
        boolean contentRegexMode = Settings.DYNAMIC_PURIFY_CONTENT_REGEX_MODE.getBoolean();
        List<Pattern> contentRegexes;
        if (contentRegexMode && cachedContentSet.equals(contentSet)) {
            contentRegexes = cachedContentRegexes;
        } else if (contentRegexMode) {
            cachedContentSet = new HashSet<>(contentSet);
            contentRegexes = contentSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedContentRegexes = contentRegexes;
        } else {
            contentRegexes = Collections.emptyList();
        }
        Set<String> typeSet = Settings.DYNAMIC_PURIFY_TYPE.getStringSet();
        Set<String> ups = Settings.DYNAMIC_PURIFY_UP.getStringSet();
        Set<String> uidSet = Settings.DYNAMIC_PURIFY_UID.getStringSet();
        Set<String> topics = Settings.DYNAMIC_PURIFY_TOPIC.getStringSet();
        boolean rmBlocked = Settings.DYNAMIC_RM_BLOCKED.getBoolean();
        int[] typeArray = ArrayUtils.toIntArray(typeSet);
        long[] uidArray = ArrayUtils.toLongArray(uidSet);
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            DynamicItem item = items.get(i);
            int cardType = item.getCardTypeValue();
            if (typeArray.length > 0 && ArrayUtils.contains(typeArray, cardType)) {
                idxList.add(i);
                continue;
            }

            Extend extend = item.getExtend();
            if (rmBlocked && extend.hasOnlyFansProperty()
                    && !extend.getOnlyFansProperty().getHasPrivilege()) {
                idxList.add(i);
                continue;
            }

            if (!contentSet.isEmpty()) {
                String text = item.getModulesList().stream()
                        .filter(Module::hasModuleDesc).findFirst()
                        .map(module -> module.getModuleDesc().getText()).orElse(null);
                if (isContentShouldBlock(text, contentRegexMode, contentSet, contentRegexes)) {
                    idxList.add(i);
                    continue;
                }
                String orig = extend.getOrigDescList().stream()
                        .map(Description::getOrigText)
                        .collect(Collectors.joining());
                if (isContentShouldBlock(orig, contentRegexMode, contentSet, contentRegexes)) {
                    idxList.add(i);
                    continue;
                }
                String desc = extend.getDescList().stream()
                        .map(Description::getOrigText)
                        .collect(Collectors.joining());
                if (isContentShouldBlock(desc, contentRegexMode, contentSet, contentRegexes)) {
                    idxList.add(i);
                    continue;
                }
            }

            if (!topics.isEmpty()) {
                String topic = item.getModulesList().stream()
                        .filter(Module::hasModuleTopic).findFirst()
                        .map(module -> module.getModuleTopic().getName()).orElse(null);
                if (!TextUtils.isEmpty(topic) && topics.stream().anyMatch(topic::contains)) {
                    idxList.add(i);
                    continue;
                }
            }

            if (!ups.isEmpty()) {
                String origName = extend.getOrigName();
                if (!TextUtils.isEmpty(origName) && ups.stream().anyMatch(origName::equals)) {
                    idxList.add(i);
                    continue;
                }
            }

            if (uidArray.length > 0) {
                long uid = extend.getUid();
                if (uid > 0 && ArrayUtils.contains(uidArray, uid)) {
                    idxList.add(i);
                    continue;
                }
            }
        }

        return idxList;
    }

    private static boolean isContentShouldBlock(String text, boolean regexMode, Set<String> contents, List<Pattern> regexes) {
        if (regexMode && !TextUtils.isEmpty(text)) {
            return regexes.stream().anyMatch(r -> r.matcher(text).find());
        } else if (!TextUtils.isEmpty(text)) {
            return contents.stream().anyMatch(text::contains);
        }
        return false;
    }
}
