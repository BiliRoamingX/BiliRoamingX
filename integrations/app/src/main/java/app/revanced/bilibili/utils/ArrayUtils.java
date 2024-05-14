package app.revanced.bilibili.utils;

import java.util.Collection;

public class ArrayUtils {
    public static boolean contains(long[] array, long e) {
        for (long l : array) if (l == e) return true;
        return false;
    }

    public static long[] toLongArray(Collection<? extends String> collection) {
        var result = new long[collection.size()];
        var i = 0;
        for (String s : collection)
            result[i++] = Long.parseLong(s);
        return result;
    }

    public static boolean contains(int[] array, int e) {
        for (int l : array) if (l == e) return true;
        return false;
    }

    public static int[] toIntArray(Collection<String> collection) {
        var result = new int[collection.size()];
        var i = 0;
        for (String s : collection)
            result[i++] = Integer.parseInt(s);
        return result;
    }
}
