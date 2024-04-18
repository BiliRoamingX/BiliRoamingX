@file:JvmName("BVUtils")
@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

private const val XOR_CODE = 23442827791579
private const val MASK_CODE = 2251799813685247
private const val MAX_AID = 1L shl 51
private const val BASE = 58

private val data = "FcwAPNKTMug3GV5Lj7EJnHpWsx4tb8haYeviqBz6rkCy12mUSDQX9RdoZf".toCharArray()

const val avPattern = "av[1-9]\\d*"
const val bvPattern = "BV1[1-9A-NP-Za-km-z]{9}"
const val avOrBvPattern = "(av[1-9]\\d*)|(BV1[1-9A-NP-Za-km-z]{9})"

private inline fun CharArray.swapAt(ai: Int, bi: Int) {
    val tmp = this[ai]
    this[ai] = this[bi]
    this[bi] = tmp
}

fun av2bv(aid: Long): String {
    val chars = "BV1000000000".toCharArray()
    var bvIndex = chars.size - 1
    var tmp = (MAX_AID or aid) xor XOR_CODE

    while (tmp != 0L) {
        chars[bvIndex] = data[(tmp % BASE).toInt()]
        tmp /= BASE
        bvIndex -= 1
    }

    chars.swapAt(3, 9)
    chars.swapAt(4, 7)

    return chars.concatToString()
}

fun bv2av(bvid: String): Long {
    val bvidArray = bvid.toCharArray()

    bvidArray.swapAt(3, 9)
    bvidArray.swapAt(4, 7)

    var tmp = 0L

    for (i in bvidArray.indices) {
        val char = bvidArray[i]
        if (i >= 3) tmp = tmp * BASE + data.indexOfFirst { it == char }
    }

    return (tmp and MASK_CODE) xor XOR_CODE
}
