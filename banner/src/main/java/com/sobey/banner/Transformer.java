package com.sobey.banner;


import android.support.v4.view.ViewPager;

import com.sobey.banner.transformer.AccordionTransformer;
import com.sobey.banner.transformer.BackgroundToForegroundTransformer;
import com.sobey.banner.transformer.CubeInTransformer;
import com.sobey.banner.transformer.CubeOutTransformer;
import com.sobey.banner.transformer.DefaultTransformer;
import com.sobey.banner.transformer.DepthPageTransformer;
import com.sobey.banner.transformer.FlipHorizontalTransformer;
import com.sobey.banner.transformer.FlipVerticalTransformer;
import com.sobey.banner.transformer.ForegroundToBackgroundTransformer;
import com.sobey.banner.transformer.RotateDownTransformer;
import com.sobey.banner.transformer.RotateUpTransformer;
import com.sobey.banner.transformer.ScaleInOutTransformer;
import com.sobey.banner.transformer.StackTransformer;
import com.sobey.banner.transformer.TabletTransformer;
import com.sobey.banner.transformer.ZoomInTransformer;
import com.sobey.banner.transformer.ZoomOutSlideTransformer;
import com.sobey.banner.transformer.ZoomOutTranformer;

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
