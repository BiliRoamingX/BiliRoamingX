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
    description = "meta-data 附加原始签名信息，允许 LSPatch 过的 APP 获取本 APP 的原始签名",
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
                insertChild(0, "meta-data") {
                    this["android:name"] = "lspatch"
                    this["android:value"] =
                        "eyJvcmlnaW5hbFNpZ25hdHVyZSI6IjMwODIwMjU3MzA4MjAxYzBhMDAzMDIwMTAyMDIwNDRmM2JiMGVjMzAwZDA2MDkyYTg2NDg4NmY3MGQwMTAxMDUwNTAwMzA2ZjMxMGIzMDA5MDYwMzU1MDQwNjEzMDI0MzRlMzExMjMwMTAwNjAzNTUwNDA4MTMwOTQ3NzU2MTZlNjc2NDZmNmU2NzMxMGYzMDBkMDYwMzU1MDQwNzEzMDY1YTY4NzU2ODYxNjkzMTEzMzAxMTA2MDM1NTA0MGExMzBhNjQ2MTZlNmQ2MTZiNzUyZTc0NzYzMTEzMzAxMTA2MDM1NTA0MGIxMzBhNjQ2MTZlNmQ2MTZiNzUyZTc0NzYzMTExMzAwZjA2MDM1NTA0MDMxMzA4NDI2MjYzNjE2YzZjNjU2ZTMwMjAxNzBkMzEzMjMwMzIzMTM1MzEzMzMxMzkzNDMwNWExODBmMzIzMDM2MzYzMTMxMzEzODMxMzMzMTM5MzQzMDVhMzA2ZjMxMGIzMDA5MDYwMzU1MDQwNjEzMDI0MzRlMzExMjMwMTAwNjAzNTUwNDA4MTMwOTQ3NzU2MTZlNjc2NDZmNmU2NzMxMGYzMDBkMDYwMzU1MDQwNzEzMDY1YTY4NzU2ODYxNjkzMTEzMzAxMTA2MDM1NTA0MGExMzBhNjQ2MTZlNmQ2MTZiNzUyZTc0NzYzMTEzMzAxMTA2MDM1NTA0MGIxMzBhNjQ2MTZlNmQ2MTZiNzUyZTc0NzYzMTExMzAwZjA2MDM1NTA0MDMxMzA4NDI2MjYzNjE2YzZjNjU2ZTMwODE5ZjMwMGQwNjA5MmE4NjQ4ODZmNzBkMDEwMTAxMDUwMDAzODE4ZDAwMzA4MTg5MDI4MTgxMDBiZmM5N2EwYjc2M2FiZTkyNGFmMGJjMDZhNzdjZmNkNDJjMDM1MjIxOGJkZjk0YzMwNjllZTAwNDZkNzM5YWNjODBmMjlhNjM1NzY5NDNkMzEwYmRjOTlmZGY5MmIzMThiMmJlYjgyYWE2ZWQ3YzFkYTJiODMwOWI3MzZhM2Q1YThkNDUzNzA0YzVkZGI0MjJmY2RjZjM5NDViN2VlYzE1Njg0ZTg5ODZjYTViZTJiY2VkNTYyYWZlZWI2NGY5OTIyOTk2YjVlZDU4YTA3ODNmNzJlNWQ2YzUwZGIxZmIzMTQyNmFkMWY2NGE1NTVhNDg1NDMxNDM2MDFmNmMxYzExMDIwMzAxMDAwMTMwMGQwNjA5MmE4NjQ4ODZmNzBkMDEwMTA1MDUwMDAzODE4MTAwMDBiNzY2ZDY3YjMzMGViZDhkOTRhNjcwNDFmYzRjZGM2MzMzN2VhYWU1NWY2YmIyN2I0YWZhOGY3NjlkNmQ3MDIwYWExMmExMDQ0YzM3ODQ5ZjI2ZTlhYWFhYmEyZWUxM2UxYTAxYzQ0MzMyNDI4ZDc5ODMyMjEzZTE4MjM4OTQwY2NiOTVhNzg2ZmE0Yzg2MDJlNDk5YThlMDA2OGUyZDRjODQyNzM3M2E5ZTBkNGI3OGRiZDFmMWE1Y2E0MTA2OThjY2Y5OGFkODc0Njg0YTZmZWM1NDc3ODk3M2JjOTE0ZjQ0YWE3YjBlNjNlZGU5Y2U1MmMwY2U5OWI2MjA3ZiJ9"
                }
            }
        }
    }
}
