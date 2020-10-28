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
    }
}