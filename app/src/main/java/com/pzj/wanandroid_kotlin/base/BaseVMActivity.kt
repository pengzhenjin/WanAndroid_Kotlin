package com.pzj.wanandroid_kotlin.base

import android.os.Bundle

/**
 * @desc: BaseVMActivity
 * @author: pengzhenjin
 * @date: 2020/10/28
 */
abstract class BaseVMActivity<T : BaseViewModel> : BaseActivity() {
//    val viewModel: T by activityViewModels()
//private val T by activityViewModels<T>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}