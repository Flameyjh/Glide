package com.yjh.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Glide.with
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iv:ImageView = findViewById(R.id.iv)

        //--------------------------------方法一------------------------------
//        //设置占位符
//        val requestionOptions: RequestOptions = RequestOptions()
//            .placeholder(R.drawable.hold) //正在请求图片时展示的图片
//            .error(R.drawable.error) //请求失败
//            .fallback(R.drawable.empty) //请求为null
//            .override(100, 100)
//
//        //设置过渡动画
//        val factory: DrawableCrossFadeFactory = DrawableCrossFadeFactory.Builder().setCrossFadeEnabled(true).build()
//
//        //加载图片
//        Glide.with(this)
//            .load("https://c-ssl.duitang.com/uploads/item/201812/02/20181202104909_xsvsm.jpeg")
//            .apply(requestionOptions) //设置占位符
//            .transition(DrawableTransitionOptions.withCrossFade(factory)) //设置交叉淡入效果
//            .transform(RoundedCorners(20)) //变换：圆角、旋转等
//            .into(iv)


        //--------------方法二:1.使用GlideApp省略RequestOptions的创建。2.把options的设置放到default函数里------------------------------------------
        GlideApp.with(this).load("https://c-ssl.duitang.com/uploads/item/201812/02/20181202104909_xsvsm.jpeg").defaultImg().into(iv)

    }
}