package app.revanced.bilibili.meta

@Suppress("ConvertObjectToDataObject")
sealed class Client(
    val mobiApp: String,
    val appKey: String,
    val appId: Int,
    val verCode: Int,
    val verName: String,
) {
    object Pink : Client("android", "1d8b6e7d45233436", 1, 7760700, "7.76.0")
    object Play : Client("android_i", "bb3101000e232e27", 2, 7750300, "3.19.0")
    object Hd : Client("android_hd", "dfca71928277209b", 5, 1460100, "1.46.0")
}
