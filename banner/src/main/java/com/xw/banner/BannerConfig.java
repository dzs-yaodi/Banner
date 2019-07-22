package com.xw.banner;


public class BannerConfig {
    /**
     * indicator style
     */
    //不设置指示器
    public static final int NOT_INDICATOR = 0;
    //圆形指示器无标题
    public static final int CIRCLE_INDICATOR = 1;
    //数字圆形背景指示器不带标题
    public static final int NUM_INDICATOR = 2;
    //数字无背景指示器带标题
    public static final int NUM_INDICATOR_TITLE = 3;
//    public static final int CIRCLE_INDICATOR_TITLE = 4;

    //圆角指示器带标题
    public static final int CIRCLE_INDICATOR_TITLE_INSIDE = 5;
    //圆角矩形指示器
    public static final int CUSTOM_INDICATOR = 6;
    /**
     * indicator gravity
     */
    public static final int LEFT = 5;
    public static final int CENTER = 6;
    public static final int RIGHT = 7;

    /**
     * banner
     */
    public static final int PADDING_SIZE = 5;
    public static final int TIME = 2000;
    public static final int DURATION = 800;
    public static final boolean IS_AUTO_PLAY = true;
    public static final boolean IS_SCROLL = true;

    /**
     * title style
     */
    public static final int TITLE_BACKGROUND = -1;
    public static final int TITLE_HEIGHT = -1;
    public static final int TITLE_TEXT_COLOR = -1;
    public static final int TITLE_TEXT_SIZE = -1;

}
