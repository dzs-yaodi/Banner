package com.xw.banner;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.sobey.banner.Banner;
import com.sobey.banner.BannerConfig;
import com.sobey.banner.Transformer;
import com.sobey.banner.loader.ImageLoader;
import com.sobey.banner.loader.ImageLoaderInterface;
import com.sobey.banner.view.RoundAngleImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Banner mBanner1;
    private Banner mBanner2;
    private List<Integer> integerList = new ArrayList<>();
    private List<String> stringList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBanner1 = findViewById(R.id.banner1);
        mBanner2 = findViewById(R.id.banner2);

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

    //设置banner样式
        mBanner1.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        mBanner2.setBannerStyle(BannerConfig.CUSTOM_INDICATOR);
        // 设置图片加载器
        mBanner1.setImageLoader(new OrdinaryImageLoder());
        mBanner2.setImageLoader(new CustomRoundedImageLoader());

        // 设置banner动画效果
        mBanner1.setBannerAnimation(Transformer.RotateDown);
        mBanner2.setBannerAnimation(Transformer.RotateDown);

        // 设置轮播时间
        mBanner1.setDelayTime(2000);
        mBanner2.setDelayTime(2000);
        // 设置指示器位置（当banner模式中有指示器时）
        mBanner1.setIndicatorGravity(BannerConfig.RIGHT);
        mBanner2.setIndicatorGravity(BannerConfig.RIGHT);

        // 设置图片集合
        mBanner1.setImages(integerList);
        mBanner2.setImages(integerList);
        // 设置标题集合（当banner样式有显示title时）
        mBanner1.setBannerTitles(stringList);
        mBanner2.setBannerTitles(stringList);

        mBanner1.start();
        mBanner2.start();
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
}
