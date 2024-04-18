package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.ArrayUtils
import com.bapis.bilibili.app.dynamic.v2.AdditionalType
import com.bapis.bilibili.app.dynamic.v2.DescType
import com.bapis.bilibili.app.dynamic.v2.DynamicItem
import com.google.protobuf.GeneratedMessageLite

abstract class DynListBase<out Req : GeneratedMessageLite<*, *>, out Resp : GeneratedMessageLite<*, *>> :
    MossHook<Req, Resp>() {
    companion object {
        private var cachedContentSet = setOf<String>()
        private var cachedContentRegexes = listOf<Regex>()
    }

    protected fun List<DynamicItem>.getToRemoveIdxList(): List<Int> {
        val contentSet = Settings.DYNAMIC_PURIFY_CONTENT.stringSet
        val contentRegexMode = Settings.DYNAMIC_PURIFY_CONTENT_REGEX_MODE.boolean
        val contentRegexes = if (contentRegexMode && cachedContentSet == contentSet) {
            cachedContentRegexes
        } else if (contentRegexMode) {
            cachedContentSet = HashSet(contentSet)
            contentSet.map { it.toRegex() }.also { cachedContentRegexes = it }
        } else listOf()
        val typeSet = Settings.DYNAMIC_PURIFY_TYPE.stringSet
        val ups = Settings.DYNAMIC_PURIFY_UP.stringSet
        val uidSet = Settings.DYNAMIC_PURIFY_UID.stringSet
        val topics = Settings.DYNAMIC_PURIFY_TOPIC.stringSet
        val rmBlocked = Settings.DYNAMIC_RM_BLOCKED.boolean
        val rmAdLink = Settings.DYNAMIC_RM_AD_LINK.boolean
        val rmUpReservation = Settings.DYNAMIC_RM_UP_RESERVATION.boolean
        val typeArray = ArrayUtils.toIntArray(typeSet)
        val uidArray = ArrayUtils.toLongArray(uidSet)
        val idxList = mutableListOf<Int>()
        for ((idx, item) in withIndex()) {
            val cardType = item.cardTypeValue
            if (typeArray.isNotEmpty() && typeArray.contains(cardType)) {
                idxList.add(idx)
                continue
            }
            val extend = item.extend
            if (rmBlocked && extend.hasOnlyFansProperty()
                && !extend.onlyFansProperty.hasPrivilege
            ) {
                idxList.add(idx)
                continue
            }
            if ((rmAdLink || rmUpReservation) && item.modulesList.asSequence()
                    .filter { it.hasModuleAdditional() }
                    .map { it.moduleAdditional }
                    .any {
                        val type = it.type
                        rmAdLink && (type == AdditionalType.additional_type_goods || type == AdditionalType.additional_type_up_rcmd)
                                || rmUpReservation && type == AdditionalType.additional_type_up_reservation
                    }
            ) {
                idxList.add(idx)
                continue
            }
            if (rmAdLink || rmUpReservation) {
                val moduleDynamic = item.modulesList.firstNotNullOfOrNull {
                    if (it.hasModuleDynamic()) it.moduleDynamic else null
                }
                if (moduleDynamic != null && moduleDynamic.hasDynForward()) {
                    val forwardItem = moduleDynamic.dynForward.item
                    if (forwardItem.modulesList.asSequence()
                            .filter { it.hasModuleAdditional() }
                            .map { it.moduleAdditional }
                            .any {
                                val type = it.type
                                rmAdLink && (type == AdditionalType.additional_type_goods || type == AdditionalType.additional_type_up_rcmd)
                                        || rmUpReservation && type == AdditionalType.additional_type_up_reservation
                            }
                    ) {
                        idxList.add(idx)
                        continue
                    }
                }
                if (rmAdLink && (extend.origDescList.any { it.type == DescType.desc_type_goods }
                            || extend.descList.any { it.type == DescType.desc_type_goods })) {
                    idxList.add(idx)
                    continue
                }
            }
            if (contentSet.isNotEmpty()) {
                val text = item.modulesList.firstNotNullOfOrNull {
                    if (it.hasModuleDesc()) it.moduleDesc.text else null
                }
                if (text.shouldBlock(contentRegexMode, contentSet, contentRegexes)) {
                    idxList.add(idx)
                    continue
                }
                val orig = extend.origDescList.joinToString(separator = "") { it.origText }
                if (orig.shouldBlock(contentRegexMode, contentSet, contentRegexes)) {
                    idxList.add(idx)
                    continue
                }
                val desc = extend.descList.joinToString(separator = "") { it.origText }
                if (desc.shouldBlock(contentRegexMode, contentSet, contentRegexes)) {
                    idxList.add(idx)
                    continue
                }
            }
            if (topics.isNotEmpty()) {
                val topic = item.modulesList.firstNotNullOfOrNull {
                    if (it.hasModuleTopic()) it.moduleTopic.name else null
                }
                if (!topic.isNullOrEmpty() && topics.any { topic.contains(it) }) {
                    idxList.add(idx)
                    continue
                }
            }
            if (ups.isNotEmpty()) {
                val origName = extend.origName
                if (!origName.isNullOrEmpty() && ups.any { origName == it }) {
                    idxList.add(idx)
                    continue
                }
            }
            if (uidArray.isNotEmpty()) {
                val uid = extend.uid
                if (uid > 0 && uidArray.contains(uid)) {
                    idxList.add(idx)
                    continue
                }
            }
        }
        return idxList
    }

    private fun String?.shouldBlock(
        regexMode: Boolean,
        contents: Set<String>,
        regexes: List<Regex>
    ) = if (regexMode && !isNullOrEmpty())
        regexes.any { contains(it) }
    else if (!isNullOrEmpty())
        contents.any { contains(it) }
    else false
}
