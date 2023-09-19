package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.isNullOrEmpty
import app.revanced.bilibili.utils.iterator
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONObject

object ShareChannels : ApiHook() {

    private const val RES_FOR_TH_BANGUMI =
        """{"code":0,"message":"0","ttl":1,"data":{"below_channels":[{"name":"缓存","picture":"https://i0.hdslb.com/bfs/share/bdb9996ea9f7030ab2bd72777e7e8c2f717f4af1.png","share_channel":"VIDEO_DOWNLOAD","category":"VIDEO_DOWNLOAD","level":"1"},{"name":"版权受限","picture":"https://i0.hdslb.com/bfs/share/e4cbcc33f0052c0aa88b3f89a34a3510f520e613.png","share_channel":"VIDEO_DOWNLOAD_UNABLE","category":"VIDEO_DOWNLOAD","level":"2"},{"name":"倍速播放","picture":"https://i0.hdslb.com/bfs/share/f6630e6f91e6b0b6062f516fc22960dc7f7f21c0.png","share_channel":"PLAY_RATE_0.5","category":"PLAY_RATE","level":"1"},{"name":"倍速播放","picture":"https://i0.hdslb.com/bfs/share/b09fc9f3483870b2433394f50ad7caa938ed49a6.png","share_channel":"PLAY_RATE_0.75","category":"PLAY_RATE","level":"2"},{"name":"倍速播放","picture":"https://i0.hdslb.com/bfs/share/4428da5f26cbd981b3d6f2e0bbd31d2428c1c367.png","share_channel":"PLAY_RATE_1.0","category":"PLAY_RATE","level":"3"},{"name":"倍速播放","picture":"https://i0.hdslb.com/bfs/share/55dabc39dbef52b35f000af603192ff334c81654.png","share_channel":"PLAY_RATE_1.25","category":"PLAY_RATE","level":"4"},{"name":"倍速播放","picture":"https://i0.hdslb.com/bfs/share/071c52b41f8657f65e22874a1623273db7505eab.png","share_channel":"PLAY_RATE_1.5","category":"PLAY_RATE","level":"5"},{"name":"倍速播放","picture":"https://i0.hdslb.com/bfs/share/05f1761b4bf7b67c2bd75c45c9f873bdf9cee26d.png","share_channel":"PLAY_RATE_2","category":"PLAY_RATE","level":"6"},{"name":"自动连播","picture":"https://i0.hdslb.com/bfs/share/04c552ab8470d8c15246a1f1a431092c012dd38d.png","share_channel":"PLAY_MODE_AUTO_PLAY","category":"PLAY_MODE","level":"1"},{"name":"播完暂停","picture":"https://i0.hdslb.com/bfs/share/d48cbd6507b7dac6950a8db3d5eed39cdde5b52c.png","share_channel":"PLAY_MODE_END_STOP","category":"PLAY_MODE","level":"2"},{"name":"单集循环","picture":"https://i0.hdslb.com/bfs/share/661e4b6961fa9c75df16ce6ec33b52bd4ac35f29.png","share_channel":"PLAY_MODE_SINGLE_LOOP","category":"PLAY_MODE","level":"3"},{"name":"列表循环","picture":"https://i0.hdslb.com/bfs/share/ec2ce2cc189b9e40acf950dac48f0fbe92057469.png","share_channel":"PLAY_MODE_LIST_LOOP","category":"PLAY_MODE","level":"4"},{"name":"播放设置","picture":"https://i0.hdslb.com/bfs/share/4ad589538b34ca7af77f72eb816585e6af2ef58c.png","share_channel":"PLAY_SETTING"},{"name":"反馈建议","picture":"https://i0.hdslb.com/bfs/share/b3769d816140e205825f473b5574845211d9b986.png","share_channel":"SUGGESTION"}],"text":"分享"}}"""

    override fun shouldHook(url: String, code: Int): Boolean {
        // start from 7.38.0, switched to bson and gson type adapter, so hook response directly
        return (Settings.UNLOCK_PLAY_LIMIT.boolean || Settings.UNLOCK_AREA_LIMIT.boolean)
                && url.startsWith("https://api.bilibili.com/x/share/channels")
                && code.isOk
    }

    override fun hook(url: String, code: Int, response: String): String {
        val json = response.toJSONObject()
        if (json.optInt("code") != 0)
            return RES_FOR_TH_BANGUMI
        val data = json.optJSONObject("data")
            ?: return response
        val belowChannels = data.optJSONArray("below_channels")
        if (belowChannels.isNullOrEmpty()) return response
        var alreadyHas = false
        var toInsertIdx = -1
        belowChannels.iterator().withIndex().forEach { (index, item) ->
            val shareChannel = item.optString("share_channel")
            if ("PLAY_BACKGROUND_OFF" == shareChannel)
                toInsertIdx = index
            if ("LISTEN" == shareChannel)
                alreadyHas = true
        }
        if (alreadyHas || toInsertIdx == -1) return response
        val listenChannel = JSONObject().apply {
            put("name", "听视频")
            put("share_channel", "LISTEN")
            put(
                "picture",
                "https://i0.hdslb.com/bfs/share/f88d8c420a59ff1ca5975b38722408056e7337b7.png"
            )
        }
        belowChannels.put(toInsertIdx, listenChannel)
        return json.toString()
    }
}
