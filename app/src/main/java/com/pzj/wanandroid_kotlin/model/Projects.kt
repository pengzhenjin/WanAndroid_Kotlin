package com.pzj.wanandroid_kotlin.model

/**
 * @description: Projects
 * @author: pengzhenjin
 * @date: 2020/10/29
 */
data class Projects(
    val curPage: Int,
    val offset: Int,
    val pageCount: Int,
    val size: Int,
    val total: Int,
    val over: Boolean,
    val datas: List<ProjectData>
) {
    override fun toString(): String {
        return "Projects(curPage=$curPage, offset=$offset, pageCount=$pageCount, size=$size," +
                " total=$total, over=$over, datas=$datas)"
    }
}

data class ProjectData(
    val id: Int,
    val author: String,
    val desc: String,
    val envelopePic: String,
    val link: String,
    val niceDate: String,
    val title: String,
    val shareUser: String
) {
    override fun toString(): String {
        return "ProjectData(id=$id, author='$author', desc='$desc', envelopePic='$envelopePic'," +
                " link='$link', niceDate='$niceDate', title='$title', shareUser='$shareUser')"
    }

}