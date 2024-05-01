package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.get
import app.revanced.util.insertChild
import app.revanced.util.set

@Patch(
    name = "Append signature info for LSPatch",
    description = "meta-data 附加原始签名信息，允许 LSPatch 及类似物处理过的 APP 获取本 APP 的原始签名",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object AppendSignatureInfoPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        context.document["AndroidManifest.xml"].use { dom ->
            dom["application"].apply {
                arrayOf("lspatch", "npatch").forEach {
                    insertChild(0, "meta-data") {
                        this["android:name"] = it
                        this["android:value"] =
                            "eyJhcHBDb21wb25lbnRGYWN0b3J5IjpudWxsLCJkZWJ1Z2dhYmxlIjpmYWxzZSwibHNwQ29uZmlnIjp7IkFQSV9DT0RFIjowLCJDT1JFX1ZFUlNJT05fQ09ERSI6MCwiQ09SRV9WRVJTSU9OX05BTUUiOiIwIiwiU1VQUE9SVF9ST0xMSU5HIjpmYWxzZSwiVkVSU0lPTl9DT0RFIjowLCJWRVJTSU9OX05BTUUiOiIwIn0sIm9yaWdpbmFsU2lnbmF0dXJlIjoiMzA4MjAyNTczMDgyMDFjMGEwMDMwMjAxMDIwMjA0NGYzYmIwZWMzMDBkMDYwOTJhODY0ODg2ZjcwZDAxMDEwNTA1MDAzMDZmMzEwYjMwMDkwNjAzNTUwNDA2MTMwMjQzNGUzMTEyMzAxMDA2MDM1NTA0MDgxMzA5NDc3NTYxNmU2NzY0NmY2ZTY3MzEwZjMwMGQwNjAzNTUwNDA3MTMwNjVhNjg3NTY4NjE2OTMxMTMzMDExMDYwMzU1MDQwYTEzMGE2NDYxNmU2ZDYxNmI3NTJlNzQ3NjMxMTMzMDExMDYwMzU1MDQwYjEzMGE2NDYxNmU2ZDYxNmI3NTJlNzQ3NjMxMTEzMDBmMDYwMzU1MDQwMzEzMDg0MjYyNjM2MTZjNmM2NTZlMzAyMDE3MGQzMTMyMzAzMjMxMzUzMTMzMzEzOTM0MzA1YTE4MGYzMjMwMzYzNjMxMzEzMTM4MzEzMzMxMzkzNDMwNWEzMDZmMzEwYjMwMDkwNjAzNTUwNDA2MTMwMjQzNGUzMTEyMzAxMDA2MDM1NTA0MDgxMzA5NDc3NTYxNmU2NzY0NmY2ZTY3MzEwZjMwMGQwNjAzNTUwNDA3MTMwNjVhNjg3NTY4NjE2OTMxMTMzMDExMDYwMzU1MDQwYTEzMGE2NDYxNmU2ZDYxNmI3NTJlNzQ3NjMxMTMzMDExMDYwMzU1MDQwYjEzMGE2NDYxNmU2ZDYxNmI3NTJlNzQ3NjMxMTEzMDBmMDYwMzU1MDQwMzEzMDg0MjYyNjM2MTZjNmM2NTZlMzA4MTlmMzAwZDA2MDkyYTg2NDg4NmY3MGQwMTAxMDEwNTAwMDM4MThkMDAzMDgxODkwMjgxODEwMGJmYzk3YTBiNzYzYWJlOTI0YWYwYmMwNmE3N2NmY2Q0MmMwMzUyMjE4YmRmOTRjMzA2OWVlMDA0NmQ3MzlhY2M4MGYyOWE2MzU3Njk0M2QzMTBiZGM5OWZkZjkyYjMxOGIyYmViODJhYTZlZDdjMWRhMmI4MzA5YjczNmEzZDVhOGQ0NTM3MDRjNWRkYjQyMmZjZGNmMzk0NWI3ZWVjMTU2ODRlODk4NmNhNWJlMmJjZWQ1NjJhZmVlYjY0Zjk5MjI5OTZiNWVkNThhMDc4M2Y3MmU1ZDZjNTBkYjFmYjMxNDI2YWQxZjY0YTU1NWE0ODU0MzE0MzYwMWY2YzFjMTEwMjAzMDEwMDAxMzAwZDA2MDkyYTg2NDg4NmY3MGQwMTAxMDUwNTAwMDM4MTgxMDAwMGI3NjZkNjdiMzMwZWJkOGQ5NGE2NzA0MWZjNGNkYzYzMzM3ZWFhZTU1ZjZiYjI3YjRhZmE4Zjc2OWQ2ZDcwMjBhYTEyYTEwNDRjMzc4NDlmMjZlOWFhYWFiYTJlZTEzZTFhMDFjNDQzMzI0MjhkNzk4MzIyMTNlMTgyMzg5NDBjY2I5NWE3ODZmYTRjODYwMmU0OTlhOGUwMDY4ZTJkNGM4NDI3MzczYTllMGQ0Yjc4ZGJkMWYxYTVjYTQxMDY5OGNjZjk4YWQ4NzQ2ODRhNmZlYzU0Nzc4OTczYmM5MTRmNDRhYTdiMGU2M2VkZTljZTUyYzBjZTk5YjYyMDdmIiwib3ZlcnJpZGVWZXJzaW9uQ29kZSI6ZmFsc2UsInNpZ0J5cGFzc0xldmVsIjowLCJ1c2VNYW5hZ2VyIjpmYWxzZX0="
                    }
                }
            }
        }
    }
}
