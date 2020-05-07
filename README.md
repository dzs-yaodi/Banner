# Banner

[原文链接:https://github.com/youth5201314/banner](https://github.com/youth5201314/banner)

[参考:https://github.com/wenchaosong/Banner](https://github.com/wenchaosong/Banner)

使用

allprojects {

		repositories {
        
			...
            
			maven { url 'https://jitpack.io' }
            
		}
        
	}
    
     implementation 'com.github.dzs-yaodi:Banner:1.2'

该lib是直接在youth.banner 源码上修改的，因为原库设置选中属性的时候，显示的效果是方形的

app:indicator_drawable_selected="@drawable/banner_selected_shape" 设置的宽度没有效果。

本来参考第二个库的那个哥们是实现了这个效果的，但是我依赖的时候一直出问题，所以打算直接自己改源码。

在看了他的设计思想之后，我直接在 youth 的源码上做了一点点修改。


先上一个效果图

![效果图](https://github.com/XW837156540/Banner/raw/master/app/src/main/res/drawable/result.jpg)


第一个banner 就是原来的操作方式，没有任何改变。

第二个banner  实现了圆角的图片 和 圆角矩形指示器， 需要多做几步操作

    1、需要在imageLoder中 返回圆角ImageView ,这个方法也是原有库中就已经封好的方法。
    
    2、需要自己新建一个布局，复制出原来的banner.xml文件，需要修改指示器的背景为下边带圆角的，所以需要自己写布局，布局中id需要banner中的相同，
    
    app:banner_layout="@layout/banner_layout"  在layout中给底部指示器设置底部带圆角的背景xml
    
    设置指示器的方法还是和原来一样，通过原来暴露的属性，直接新建两个shape 的xml文件，注意两个文件都要设置宽高。

    app:indicator_drawable_selected="@drawable/banner_selected_shape"

    app:indicator_drawable_unselected="@drawable/banner_unselected_shape"
   
    3、设置选中 和没有选中时 指示器的样式，可自定义。
    
第三个banner 就是使用普通样式，修改了指示器

指示器类型说明  BannerConfig

    //不设置指示器
 
    public static final int NOT_INDICATOR = 0;
    
    //圆形指示器无标题
    
    public static final int CIRCLE_INDICATOR = 1;
    
    //数字圆形背景指示器不带标题
    
    public static final int NUM_INDICATOR = 2;
    
    //数字无背景指示器带标题
    
    public static final int NUM_INDICATOR_TITLE = 3;
    
    //圆角指示器带标题
    
    public static final int CIRCLE_INDICATOR_TITLE_INSIDE = 5;
    
    //圆角矩形指示器
    
    public static final int CUSTOM_INDICATOR = 6;


更新

Banner1.2 处理圆角矩形指示器不设置标题闪退的问题

![效果图](https://github.com/XW837156540/Banner/raw/master/app/src/main/res/drawable/no_title.jpg)

Banner1.2.1 标题处新增广告标签，设置banner title的时候传入 TitleData 的集合 ，不再是string 集合





