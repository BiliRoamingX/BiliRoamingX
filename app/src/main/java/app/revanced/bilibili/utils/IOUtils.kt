@file:JvmName("IOUtils")
@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import java.io.*
import java.net.URL
import java.nio.charset.Charset

@JvmOverloads
fun InputStream.copyToX(out: OutputStream, bufferSize: Int = DEFAULT_BUFFER_SIZE): Long {
    var bytesCopied: Long = 0
    val buffer = ByteArray(bufferSize)
    var bytes = read(buffer)
    while (bytes >= 0) {
        out.write(buffer, 0, bytes)
        bytesCopied += bytes
        bytes = read(buffer)
    }
    return bytesCopied
}

fun Reader.copyToX(out: Writer, bufferSize: Int = DEFAULT_BUFFER_SIZE): Long {
    var charsCopied: Long = 0
    val buffer = CharArray(bufferSize)
    var chars = read(buffer)
    while (chars >= 0) {
        out.write(buffer, 0, chars)
        charsCopied += chars
        chars = read(buffer)
    }
    return charsCopied
}

fun Reader.readTextX(): String {
    val buffer = StringWriter()
    copyToX(buffer)
    return buffer.toString()
}

fun InputStream.readBytesX(): ByteArray {
    val buffer = ByteArrayOutputStream(maxOf(DEFAULT_BUFFER_SIZE, this.available()))
    copyToX(buffer)
    return buffer.toByteArray()
}

inline fun URL.readTextX(charset: Charset = Charsets.UTF_8): String = readBytesX().toString(charset)

fun URL.readBytesX(): ByteArray = openStream().use { it.readBytesX() }

inline fun <T> Reader.useLinesX(block: (Sequence<String>) -> T): T =
    buffered().use { block(it.lineSequenceX()) }

fun BufferedReader.lineSequenceX(): Sequence<String> = LinesSequence(this)

private class LinesSequence(private val reader: BufferedReader) : Sequence<String> {
    override fun iterator(): Iterator<String> {
        return object : Iterator<String> {
            private var nextValue: String? = null
            private var done = false

            override fun hasNext(): Boolean {
                if (nextValue == null && !done) {
                    nextValue = reader.readLine()
                    if (nextValue == null) done = true
                }
                return nextValue != null
            }

            override fun next(): String {
                if (!hasNext()) {
                    throw NoSuchElementException()
                }
                val answer = nextValue
                nextValue = null
                return answer!!
            }
        }
    }
}
