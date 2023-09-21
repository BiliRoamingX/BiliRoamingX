package app.revanced.bilibili.utils;

public class Versions {
    public static boolean ge7_39_0() {
        return KtUtils.getVersionCode() >= 7390300;
    }

    public static boolean ge7_47_0() {
        return KtUtils.getVersionCode() >= 7470300;
    }
}
