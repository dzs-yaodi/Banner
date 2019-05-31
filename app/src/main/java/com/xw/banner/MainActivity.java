package com.xw.banner;

import android.content.Context;
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

        setBanner(mBanner1,1);
        setBanner(mBanner2,2);
        setBanner(mBanner3,3);
    }

    private void setBanner(Banner banner,int style) {

        //设置banner样式
        // 设置图片加载器
        if (style == 1){
            banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
            banner.setImageLoader(new OrdinaryImageLoder());
        }else if (style == 2){
            banner.setBannerStyle(BannerConfig.CUSTOM_INDICATOR);
            banner.setImageLoader(new CustomRoundedImageLoader());
        }else{
            banner.setBannerStyle(BannerConfig.CUSTOM_INDICATOR);
            banner.setImageLoader(new OrdinaryImageLoder());
        }

        // 设置banner动画效果
        banner.setBannerAnimation(Transformer.RotateDown);

        // 设置轮播时间
        banner.setDelayTime(2000);
        // 设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.RIGHT);

        // 设置图片集合
        banner.setImages(integerList);
        // 设置标题集合（当banner样式有显示title时）
        banner.setBannerTitles(stringList);

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
}
