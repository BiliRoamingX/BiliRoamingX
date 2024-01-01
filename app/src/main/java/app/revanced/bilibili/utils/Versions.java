package app.revanced.bilibili.utils;

public class Versions {
    public static boolean ge7_39_0() {
        return KtUtils.getVersionCode() >= 7390300;
    }

    public static boolean ge7_47_0() {
        return KtUtils.getVersionCode() >= 7470300;
    }

    public static boolean ge7_48_0() {
        return KtUtils.getVersionCode() >= 7480200;
    }

    public static boolean ge7_63_0() {
        return KtUtils.getVersionCode() >= 7630000;
    }
}
