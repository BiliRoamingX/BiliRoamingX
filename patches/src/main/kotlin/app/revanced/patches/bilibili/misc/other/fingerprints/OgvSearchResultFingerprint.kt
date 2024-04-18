package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

/**
 * from pink
 */
object OgvSearchResultFingerprint : MethodFingerprint(
    strings = listOf("pgc.bangumi-search.0.0.pv"),
    customFingerprint = { _, classDef ->
        classDef.type == "Lcom/bilibili/search/ogv/OgvSearchResultFragment;"
    }
)

/**
 * from pink, search2
 */
object OgvSearchResultV2Fingerprint : MethodFingerprint(
    strings = listOf("pgc.bangumi-search.0.0.pv"),
    customFingerprint = { _, classDef ->
        classDef.type == "Lcom/bilibili/search2/ogv/OgvSearchResultFragment;"
    }
)

/**
 * from hd
 */
object BangumiSearchResultFingerprint : MethodFingerprint(
    strings = listOf("pgc.bangumi-search.0.0.pv"),
    customFingerprint = { _, classDef ->
        classDef.type == "Lcom/bilibili/search/result/bangumi/ogv/BangumiSearchResultFragment;"
    }
)
