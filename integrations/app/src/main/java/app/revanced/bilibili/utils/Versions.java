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

    public static boolean ge7_62_0() {
        return KtUtils.getVersionCode() >= 7620000;
    }

    public static boolean ge7_64_0() {
        return KtUtils.getVersionCode() >= 7640000;
    }

    public static boolean ge7_68_0() {
        return KtUtils.getVersionCode() >= 7680000;
    }

    public static boolean ge7_70_0() {
        return KtUtils.getVersionCode() >= 7700000;
    }

    public static boolean ge7_75_0() {
        return KtUtils.getVersionCode() >= 7750000;
    }

    public static boolean ge7_76_0() {
        return KtUtils.getVersionCode() >= 7760000;
    }

    public static boolean ge7_80_0() {
        return KtUtils.getVersionCode() >= 7800000;
    }

    public static boolean ge8_5_0() {
        return KtUtils.getVersionCode() >= 8050000;
    }

    public static boolean ge8_9_0() {
        return KtUtils.getVersionCode() >= 8090000;
    }

    public static boolean atLeast(String version) {
        String[] split = version.split("\\.");
        if (split.length != 3)
            return false;
        int versionCode = Integer.parseInt(split[0]) * 1000_000
                + Integer.parseInt(split[1]) * 10_000
                + Integer.parseInt(split[2]) * 1_000;
        return KtUtils.getVersionCode() >= versionCode;
    }
}
