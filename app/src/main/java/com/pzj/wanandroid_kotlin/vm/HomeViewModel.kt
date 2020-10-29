package com.pzj.wanandroid_kotlin.vm

import androidx.lifecycle.viewModelScope
import com.pzj.wanandroid_kotlin.base.BaseViewModel
import com.pzj.wanandroid_kotlin.repository.HomeRepository
import kotlinx.coroutines.launch

/**
 * @description: HomeViewModel
 * @author: pengzhenjin
 * @date: 2020/10/29
 */
class HomeViewModel : BaseViewModel<HomeRepository>() {

    fun getBannerList() {
        viewModelScope.launch {
            val bannerList = repository.getBannerList()
        }
    }

}