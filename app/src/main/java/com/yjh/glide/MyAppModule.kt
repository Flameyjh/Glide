package com.yjh.glide

import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule

//使得GlideApp可用

@GlideModule
class MyAppModule : AppGlideModule() {

}