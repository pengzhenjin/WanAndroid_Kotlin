package com.pzj.wanandroid_kotlin.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @desc: BaseActivity
 * @author: pengzhenjin
 * @date: 2020/10/28
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initView()
        initEvent()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    /**
     * 获取布局文件id
     */
    abstract fun getLayoutId(): Int

    /**
     * 初始化 View
     */
    open fun initView() {}

    /**
     * 初始化事件
     */
    open fun initEvent() {}
}