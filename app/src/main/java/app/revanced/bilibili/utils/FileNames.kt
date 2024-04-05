// copy from android.os.FileUtils.java
package app.revanced.bilibili.utils

import androidx.annotation.IntRange

private fun Char.isValidFatFilenameChar(): Boolean {
    return if (code in 0x00..0x1F) {
        false
    } else when (this) {
        '"', '*', '/', ':', '<', '>', '?', '\\', '|' -> false
        else -> code != 0x7F
    }
}

private fun Char.isValidExtFilenameChar(): Boolean {
    return when (this) {
        '\u0000', '/' -> false
        else -> true
    }
}

private fun trimFilename(str: String, maxBytes: Int): String {
    val res = StringBuilder(str)
    trimFilename(res, maxBytes)
    return res.toString()
}

private fun trimFilename(res: StringBuilder, maxBytes: Int) {
    var max = maxBytes
    var raw = res.toString().toByteArray()
    if (raw.size > max) {
        max -= 3
        while (raw.size > max) {
            res.deleteCharAt(res.length / 2)
            raw = res.toString().toByteArray()
        }
        res.insert(res.length / 2, "...")
    }
}

/**
 * Mutate the given filename to make it valid for a FAT filesystem,
 * replacing any invalid characters with "_".
 */
fun String?.toValidFatFilename(@IntRange(1, 255) maxBytes: Int = 255): String {
    require(maxBytes <= 255) { "maxBytes must not greater than 255." }
    if (isNullOrEmpty() || "." == this || ".." == this)
        return "(invalid)"
    return buildString(length) {
        for (c in this@toValidFatFilename) {
            if (c.isValidFatFilenameChar()) append(c)
            else append('_')
        }
        // Even though vfat allows 255 UCS-2 chars, we might eventually write to
        // ext4 through a FUSE layer, so use that limit.
        trimFilename(this, maxBytes)
    }
}

/**
 * Mutate the given filename to make it valid for an ext4 filesystem,
 * replacing any invalid characters with "_".
 */
fun String?.toValidExtFilename(@IntRange(1, 255) maxBytes: Int = 255): String {
    require(maxBytes <= 255) { "maxBytes must not greater than 255." }
    if (isNullOrEmpty() || "." == this || ".." == this)
        return "(invalid)"
    return buildString(length) {
        for (c in this@toValidExtFilename) {
            if (c.isValidExtFilenameChar()) append(c)
            else append('_')
        }
        trimFilename(this, maxBytes)
    }
}

/**
 * Check if given filename is valid for a FAT filesystem.
 */
fun String?.isValidFatFilename() = this != null && this == toValidFatFilename()

/**
 * Check if given filename is valid for an ext4 filesystem.
 */
fun String?.isValidExtFilename() = this != null && this == toValidExtFilename()
