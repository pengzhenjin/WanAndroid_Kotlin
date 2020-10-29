package com.pzj.wanandroid_kotlin.model

/**
 * @description: Banner
 * @author: pengzhenjin
 * @date: 2020/10/29
 */
data class Banner(
    val desc: String,
    val id: Int,
    val imagePath: String,
    val isVisible: Int,
    val order: Int,
    val title: String,
    val type: Int,
    val url: String
) {
    override fun toString(): String {
        return "Banner(desc='$desc', id=$id, imagePath='$imagePath', isVisible=$isVisible, " +
                "order=$order, title='$title', type=$type, url='$url')"
    }

}