package com.yjh.glide

import com.bumptech.glide.annotation.GlideExtension
import com.bumptech.glide.annotation.GlideOption
import com.bumptech.glide.request.BaseRequestOptions

//使得defaultImg可用

@GlideExtension
object MyAppExtension{ //构造函数私有化

    @JvmStatic
    @GlideOption
    fun defaultImg(options: BaseRequestOptions<*>) : BaseRequestOptions<*>{ //*表示通配符
        return options
            .placeholder(R.drawable.hold)
            .error(R.drawable.error)
            .fallback(R.drawable.empty)
    }


}