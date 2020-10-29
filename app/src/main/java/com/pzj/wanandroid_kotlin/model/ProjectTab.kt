package com.pzj.wanandroid_kotlin.model

/**
 * @description: ProjectTab
 * @author: pengzhenjin
 * @date: 2020/10/29
 */
data class ProjectTab(
    val id: Int,
    val courseId: Int,
    val name: String,
    val order: Int,
    val visible: Int
) {
    override fun toString(): String {
        return "ProjectTab(id=$id, courseId=$courseId, name='$name', order=$order, visible=$visible)"
    }
}