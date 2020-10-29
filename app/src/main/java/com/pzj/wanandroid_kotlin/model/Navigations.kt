package com.pzj.wanandroid_kotlin.model

data class Navigations(
    val cid: Int,
    val name: String,
    var isSelected: Boolean,
    val articles: List<NavigationData>
) {
    override fun toString(): String {
        return "Navigations(cid=$cid, name='$name', isSelected=$isSelected, articles=$articles)"
    }
}

data class NavigationData(
    val id: Int,
    val link: String,
    val title: String,
    val chapterId: Int
) {
    override fun toString(): String {
        return "NavigationData(id=$id, link='$link', title='$title', chapterId=$chapterId)"
    }
}