@file:JvmName("Hashs")

package app.revanced.bilibili.utils

import android.util.Base64
import java.io.File
import java.io.InputStream
import java.net.URLDecoder
import java.net.URLEncoder
import java.security.DigestInputStream
import java.security.MessageDigest

private val HEX_DIGITS =
    charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f')

fun ByteArray.toHexString(): String {
    val hexDigits = HEX_DIGITS
    val len = size
    if (len <= 0) return ""
    val ret = CharArray(len shl 1)
    var i = 0
    var j = 0
    while (i < len) {
        ret[j++] = hexDigits[this[i].toInt() shr 4 and 0x0f]
        ret[j++] = hexDigits[this[i].toInt() and 0x0f]
        i++
    }
    return String(ret)
}

private fun hash(source: InputStream, algorithm: String): ByteArray? {
    return try {
        val md = MessageDigest.getInstance(algorithm)
        val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
        DigestInputStream(source, md).use {
            while (true) {
                if (it.read(buffer) == -1)
                    break
            }
        }
        md.digest()
    } catch (_: Exception) {
        null
    }
}

val File.sha256Hex: String
    get() = hash(inputStream(), "SHA256")?.toHexString().orEmpty()

val ByteArray.md5Hex: String
    get() = hash(inputStream(), "MD5")?.toHexString().orEmpty()

val ByteArray.base64: String
    inline get() = Base64.encodeToString(this, Base64.NO_WRAP)

val String.base64Decode: ByteArray
    inline get() = Base64.decode(this, Base64.DEFAULT)

val String.urlEncoded: String
    inline get() = URLEncoder.encode(this, "UTF-8")

val String.urlDecoded: String
    inline get() = URLDecoder.decode(this, "UTF-8")
