package com.xw.banner;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.xw.banner.loader.ImageLoader;
import com.xw.banner.loader.ImageLoaderInterface;
import com.xw.banner.view.RoundAngleImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Banner mBanner1;
    private Banner mBanner2;
    private Banner mBanner3;
    private List<Integer> integerList = new ArrayList<>();
    private List<String> stringList = new ArrayList<>();
    private List<TitleData> titleDatas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBanner1 = findViewById(R.id.banner1);
        mBanner2 = findViewById(R.id.banner2);
        mBanner3 = findViewById(R.id.banner3);

        integerList.add(R.mipmap.image1);
        integerList.add(R.mipmap.image2);
        integerList.add(R.mipmap.image3);
        integerList.add(R.mipmap.image4);
        integerList.add(R.mipmap.image5);

        stringList.add("这是标题1");
        stringList.add("这是标题2");
        stringList.add("这是标题3");
        stringList.add("这是标题4");
        stringList.add("这是标题5");

        titleDatas.add(new TitleData("这是标题1",0,"广告1"));
        titleDatas.add(new TitleData("这是标题2",1,"广告2"));
        titleDatas.add(new TitleData("这是标题3",0,"广告3"));
        titleDatas.add(new TitleData("这是标题4",1,"广告4"));
        titleDatas.add(new TitleData("这是标题5",0,"广告5"));

        setBanner(mBanner1,1);
//        setBanner(mBanner2,2);
//        setBanner(mBanner3,3);
    }

    private void setBanner(Banner banner,int style) {

        //设置banner样式
        // 设置图片加载器
        if (style == 1){
            banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
            banner.setOffscreenPageLimit(10);
            banner.setClipToPadding(false);
            banner.setPadding(32,20,32,0);
            banner.setPageMargin(16);
            banner.setPageTransformer(true, new ScalePageTransformer());
            banner.setImageLoader(new OrdinaryImageLoder());
            // 设置banner动画效果
            banner.setBannerAnimation(Transformer.ZoomOutSlide);
        }else if (style == 2){
            banner.setBannerStyle(BannerConfig.CUSTOM_INDICATOR);
            banner.setImageLoader(new CustomRoundedImageLoader());
            // 设置banner动画效果
            banner.setBannerAnimation(Transformer.CubeIn);
        }else{
            banner.setBannerStyle(BannerConfig.CUSTOM_INDICATOR);
            banner.setImageLoader(new OrdinaryImageLoder());
            // 设置banner动画效果
            banner.setBannerAnimation(Transformer.CubeOut);
        }

        // 设置轮播时间
        banner.setDelayTime(2000);
        // 设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.RIGHT);

        // 设置图片集合
        banner.setImages(integerList);
        // 设置标题集合（当banner样式有显示title时）
//        xw_banner.setBannerTitles(stringList);
        banner.setBannerTitles(titleDatas);

        banner.start();
    }

    private class CustomRoundedImageLoader implements ImageLoaderInterface {

        @Override
        public void displayImage(Context context, Object path, View imageView) {
            Glide.with(context).load(path).into((ImageView) imageView);
        }

        @Override
        public ImageView createImageView(Context context) {
            RoundAngleImageView roundedImg = new RoundAngleImageView(context);
            return roundedImg;
        }
    }

    private class OrdinaryImageLoder extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load(path).into((ImageView) imageView);
        }
    }

    /**
     * view pager 变化效果
     */
    private static class ScalePageTransformer implements ViewPager.PageTransformer {
        private float MIN_SCALE = 0.8f;

        @Override
        public void transformPage(@NonNull View view, float position) {
            //position表示执行动画的view相对于当前正中心view（屏幕中心的视图）偏移量
            //-1表示距离中心正好向前偏移1个视图单位，同理1表示向后偏移一个视图单位
            if (position >= -1.5 && position <= 1.5) { // [-1.5,1.5]
                //这里偏移量限定到1.5而不是1的原因如下
                //因为左右间距的关系导致偏移量为1时可能并不是指向当前页的下一页，导致不能正常设置下一页的缩放
                //所以适当把范围扩大一些
                float scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position));
                view.setScaleY(scaleFactor);
            }
        }
    }
}
