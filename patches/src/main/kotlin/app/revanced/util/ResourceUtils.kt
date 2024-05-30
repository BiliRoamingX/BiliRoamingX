package app.revanced.util

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.util.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.io.File
import java.nio.file.Files
import java.nio.file.StandardCopyOption

private val classLoader = object {}.javaClass.classLoader

/**
 * Copy resources from the current class loader to the resource directory.
 *
 * @param sourceResourceDirectory The source resource directory name.
 * @param resources The resources to copy.
 */
fun ResourceContext.copyResources(sourceResourceDirectory: String, vararg resources: ResourceGroup) {
    val targetResourceDirectory = this["res", false]

    for (resourceGroup in resources) {
        val resourceDirectory = resourceGroup.resourceDirectoryName
        resourceGroup.resources.forEach { resource ->
            val resourceFile = "$resourceDirectory/$resource"
            Files.copy(
                bundledResource("$sourceResourceDirectory/$resourceFile"),
                File(targetResourceDirectory, resourceFile).toPath(),
                StandardCopyOption.REPLACE_EXISTING
            )
        }
    }
}

/**
 * Resource names mapped to their corresponding resource data.
 * @param resourceDirectoryName The name of the directory of the resource.
 * @param resources A list of resource names.
 */
class ResourceGroup(val resourceDirectoryName: String, vararg val resources: String)

operator fun Document.get(tagName: String): Element {
    return getElementsByTagName(tagName).item(0) as Element
}

fun Node.children(): Sequence<Element> =
    childNodes.iterator().asSequence().filterIsInstance<Element>()

fun Node.walk(action: (Element) -> Unit) {
    if (this is Element)
        action(this)
    children().forEach {
        it.walk(action)
    }
}

var Node.tag: String
    get() = nodeName
    set(value) {
        ownerDocument.renameNode(this, null, value)
    }

operator fun NodeList.iterator(): Iterator<Node> = object : Iterator<Node> {
    private var index = 0
    override fun hasNext(): Boolean = index < length
    override fun next(): Node = item(index++)
}

operator fun Element.get(attrName: String): String = getAttribute(attrName)
operator fun Element.set(attrName: String, attrValue: String): Unit = setAttribute(attrName, attrValue)

fun Element.appendChild(tagName: String, build: Element.() -> Unit) {
    appendChild(ownerDocument.createElement(tagName).apply(build))
}

fun Element.insertBefore(refChild: Node, tagName: String, build: Element.() -> Unit) {
    insertBefore(ownerDocument.createElement(tagName).apply(build), refChild)
}

fun Element.insertChild(index: Int, tagName: String, build: Element.() -> Unit) {
    insertBefore(ownerDocument.createElement(tagName).apply(build), children().elementAt(index))
}

fun Element.removeChild(condition: Element.() -> Boolean) {
    children().find(condition)?.also { removeChild(it) }
}

fun bundledResource(path: String) = classLoader.getResourceAsStream(path)!!

fun ResourceContext.mergeXmlNodes(
    nodeName: String,
    hostPath: String,
    vararg paths: String
) = document[hostPath].use { host ->
    val hostNode = host[nodeName]
    paths.map { document[bundledResource(it)] }.forEach { editor ->
        editor.use {
            for (node in it[nodeName].childNodes) {
                val clonedNode = node.cloneNode(true)
                host.adoptNode(clonedNode)
                hostNode.appendChild(clonedNode)
            }
        }
    }
}
