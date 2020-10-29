package com.pzj.wanandroid_kotlin.model

/**
 * @description: Trees
 * @author: pengzhenjin
 * @date: 2020/10/29
 */
data class Trees(
    val children: List<TreeData>,
    val name: String,
    val id: Int,
    val visible: Int
) {
    override fun toString(): String {
        return "Trees(children=$children, name='$name', id=$id, visible=$visible)"
    }
}

data class TreeData(
    val name: String,
    val id: Int,
    val visible: Int
) {
    override fun toString(): String {
        return "TreeData(name='$name', id=$id, visible=$visible)"
    }
}