package com.xw.banner;

public class TitleData {

    private String title;
    private int isAdv;

    public TitleData(String title, int isAdv) {
        this.title = title;
        this.isAdv = isAdv;
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
}
