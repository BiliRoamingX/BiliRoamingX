package app.revanced.bilibili.meta

data class VideoHistory @JvmOverloads constructor(
    var lastEpId: Int = -1,
    var histories: ArrayList<Item> = arrayListOf(),
) {
    data class Item(var epId: Int, var progress: Long)
}
