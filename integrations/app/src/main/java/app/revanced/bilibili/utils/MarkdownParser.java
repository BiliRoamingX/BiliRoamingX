/*
Copyright (c) 2019 Ashur Rafiev
https://github.com/ashurrafiev/JParsedown
MIT Licence: https://github.com/ashurrafiev/JParsedown/blob/master/LICENSE

This work is derived from Parsedown version 1.8.0-beta-5:
Copyright (c) 2013-2018 Emanuil Rusev
http://parsedown.org
*/
package app.revanced.bilibili.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class MarkdownParser {

    public static final String version = "1.0.4";

    protected static class ReferenceData {
        public String url;
        public String title;

        public ReferenceData(String url, String title) {
            this.url = url;
            this.title = title;
        }
    }

    protected static class Line {
        public String body;
        public String text;
        public int indent;

        public Line(String line) {
            body = line;
            text = line.replaceFirst("^\\s+", "");
            indent = line.length() - text.length();
        }
    }

    protected abstract static class Handler {
        public abstract Element function(Element element);
    }

    protected abstract static class ElementsHandler extends Handler {
        public abstract LinkedList<Element> elementFunction(Element element);

        @Override
        public final Element function(Element element) {
            element.elements = elementFunction(element);
            return element;
        }
    }

    protected class LineElementsHandler extends ElementsHandler {
        public String text;

        public LineElementsHandler(String text) {
            this.text = text;
        }

        @Override
        public LinkedList<Element> elementFunction(Element element) {
            return lineElements(text, element.nonNestables);
        }
    }

    protected class LinesElementsHandler extends ElementsHandler {
        public LinkedList<String> lines = new LinkedList<>();

        public LinesElementsHandler(String text) {
            if (text != null)
                lines.add(text);
        }

        @Override
        public LinkedList<Element> elementFunction(Element element) {
            return linesElements(lines);
        }
    }

    protected class ListItemElementHandler extends ElementsHandler {
        public LinkedList<String> lines = new LinkedList<>();

        public ListItemElementHandler(String body) {
            if (body != null) lines.add(body);
        }

        @Override
        public LinkedList<Element> elementFunction(Element element) {
            LinkedList<Element> elements = linesElements(lines);
            if (!lines.contains("") &&
                    !elements.isEmpty() && elements.getFirst().name != null
                    && elements.getFirst().name.equals("p")) {
                elements.getFirst().name = null;
            }
            return elements;
        }
    }

    protected static class Element {
        public String name = null;

        public HashMap<String, String> attributes = new HashMap<>();
        public LinkedList<Element> elements = new LinkedList<>();
        public String text = null;
        public String rawHtml = null;

        public HashSet<Class<?>> nonNestables = new HashSet<>();
        public Handler handler = null;
        public Boolean autoBreak = null;

        public Element() {
        }

        public Element(String name) {
            this.name = name;
        }

        public Element(String name, String text) {
            this.name = name;
            this.text = text;
        }

        public Element(String name, Element element) {
            this.name = name;
            this.elements.add(element);
        }

        public Element(String name, Handler handler) {
            this.name = name;
            this.handler = handler;
        }

        public Element addAttribute(String name, String value) {
            attributes.put(name, value);
            return this;
        }

        public Element handle() {
            Element element = this;
            if (handler != null) {
                element = handler.function(element);
                handler = null;
            }
            return element;
        }
    }

    protected abstract static class Component {
        public Element element = null;
        public String markup = null;
        public boolean hidden = false;

        public Element extractElement() {
            if (element == null) {
                if (markup != null) {
                    element = new Element();
                    element.rawHtml = markup;
                } else if (hidden) {
                    element = new Element();
                }
            }
            return element;
        }
    }

    protected abstract static class Block extends Component {
        public boolean identified = false;
        public int interrupted = 0;

        public Block setElement(Element e) {
            this.element = e;
            return this;
        }

        public boolean isContinuable() {
            return false;
        }

        public boolean isCompletable() {
            return false;
        }

        public abstract Block startBlock(Line line, Block block);

        public Block continueBlock(Line line) {
            return null;
        }

        public Block completeBlock() {
            return null;
        }
    }

    protected class BlockParagraph extends Block {
        @Override
        public Block startBlock(Line line, Block block) {
            return new BlockParagraph().setElement(
                    new Element("p", new LineElementsHandler(line.text))
            );
        }

        @Override
        public Block continueBlock(Line line) {
            if (interrupted > 0)
                return null;
            ((LineElementsHandler) element.handler).text += "\n" + line.text;
            return this;
        }
    }

    protected class BlockCode extends Block {
        @Override
        public Block startBlock(Line line, Block block) {
            if (block != null && block instanceof BlockParagraph && block.interrupted == 0)
                return null;
            if (line.indent >= 4) {
                return new BlockCode().setElement(
                        new Element("pre", new Element("code", line.body.substring(4)))
                );
            } else
                return null;
        }

        @Override
        public boolean isContinuable() {
            return true;
        }

        @Override
        public Block continueBlock(Line line) {
            if (line.indent >= 4) {
                Element e = element.elements.getFirst();
                StringBuilder lines = new StringBuilder();
                while (interrupted > 0) {
                    lines.append('\n');
                    interrupted--;
                }
                e.text += lines.toString();
                e.text += "\n";
                e.text += line.body.substring(4);
                return this;
            } else
                return null;
        }

        @Override
        public boolean isCompletable() {
            return true;
        }

        @Override
        public Block completeBlock() {
            return this;
        }
    }

    protected class BlockComment extends Block {
        public boolean closed = false;

        @Override
        public Block startBlock(Line line, Block block) {
            if (markupEscaped || safeMode)
                return null;
            if (line.text.indexOf("<!--") == 0) {
                BlockComment b = new BlockComment();
                b.element = new Element();
                b.element.rawHtml = line.body;
                b.element.autoBreak = true;
                if (line.text.contains("-->"))
                    b.closed = true;
                return b;
            } else
                return null;
        }

        @Override
        public boolean isContinuable() {
            return true;
        }

        @Override
        public Block continueBlock(Line line) {
            if (closed)
                return null;
            element.rawHtml += "\n" + line.body;
            if (line.text.contains("-->"))
                closed = true;
            return this;
        }
    }

    protected static class BlockFencedCode extends Block {
        public char marker;
        public int openerLength;
        public boolean complete = false;

        public BlockFencedCode() {
        }

        public BlockFencedCode(char marker, int openerLength) {
            this.marker = marker;
            this.openerLength = openerLength;
        }

        @Override
        public Block startBlock(Line line, Block block) {
            char marker = line.text.charAt(0);
            int openerLength = startSpan(line.text, marker);
            if (openerLength < 3)
                return null;
            String infostring = line.text.substring(openerLength).trim();
            if (infostring.contains("`"))
                return null;
            Element e = new Element("code", "");
            if (!infostring.isEmpty())
                e.attributes.put("class", "language-" + infostring);
            return new BlockFencedCode(marker, openerLength).setElement(
                    new Element("pre", e)
            );
        }

        @Override
        public boolean isContinuable() {
            return true;
        }

        @Override
        public Block continueBlock(Line line) {
            if (complete)
                return null;
            Element e = element.elements.getFirst();
            StringBuilder lines = new StringBuilder();
            while (interrupted > 0) {
                lines.append('\n');
                interrupted--;
            }
            e.text += lines.toString();
            int len = startSpan(line.text, marker);
            if (len >= openerLength && line.text.substring(len).trim().isEmpty()) {
                if (!e.text.isEmpty())
                    e.text = e.text.substring(1);
                complete = true;
                return this;
            }
            e.text += "\n";
            e.text += line.body;
            return this;
        }

        @Override
        public boolean isCompletable() {
            return true;
        }

        @Override
        public Block completeBlock() {
            return this;
        }
    }

    protected class BlockHeader extends Block {
        @Override
        public Block startBlock(Line line, Block block) {
            int level = startSpan(line.text, '#');
            if (level > 6)
                return null;

            String text = line.text.substring(level);
            if (strictMode && !text.isEmpty() && text.charAt(0) != ' ')
                return null;
            text = text.trim();

            Block b = new BlockHeader().setElement(
                    new Element("h" + level, new LineElementsHandler(text))
            );
            b.element.attributes.put("id", generateHeaderId(text, level));
            return b;
        }
    }

    protected class BlockList extends Block {
        public int indent;
        public String pattern;
        public boolean loose = false;

        public boolean ordered;
        public String marker;
        public String markerType;
        public String markerTypeRegex;

        public Element li;

        @Override
        public Block startBlock(Line line, Block block) {
            boolean ordered;
            String pattern;
            if (Character.isDigit(line.text.charAt(0))) {
                ordered = true; // ol
                pattern = "[0-9]{1,9}+[.\\)]";
            } else {
                ordered = false; // ul
                pattern = "[*+-]";
            }
            Matcher m = Pattern.compile("^(" + pattern + "([ ]++|$))(.*+)").matcher(line.text);
            if (m.find()) {
                String marker = m.group(1);
                String body = m.group(3);

                int contentIndent = m.group(2).length();
                if (contentIndent >= 5) {
                    contentIndent--;
                    marker = marker.substring(0, -contentIndent);
                    while (contentIndent > 0) {
                        body = " " + body;
                        contentIndent--;
                    }
                } else if (contentIndent == 0) {
                    marker += " ";
                }
                String markerWithoutWhitespace = marker.substring(0, marker.indexOf(' '));

                BlockList b = new BlockList();
                b.indent = line.indent;
                b.pattern = pattern;
                b.ordered = ordered;
                b.marker = marker;
                b.markerType = !ordered ?
                        markerWithoutWhitespace :
                        markerWithoutWhitespace.substring(markerWithoutWhitespace.length() - 1);
                b.markerTypeRegex = Pattern.quote(b.markerType);

                b.setElement(new Element(ordered ? "ol" : "ul"));

                if (ordered) {
                    String listStart = marker.substring(0, marker.indexOf(b.markerType)).replaceAll("$0+", "");
                    if (listStart.isEmpty())
                        listStart = "0";
                    if (!listStart.equals("1")) {
                        if (block != null && block instanceof BlockParagraph && block.interrupted == 0)
                            return null;
                        b.element.attributes.put("start", listStart);
                    }
                }

                b.li = new Element("li", new ListItemElementHandler(body));
                b.element.elements.add(b.li);

                return b;
            } else
                return null;
        }

        @Override
        public boolean isContinuable() {
            return true;
        }

        @Override
        public Block continueBlock(Line line) {
            if (interrupted > 0 && ((ListItemElementHandler) li.handler).lines.isEmpty())
                return null;

            int requiredIndent = indent + marker.length();
            Matcher m;
            if (line.indent < requiredIndent && (
                    (ordered && (m = Pattern.compile("^[0-9]++" + markerTypeRegex + "(?:[ ]++(.*)|$)").matcher(line.text)).find()) ||
                            (!ordered && (m = Pattern.compile("^" + markerTypeRegex + "(?:[ ]++(.*)|$)").matcher(line.text)).find())
            )) {
                if (interrupted > 0) {
                    ((ListItemElementHandler) li.handler).lines.add("");
                    loose = true;
                    interrupted = 0;
                }
                String text = m.group(1) != null ? m.group(1) : "";
                indent = line.indent;
                li = new Element("li", new ListItemElementHandler(text));
                element.elements.add(li);
                return this;
            } else if (line.indent < requiredIndent && new BlockList().startBlock(line, null) != null) {
                return null;
            }

            if (line.text.charAt(0) == '[' && new BlockReference().startBlock(line, null) != null) {
                return this;
            }

            if (line.indent >= requiredIndent) {
                if (interrupted > 0) {
                    ((ListItemElementHandler) li.handler).lines.add("");
                    loose = true;
                    interrupted = 0;
                }
                String text = line.body.substring(requiredIndent);
                ((ListItemElementHandler) li.handler).lines.add(text);
                return this;
            }

            if (interrupted == 0) {
                String text = line.body.replaceAll("^[ ]{0," + requiredIndent + "}+", "");
                ((ListItemElementHandler) li.handler).lines.add(text);
                return this;
            }

            return null;
        }

        @Override
        public boolean isCompletable() {
            return true;
        }

        @Override
        public Block completeBlock() {
            if (loose) {
                for (Element li : element.elements) {
                    if (!((ListItemElementHandler) li.handler).lines.getLast().isEmpty())
                        ((ListItemElementHandler) li.handler).lines.add("");
                }
            }
            return this;
        }
    }

    protected class BlockQuote extends Block {
        @Override
        public Block startBlock(Line line, Block block) {
            Matcher m;
            if ((m = Pattern.compile("^>[ ]?+(.*+)").matcher(line.text)).find()) {
                return new BlockQuote().setElement(
                        new Element("blockquote", new LinesElementsHandler(m.group(1)))
                );
            } else
                return null;
        }

        @Override
        public boolean isContinuable() {
            return true;
        }

        @Override
        public Block continueBlock(Line line) {
            if (interrupted > 0)
                return null;
            Matcher m;
            if (line.text.charAt(0) == '>' && (m = Pattern.compile("^>[ ]?+(.*+)").matcher(line.text)).find()) {
                ((LinesElementsHandler) element.handler).lines.add(m.group(1));
                return this;
            }
            if (interrupted == 0) {
                ((LinesElementsHandler) element.handler).lines.add(line.text);
                return this;
            }
            return null;
        }
    }

    protected static class BlockRule extends Block {
        @Override
        public Block startBlock(Line line, Block block) {
            char marker = line.text.charAt(0);
            int count = startSpan(line.text, marker);
            if (count >= 3 && line.text.trim().length() == count) {
                return new BlockRule().setElement(
                        new Element("hr")
                );
            } else
                return null;
        }
    }

    protected class BlockSetextHeader extends Block {
        @Override
        public Block startBlock(Line line, Block block) {
            if (block == null || !(block instanceof BlockParagraph) || block.interrupted > 0)
                return null;

            char marker = line.text.charAt(0);
            int count = startSpan(line.text, marker);
            if (line.indent < 4 && line.text.trim().length() == count) {
                block.element.name = marker == '=' ? "h1" : "h2";
                String text = ((LineElementsHandler) block.element.handler).text;
                block.element.attributes.put("id", generateHeaderId(text, marker == '=' ? 1 : 2));
                return block;
            } else
                return null;
        }
    }

    protected static String regexHtmlAttribute = "[a-zA-Z_:][\\w:.-]*+(?:\\s*+=\\s*+(?:[^\"\\'=<>`\\s]+|\"[^\"]*+\"|\\'[^\\']*+\\'))?+";
    protected static HashSet<String> textLevelElements = new HashSet<>(Arrays.asList(
            "a", "br", "bdo", "abbr", "blink", "nextid", "acronym", "basefont",
            "b", "em", "big", "cite", "small", "spacer", "listing",
            "i", "rp", "del", "code", "strike", "marquee",
            "q", "rt", "ins", "font", "strong",
            "s", "tt", "kbd", "mark",
            "u", "xm", "sub", "nobr",
            "sup", "ruby",
            "var", "span",
            "wbr", "time"
    ));

    protected class BlockMarkup extends Block {
        public String name;

        @Override
        public Block startBlock(Line line, Block block) {
            if (markupEscaped || safeMode)
                return null;
            Matcher m;
            if ((m = Pattern.compile("^<[\\/]?+(\\w*)(?:[ ]*+" + regexHtmlAttribute + ")*+[ ]*+(\\/)?>").matcher(line.text)).find()) {
                String element = m.group(1).toLowerCase();
                if (textLevelElements.contains(element))
                    return null;
                BlockMarkup b = new BlockMarkup();
                b.name = m.group(1);
                b.element = new Element();
                b.element.rawHtml = line.text;
                b.element.autoBreak = true;
                return b;
            } else
                return null;
        }

        @Override
        public boolean isContinuable() {
            return true;
        }

        @Override
        public Block continueBlock(Line line) {
            if (interrupted > 0)
                return null;
            element.rawHtml += "\n" + line.body;
            return this;
        }
    }

    protected class BlockReference extends Block {
        @Override
        public Block startBlock(Line line, Block block) {
            Matcher m;
            if (line.text.indexOf(']') >= 0 && (m = Pattern.compile("^\\[(.+?)\\]:[ ]*+<?(\\S+?)>?(?:[ ]+[\"\\'(](.+)[\"\\')])?[ ]*+$").matcher(line.text)).find()) {
                String id = m.group(1).toLowerCase();
                ReferenceData data = new ReferenceData(convertUrl(m.group(2)), m.group(3));
                referenceDefinitions.put(id, data);
                return new BlockReference().setElement(new Element());
            } else
                return null;
        }
    }

    protected class BlockTable extends Block {
        public ArrayList<String> alignments;

        @Override
        public Block startBlock(Line line, Block block) {
            if (block == null || !(block instanceof BlockParagraph) || block.interrupted > 0)
                return null;
            if (((LineElementsHandler) block.element.handler).text.indexOf('|') < 0
                    && line.text.indexOf('|') < 0
                    && line.text.indexOf(':') < 0
                    || ((LineElementsHandler) block.element.handler).text.indexOf('\n') >= 0)
                return null;
            if (!line.text.replaceAll("[ -:\\|]", "").isEmpty())
                return null;

            ArrayList<String> alignments = new ArrayList<>();

            String divider = line.text.trim().replaceAll("(^\\|+)|(\\|+$)", "");
            String[] dividerCells = divider.split("\\|");
            for (String dividerCell : dividerCells) {
                dividerCell = dividerCell.trim();
                if (dividerCell.isEmpty())
                    return null;
                String alignment = null;
                if (dividerCell.charAt(0) == ':')
                    alignment = "left";
                if (dividerCell.charAt(dividerCell.length() - 1) == ':')
                    alignment = alignment == null ? "right" : "center";
                alignments.add(alignment);
            }

            LinkedList<Element> headerElements = new LinkedList<>();

            String header = ((LineElementsHandler) block.element.handler).text;
            header = header.trim().replaceAll("(^\\|+)|(\\|+$)", "");
            String[] headerCells = header.split("\\|");
            if (headerCells.length != alignments.size())
                return null;

            int index = 0;
            for (String headerCell : headerCells) {
                headerCell = headerCell.trim();
                Element headerElement = new Element("th", new LineElementsHandler(headerCell));

                String alignment = alignments.get(index);
                if (alignment != null)
                    headerElement.attributes.put("style", "text-align:" + alignment);

                headerElements.add(headerElement);
                index++;
            }

            BlockTable b = new BlockTable();
            b.alignments = alignments;
            b.identified = true;
            b.setElement(new Element("table"));
            b.element.elements.add(new Element("thead"));
            b.element.elements.add(new Element("tbody"));
            Element headerRowElement = new Element("tr");
            headerRowElement.elements = headerElements;
            b.element.elements.getFirst().elements.add(headerRowElement);

            return b;
        }

        @Override
        public boolean isContinuable() {
            return true;
        }

        @Override
        public Block continueBlock(Line line) {
            if (interrupted > 0)
                return null;
            if (alignments.size() == 1 || line.text.charAt(0) == '|' || line.text.indexOf('|') > 0) {
                LinkedList<Element> elements = new LinkedList<>();
                String row = line.text.trim().replaceAll("(^\\|+)|(\\|+$)", "");
                Matcher m = Pattern.compile("(?:(\\\\[|])|[^|`]|`[^`]++`|`)++").matcher(row);
                int index = 0;
                while (index < alignments.size() && m.find()) {
                    String cell = m.group(0).trim();
                    Element element = new Element("td", new LineElementsHandler(cell));

                    String alignment = alignments.get(index);
                    if (alignment != null)
                        element.attributes.put("style", "text-align:" + alignment);

                    elements.add(element);
                    index++;
                }

                Element rowElement = new Element("tr");
                rowElement.elements = elements;
                element.elements.getLast().elements.add(rowElement);

                return this;
            } else
                return null;
        }
    }

    protected abstract static class Inline extends Component {
        public int extent;
        public int position = -1;

        public Inline() {
        }

        public Inline setExtent(String s) {
            this.extent = s.length();
            return this;
        }

        public Inline setExtent(int len) {
            this.extent = len;
            return this;
        }

        public Inline setElement(Element element) {
            this.element = element;
            return this;
        }

        public abstract Inline inline(String text, String context);
    }

    protected class InlineText extends Inline {
        @Override
        public Inline inline(String text, String context) {
            Inline inline = new InlineText().setExtent(text).setElement(new Element());
            inline.element.elements = replaceAllElements(
                    breaksEnabled ? "[ ]*+\\n" : "(?:[ ]*+\\\\|[ ]{2,}+)\\n",
                    new Element[]{
                            new Element("br"),
                            new Element(null, "\n")
                    },
                    text);
            return inline;
        }
    }

    protected static class InlineCode extends Inline {
        @Override
        public Inline inline(String text, String context) {
            char marker = text.charAt(0);
            Pattern regex = Pattern.compile("^([" + marker + "]++)[ ]*+(.+?)[ ]*+(?<![" + marker + "])\\1(?!" + marker + ")", Pattern.DOTALL);
            Matcher m = regex.matcher(text);
            if (m.find()) {
                text = m.group(2).replaceAll("[ ]*+\\n", " ");
                return new InlineCode().setExtent(m.group(0)).setElement(
                        new Element("code", text)
                );
            } else
                return null;
        }
    }

    protected static class InlineEmailTag extends Inline {
        @Override
        public Inline inline(String text, String context) {
            if (text.indexOf('>') < 0)
                return null;
            String hostnameLabel = "[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?";
            String commonMarkEmail = "[a-zA-Z0-9.!#$%&\\'*+\\/=?^_`{|}~-]++@"
                    + hostnameLabel + "(?:\\." + hostnameLabel + ")*";

            Matcher m = Pattern.compile("^<((mailto:)?" + commonMarkEmail + ")>", Pattern.CASE_INSENSITIVE).matcher(text);
            if (m.find()) {
                String url = m.group(1);
                if (m.group(2) == null)
                    url = "mailto:" + url;
                return new InlineEmailTag().setExtent(m.group(0)).setElement(
                        new Element("a", m.group(1)).addAttribute("href", url)
                );
            } else
                return null;
        }
    }

    protected static Pattern[] strongRegex = {
            Pattern.compile("^[*]{2}((?:\\\\\\*|[^*]|[*][^*]*+[*])+?)[*]{2}(?![*])", Pattern.DOTALL),
            Pattern.compile("^__((?:\\\\_|[^_]|_[^_]*+_)+?)__(?!_)", Pattern.DOTALL),
    };

    protected static Pattern[] emRegex = {
            Pattern.compile("^[*]((?:\\\\\\*|[^*]|[*][*][^*]+?[*][*])+?)[*](?![*])", Pattern.DOTALL),
            Pattern.compile("^_((?:\\\\_|[^_]|__[^_]*__)+?)_(?!_)\\b", Pattern.DOTALL),
    };

    protected class InlineEmphasis extends Inline {
        @Override
        public Inline inline(String text, String context) {
            if (text.length() < 2)
                return null;
            char marker = text.charAt(0);
            int markerIndex = marker == '*' ? 0 : 1;

            String emphasis;
            Matcher m;
            if (text.charAt(1) == marker && (m = strongRegex[markerIndex].matcher(text)).find())
                emphasis = "strong";
            else if ((m = emRegex[markerIndex].matcher(text)).find())
                emphasis = "em";
            else
                return null;

            return new InlineEmphasis().setExtent(m.group(0)).setElement(
                    new Element(emphasis, new LineElementsHandler(m.group(1)))
            );
        }
    }

    protected static String specialCharacters = "\\`*_{}[]()>#+-.!|~";

    protected static class InlineEscapeSequence extends Inline {
        @Override
        public Inline inline(String text, String context) {
            if (text.length() > 1 && specialCharacters.indexOf(text.charAt(1)) >= 0) {
                Element element = new Element();
                element.rawHtml = Character.toString(text.charAt(1));
                return new InlineEscapeSequence().setExtent(2).setElement(element);
            } else
                return null;
        }
    }

    protected class InlineImage extends Inline {
        @Override
        public Inline inline(String text, String context) {
            if (text.length() < 2 || text.charAt(1) != '[')
                return null;
            text = text.substring(1);

            Inline link = new InlineLink().inline(text, context);
            if (link == null)
                return null;

            Inline inline = new InlineImage().setExtent(link.extent + 1).setElement(new Element("img"));
            inline.element.autoBreak = true;
            inline.element.attributes.put("src", link.element.attributes.get("href"));
            inline.element.attributes.put("alt", ((LineElementsHandler) link.element.handler).text);

            for (Entry<String, String> attr : link.element.attributes.entrySet()) {
                if (!attr.getKey().equals("href"))
                    inline.element.attributes.put(attr.getKey(), attr.getValue());
            }

            return inline;
        }
    }

    protected class InlineLink extends Inline {
        @Override
        public Inline inline(String text, String context) {
            Element element = new Element("a", new LineElementsHandler(null));
            element.nonNestables.add(InlineUrl.class);
            element.nonNestables.add(InlineLink.class);

            int extent = 0;
            String remainder = text;

            Matcher m;
            // Parsedown original pattern: "\\[((?:[^][]++|(?R))*+)\\]" (does not compile in Java)
            if ((m = Pattern.compile("\\[((?:\\\\.|[^\\[\\]]|!\\[[^\\[\\]]*\\])*)\\]").matcher(remainder)).find()) {
                ((LineElementsHandler) element.handler).text = m.group(1);
                extent += m.group(0).length();
                remainder = remainder.substring(extent);
            } else
                return null;

            if ((m = Pattern.compile("^[(]\\s*+((?:[^ ()]++|[(][^ )]+[)])++)(?:[ ]+(\"[^\"]*+\"|\\'[^\\']*+\'))?\\s*+[)]").matcher(remainder)).find()) {
                element.attributes.put("href", convertUrl(m.group(1)));
                if (m.group(2) != null)
                    element.attributes.put("title", m.group(2).substring(1, m.group(2).length() - 1));
                extent += m.group(0).length();
            } else {
                String definition;
                if ((m = Pattern.compile("^\\s*\\[(.*?)\\]").matcher(remainder)).find()) {
                    definition = !m.group(1).isEmpty() ? m.group(1) :
                            ((LineElementsHandler) element.handler).text;
                    definition = definition.toLowerCase();
                    extent += m.group(0).length();
                } else {
                    definition = ((LineElementsHandler) element.handler).text.toLowerCase();
                }

                ReferenceData reference = referenceDefinitions.get(definition);
                if (reference == null)
                    return null;
                element.attributes.put("href", reference.url);
                element.attributes.put("title", reference.title);
            }

            return new InlineLink().setExtent(extent).setElement(element);
        }
    }

    protected class InlineMarkup extends Inline {
        @Override
        public Inline inline(String text, String context) {
            if (markupEscaped || safeMode || text.indexOf('>') < 0)
                return null;

            Matcher m;
            if (text.charAt(1) == '/' && (m = Pattern.compile("^<\\/\\w[\\w-]*+[ ]*+>", Pattern.DOTALL).matcher(text)).find()) {
                Element element = new Element();
                element.rawHtml = m.group(0);
                return new InlineMarkup().setExtent(m.group(0)).setElement(element);
            }
            if (text.charAt(1) == '!' && (m = Pattern.compile("^<!---?[^>-](?:-?+[^-])*-->", Pattern.DOTALL).matcher(text)).find()) {
                Element element = new Element();
                element.rawHtml = m.group(0);
                return new InlineMarkup().setExtent(m.group(0)).setElement(element);
            }
            if (text.charAt(1) != ' ' && (m = Pattern.compile("^<\\w[\\w-]*+(?:[ ]*+" + regexHtmlAttribute + ")*+[ ]*+\\/?>", Pattern.DOTALL).matcher(text)).find()) {
                Element element = new Element();
                element.rawHtml = m.group(0);
                return new InlineMarkup().setExtent(m.group(0)).setElement(element);
            }
            return null;
        }
    }

    protected static class InlineSpecialCharacter extends Inline {
        @Override
        public Inline inline(String text, String context) {
            Matcher m;
            if (text.length() > 1 && text.charAt(1) != ' ' && text.indexOf(';') >= 0 &&
                    (m = Pattern.compile("^&(#?+[0-9a-zA-Z]++);").matcher(text)).find()) {
                Element element = new Element();
                element.rawHtml = "&" + m.group(1) + ";";
                return new InlineSpecialCharacter().setExtent(m.group(0)).setElement(element);
            } else
                return null;
        }
    }

    protected class InlineStrikeThrough extends Inline {
        @Override
        public Inline inline(String text, String context) {
            if (text.length() < 2)
                return null;
            Matcher m;
            if (text.charAt(1) == '~' && (m = Pattern.compile("^~~(?=\\S)(.+?)(?<=\\S)~~").matcher(text)).find()) {
                return new InlineStrikeThrough().setExtent(m.group(0)).setElement(
                        new Element("del", new LineElementsHandler(m.group(1)))
                );
            } else
                return null;
        }
    }

    protected class InlineUrl extends Inline {
        @Override
        public Inline inline(String text, String context) {
            if (!urlsLinked || text.length() < 3 || text.charAt(2) != '/')
                return null;
            Matcher m;
            if (context.contains("http") && (m = Pattern.compile("\\bhttps?+:[\\/]{2}[^\\s<]+\\b\\/*+",
                    Pattern.CASE_INSENSITIVE).matcher(context)).find()) {
                String url = convertUrl(m.group(0));
                Inline inline = new InlineUrl().setExtent(url);
                inline.position = m.start(0);
                inline.element = new Element("a", url).addAttribute("href", url);
                return inline;
            } else
                return null;
        }
    }

    protected class InlineUrlTag extends Inline {
        @Override
        public Inline inline(String text, String context) {
            Matcher m;
            if (text.indexOf('>') >= 0 && (m = Pattern.compile("^<(\\w++:\\/{2}[^ >]++)>", Pattern.DOTALL).matcher(text)).find()) {
                String url = convertUrl(m.group(1));
                return new InlineUrlTag().setExtent(m.group(0)).setElement(
                        new Element("a", url).addAttribute("href", url)
                );
            } else
                return null;
        }
    }

    protected boolean breaksEnabled = false;
    protected boolean markupEscaped = false;
    protected boolean urlsLinked = true;
    protected boolean safeMode = false;
    protected boolean strictMode = false;

    protected String mdUrlReplacement = null;

    protected HashMap<String, ReferenceData> referenceDefinitions;
    protected HashMap<String, Integer> headerIds;

    public String title;
    protected int titleLevel;

    public String text(String text) {
        LinkedList<Element> elements = this.textElements(text);
        String markup = this.elements(elements);
        markup = markup.trim();
        return markup;
    }

    protected LinkedList<Element> textElements(String text) {
        referenceDefinitions = new HashMap<>();
        headerIds = new HashMap<>();
        title = null;
        titleLevel = 0;

        text = text.replaceAll("\\r\\n?", "\n");
        text = text.replaceAll("(^\\n+)|(\\n+$)", "");
        String[] lines = text.split("\n");
        return this.linesElements(lines);
    }

    public MarkdownParser setBreaksEnabled(boolean breaksEnabled) {
        this.breaksEnabled = breaksEnabled;
        return this;
    }

    public MarkdownParser setMarkupEscaped(boolean markupEscaped) {
        this.markupEscaped = markupEscaped;
        return this;
    }

    public MarkdownParser setUrlsLinked(boolean urlsLinked) {
        this.urlsLinked = urlsLinked;
        return this;
    }

    public MarkdownParser setSafeMode(boolean safeMode) {
        this.safeMode = safeMode;
        return this;
    }

    public MarkdownParser setStrictMode(boolean strictMode) {
        this.strictMode = strictMode;
        return this;
    }

    public MarkdownParser setMdUrlReplacement(String replacement) {
        this.mdUrlReplacement = replacement;
        return this;
    }

    protected void getBlockTypes(char marker, LinkedList<Block> types) {
        switch (marker) {
            case '#':
                types.add(new BlockHeader());
                return;
            case '*':
                types.add(new BlockRule());
                types.add(new BlockList());
                return;
            case '+':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                types.add(new BlockList());
                return;
            case '-':
                types.add(new BlockSetextHeader());
                types.add(new BlockTable());
                types.add(new BlockRule());
                types.add(new BlockList());
                return;
            case ':':
            case '|':
                types.add(new BlockTable());
                return;
            case '<':
                types.add(new BlockComment());
                types.add(new BlockMarkup());
                return;
            case '=':
                types.add(new BlockSetextHeader());
                return;
            case '>':
                types.add(new BlockQuote());
                return;
            case '[':
                types.add(new BlockReference());
                return;
            case '_':
                types.add(new BlockRule());
                return;
            case '`':
            case '~':
                types.add(new BlockFencedCode());
        }
    }

    protected void getUnmarkedBlockTypes(LinkedList<Block> types) {
        types.add(new BlockCode());
    }

    protected String lines(String[] lines) {
        return this.elements(this.linesElements(lines));
    }

    protected LinkedList<Element> linesElements(LinkedList<String> lines) {
        return linesElements(lines.toArray(new String[0]));
    }

    protected LinkedList<Element> linesElements(String[] lines) {
        LinkedList<Element> elements = new LinkedList<>();
        Block currentBlock = null;

        line:
        for (String line : lines) {
            if (line.trim().isEmpty()) {
                if (currentBlock != null)
                    currentBlock.interrupted++;
                continue;
            }

            int tabIndex;
            while ((tabIndex = line.indexOf('\t')) >= 0) {
                int shortage = 4 - tabIndex % 4;
                StringBuilder sb = new StringBuilder();
                sb.append(line.substring(0, tabIndex));
                for (int i = 0; i < shortage; i++)
                    sb.append(' ');
                sb.append(line.substring(tabIndex + 1));
                line = sb.toString();
            }

            Line lineObj = new Line(line);

            if (currentBlock != null && currentBlock.isContinuable()) {
                Block block = currentBlock.continueBlock(lineObj);
                if (block != null) {
                    currentBlock = block;
                    continue;
                } else if (currentBlock.isCompletable()) {
                    currentBlock = currentBlock.completeBlock();
                }
            }

            LinkedList<Block> blockTypes = new LinkedList<>();
            getUnmarkedBlockTypes(blockTypes);
            getBlockTypes(lineObj.text.charAt(0), blockTypes);

            for (Block blockType : blockTypes) {
                Block block = blockType.startBlock(lineObj, currentBlock);
                if (block != null) {
                    if (!block.identified) {
                        if (currentBlock != null) {
                            elements.add(currentBlock.extractElement());
                        }
                        block.identified = true;
                    }
                    currentBlock = block;
                    continue line;
                }
            }

            Block block = null;
            if (currentBlock instanceof BlockParagraph) {
                block = currentBlock.continueBlock(lineObj);
            }

            if (block != null) {
                currentBlock = block;
            } else {
                if (currentBlock != null) {
                    elements.add(currentBlock.extractElement());
                }
                currentBlock = new BlockParagraph().startBlock(lineObj, null);
                currentBlock.identified = true;
            }
        }

        if (currentBlock != null && currentBlock.isContinuable() && currentBlock.isCompletable()) {
            currentBlock = currentBlock.completeBlock();
        }
        if (currentBlock != null) {
            elements.add(currentBlock.extractElement());
        }

        return elements;
    }

    protected Inline[] getInlineTypes(char marker) {
        return switch (marker) {
            case '!' -> new Inline[]{new InlineImage()};
            case '&' -> new Inline[]{new InlineSpecialCharacter()};
            case '*', '_' -> new Inline[]{new InlineEmphasis()};
            case ':' -> new Inline[]{new InlineUrl()};
            case '<' -> new Inline[]{new InlineUrlTag(), new InlineEmailTag(), new InlineMarkup()};
            case '[' -> new Inline[]{new InlineLink()};
            case '`' -> new Inline[]{new InlineCode()};
            case '~' -> new Inline[]{new InlineStrikeThrough()};
            case '\\' -> new Inline[]{new InlineEscapeSequence()};
            default -> new Inline[]{};
        };
    }

    protected Pattern inlineMarkerList = Pattern.compile("[!\\*_&\\[:<`~\\\\]");

    public String line(String line) {
        return elements(lineElements(line, null));
    }

    protected LinkedList<Element> lineElements(String text, HashSet<Class<?>> nonNestables) {
        text = text.replaceAll("\\r\\n?", "\n");
        LinkedList<Element> elements = new LinkedList<>();
        if (nonNestables == null)
            nonNestables = new HashSet<>();

        text:
        for (; ; ) {
            Matcher m = inlineMarkerList.matcher(text);
            if (!m.find())
                break;
            int markerPosition = m.start();
            String excerpt = text.substring(markerPosition);

            for (Inline inlineType : getInlineTypes(excerpt.charAt(0))) {
                if (nonNestables.contains(inlineType.getClass()))
                    continue;
                Inline inline = inlineType.inline(excerpt, text);
                if (inline == null)
                    continue;

                if (inline.position >= 0 && inline.position > markerPosition)
                    continue;
                if (inline.position < 0)
                    inline.position = markerPosition;

                inline.element.nonNestables.addAll(nonNestables);

                String unmarkedText = text.substring(0, inline.position);
                elements.add(new InlineText().inline(unmarkedText, null).element);

                elements.add(inline.extractElement());

                text = text.substring(inline.position + inline.extent);
                continue text;
            }

            String unmarkedText = text.substring(0, markerPosition + 1);
            elements.add(new InlineText().inline(unmarkedText, null).element);

            text = text.substring(markerPosition + 1);
        }

        elements.add(new InlineText().inline(text, null).element);

        for (Element element : elements) {
            if (element.autoBreak == null)
                element.autoBreak = false;
        }

        return elements;
    }

    protected String generateHeaderId(String text, int level) {
        if (title == null || titleLevel > level) {
            title = text;
            titleLevel = level;
        }

        String headerId = text.toLowerCase().replaceAll("&#?+[0-9a-zA-Z]++;", "").replaceAll("[^_\\p{L}\\d\\s]", "").replaceAll("\\s+", "-");
        try {
            //noinspection CharsetObjectCanBeUsed
            headerId = URLEncoder.encode(headerId, "UTF-8");
        } catch (UnsupportedEncodingException ignored) {
        }

        Integer count = headerIds.get(headerId);
        if (count == null) {
            headerIds.put(headerId, 1);
        } else {
            headerId += "-" + count;
            headerIds.put(headerId, count + 1);
        }

        return headerId;
    }

    protected String convertUrl(String url) {
        if (mdUrlReplacement == null || url.indexOf(':') >= 0)
            return url;
        Matcher m = Pattern.compile("(\\.md)(#.*)?$").matcher(url);
        if (m.find())
            return m.replaceFirst(mdUrlReplacement + "$2");
        else
            return url;
    }

    protected String element(Element element) {
        if (safeMode)
            element = sanitiseElement(element);
        element = element.handle();
        boolean hasName = element.name != null;

        StringBuilder markup = new StringBuilder();

        if (hasName) {
            markup.append("<");
            markup.append(element.name);
            for (Entry<String, String> attribute : element.attributes.entrySet()) {
                if (attribute.getValue() == null)
                    continue;
                markup.append(String.format(" %s=\"%s\"", attribute.getKey(), escape(attribute.getValue())));
            }
        }

        boolean permitRawHtml = false;

        String text = null;
        if (element.text != null)
            text = element.text;
        else if (element.rawHtml != null) {
            text = element.rawHtml;
            boolean allowRawHtmlInSafeMode = false;
            permitRawHtml = !safeMode || allowRawHtmlInSafeMode;
        }

        boolean hasContent = text != null || !element.elements.isEmpty();
        if (hasContent) {
            if (hasName) markup.append(">");
            if (!element.elements.isEmpty()) {
                markup.append(elements(element.elements));
            } else if (text != null) {
                if (!permitRawHtml)
                    markup.append(escape(text, true));
                else
                    markup.append(text);
            }

            if (hasName) {
                markup.append("</");
                markup.append(element.name);
                markup.append(">");
            }
        } else if (hasName) {
            markup.append("/>");
        }
        return markup.toString();
    }

    protected String elements(LinkedList<Element> elements) {
        StringBuilder markup = new StringBuilder();

        boolean autoBreak = true;
        for (Element element : elements) {
            if (element.name == null && element.rawHtml == null && element.text == null && elements.isEmpty()) // empty
                continue;

            boolean autoBreakNext = element.autoBreak != null ? element.autoBreak : element.name != null;
            autoBreak = autoBreak && autoBreakNext;

            if (autoBreak) markup.append("\n");
            markup.append(element(element));
            autoBreak = autoBreakNext;
        }
        if (autoBreak) markup.append("\n");

        return markup.toString();
    }

    protected static Pattern goodAttribute = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-_]*+$");
    protected static HashMap<String, String> safeUrlNameToAtt;

    static {
        safeUrlNameToAtt = new HashMap<>();
        safeUrlNameToAtt.put("a", "href");
        safeUrlNameToAtt.put("img", "src");
    }

    protected Element sanitiseElement(Element element) {
        if (element.name == null) {
            element.attributes.clear();
            return element;
        }

        String urlAtt = safeUrlNameToAtt.get(element.name);
        if (urlAtt != null) {
            element = filterUnsafeUrlInAttribute(element, urlAtt);
        }

        LinkedList<String> attributeNames = new LinkedList<>(element.attributes.keySet());
        for (String att : attributeNames) {
            if (!goodAttribute.matcher(att).find())
                element.attributes.remove(att);
            else if (att.toLowerCase().startsWith("on"))
                element.attributes.remove(att);
        }

        return element;
    }

    protected String[] safeLinksWhitelist = {
            "http://",
            "https://",
            "ftp://",
            "ftps://",
            "mailto:",
            "tel:",
            "data:image/png;base64,",
            "data:image/gif;base64,",
            "data:image/jpeg;base64,",
            "irc:",
            "ircs:",
            "git:",
            "ssh:",
            "news:",
            "steam:"
    };

    protected Element filterUnsafeUrlInAttribute(Element element, String attribute) {
        String attr = element.attributes.get(attribute);
        if (attr != null) {
            for (String scheme : safeLinksWhitelist) {
                if (attr.toLowerCase().startsWith(scheme))
                    return element;
            }
        }
        element.attributes.put(attribute, attr.replaceAll(":", "%3A"));
        return element;
    }

    protected static LinkedList<Element> replaceAllElements(String regex, Element[] elements, String text) {
        LinkedList<Element> newElements = new LinkedList<>();
        Matcher m = Pattern.compile(regex).matcher(text);
        int end = 0;
        while (m.find()) {
            String before = text.substring(end, m.start());
            newElements.add(new Element(null, before));
            newElements.addAll(Arrays.asList(elements));
            end = m.end();
        }
        newElements.add(new Element(null, text.substring(end)));
        return newElements;
    }

    public static String escape(String s) {
        return escape(s, false);
    }

    public static String escape(String s, boolean allowQuotes) {
        s = s.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        if (!allowQuotes)
            s = s.replaceAll("\\\"", "&quot;").replaceAll("'", "&#039;");
        return s;
    }

    public static int startSpan(String s, char c) {
        int i = 0;
        int len = s.length();
        while (i < len && s.charAt(i) == c) i++;
        return i;
    }
}
