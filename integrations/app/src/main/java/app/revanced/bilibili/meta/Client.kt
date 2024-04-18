package app.revanced.bilibili.meta

enum class Client(
    val mobiApp: String,
    val appKey: String,
    val appId: Int,
    val verCode: Int,
    val verName: String,
) {
    PINK("android", "1d8b6e7d45233436", 1, 7700200, "7.70.0"),
    PLAY("android_i", "bb3101000e232e27", 2, 7420600, "3.18.2"),
    HD("android_hd", "dfca71928277209b", 5, 1460100, "1.46.0"),
}
