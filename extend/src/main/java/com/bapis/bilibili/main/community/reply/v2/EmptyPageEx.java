package com.bapis.bilibili.main.community.reply.v2;

public class EmptyPageEx {
    public static void clearLeftButton(EmptyPage emptyPage) {
        EmptyPage.access$3100(emptyPage);
    }

    public static void clearRightButton(EmptyPage emptyPage) {
        EmptyPage.access$3400(emptyPage);
    }

    public static void clearTexts(EmptyPage emptyPage) {
        EmptyPage.access$2700(emptyPage);
    }

    public static void addTexts(EmptyPage emptyPage, EmptyPage.Text text) {
        EmptyPage.access$2400(emptyPage, text);
    }
}
