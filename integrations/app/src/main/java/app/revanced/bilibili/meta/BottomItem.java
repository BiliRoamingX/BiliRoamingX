package app.revanced.bilibili.meta;

import java.util.Objects;

public class BottomItem {
    public String name;
    public String uri;
    public String id;

    public BottomItem(String name, String uri, String id) {
        this.name = name;
        this.uri = uri;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BottomItem that = (BottomItem) o;
        return Objects.equals(name, that.name) && Objects.equals(uri, that.uri) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, uri, id);
    }
}
