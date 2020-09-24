package com.xw.banner;

public class TitleData {

    private String title;
    private int isAdv;
    private String tag;

    public TitleData(String title) {
        this.title = title;
    }

    public TitleData(String title, int isAdv, String tag) {
        this.title = title;
        this.isAdv = isAdv;
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int isAdv() {
        return isAdv;
    }

    public void setAdv(int adv) {
        isAdv = adv;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
