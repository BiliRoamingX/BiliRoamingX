package app.revanced.patches.shared.misc.mapping

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.util.children
import app.revanced.util.get


object ResourceMappingPatch : ResourcePatch() {
    lateinit var resourceMappings: List<ResourceElement>
        private set

    override fun execute(context: ResourceContext) {
        val mappings = mutableListOf<ResourceElement>()

        context.document[context["res/values/public.xml", false].inputStream()].use { dom ->
            dom["resources"].children().forEach {
                val type = it["type"]
                val name = it["name"]
                val id = it["id"].substring(2).toInt(16)
                if (!name.startsWith("APKTOOL"))
                    mappings.add(ResourceElement(type, name, id))
            }
        }

        resourceMappings = mappings
    }

    data class ResourceElement(val type: String, val name: String, val id: Int)
}
