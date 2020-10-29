package com.pzj.wanandroid_kotlin.base

import android.os.Bundle
import androidx.activity.viewModels

/**
 * @desc: BaseVMActivity
 * @author: pengzhenjin
 * @date: 2020/10/28
 */
abstract class BaseVMActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startDataObserver()
    }

    /**
     * 开启数据观察者
     */
    abstract fun startDataObserver()
}