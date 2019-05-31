package com.xw.banner;


import android.support.v4.view.ViewPager;

import com.xw.banner.transformer.AccordionTransformer;
import com.xw.banner.transformer.BackgroundToForegroundTransformer;
import com.xw.banner.transformer.CubeInTransformer;
import com.xw.banner.transformer.CubeOutTransformer;
import com.xw.banner.transformer.DefaultTransformer;
import com.xw.banner.transformer.DepthPageTransformer;
import com.xw.banner.transformer.FlipHorizontalTransformer;
import com.xw.banner.transformer.FlipVerticalTransformer;
import com.xw.banner.transformer.ForegroundToBackgroundTransformer;
import com.xw.banner.transformer.RotateDownTransformer;
import com.xw.banner.transformer.RotateUpTransformer;
import com.xw.banner.transformer.ScaleInOutTransformer;
import com.xw.banner.transformer.StackTransformer;
import com.xw.banner.transformer.TabletTransformer;
import com.xw.banner.transformer.ZoomInTransformer;
import com.xw.banner.transformer.ZoomOutSlideTransformer;
import com.xw.banner.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends ViewPager.PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
