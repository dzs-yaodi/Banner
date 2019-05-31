# Banner

[原文链接]（https://github.com/youth5201314/banner） 

[参考](https://github.com/wenchaosong/Banner)

该lib是直接在youth.banner 源码上修改的，因为原库设置选中属性的时候，显示的效果是方形的

app:indicator_drawable_selected="@drawable/banner_selected_shape" 设置的宽度没有效果。

本来参考 库的哥们是实现了这个效果的，但是我依赖的时候一直出问题，所以打算直接自己改源码。

在看了他的设计思想之后，我直接在 youth 的源码上做了一点修改。

使用方式还是和原来一样，通过原来暴露的属性，直接新建两个shape 的xml文件，注意两个文件都要设置宽高。

app:indicator_drawable_selected="@drawable/banner_selected_shape"

app:indicator_drawable_unselected="@drawable/banner_unselected_shape"

![]（https://github.com/XW837156540/Banner/raw/master/app/src/main/res/drawable/result.jpg）


