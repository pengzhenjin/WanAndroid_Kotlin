package com.pzj.wanandroid_kotlin.vm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.pzj.wanandroid_kotlin.base.BaseViewModel
import com.pzj.wanandroid_kotlin.model.Articles
import com.pzj.wanandroid_kotlin.model.Banner
import com.pzj.wanandroid_kotlin.network.response.ResponseResult
import com.pzj.wanandroid_kotlin.repository.HomeRepository
import kotlinx.coroutines.launch

/**
 * @description: HomeViewModel
 * @author: pengzhenjin
 * @date: 2020/10/29
 */
class HomeViewModel : BaseViewModel<HomeRepository>() {

    private val bannerLiveData = MutableLiveData<List<Banner>>()
    private val articleLiveData = MutableLiveData<Articles>()

    fun getBannerLiveData(): MutableLiveData<List<Banner>> {
        return bannerLiveData
    }

    fun getArticleLiveData(): MutableLiveData<Articles> {
        return articleLiveData
    }

    fun getBannerList() {
        viewModelScope.launch {
            val bannerList = repository.getBannerList()
            if (bannerList is ResponseResult.Success) {
                bannerLiveData.postValue(bannerList.data)
            } else if (bannerList is ResponseResult.Error) {
                val exception = bannerList.exception
                Log.e("HomeViewModel", exception.msg)
            }
        }
    }

    fun getArticleData(pageNum: Int) {
        viewModelScope.launch {
            val articleData = repository.getArticleData(pageNum)
            if (articleData is ResponseResult.Success) {
                articleLiveData.postValue(articleData.data)
            } else if (articleData is ResponseResult.Error) {
                val exception = articleData.exception
                Log.e("HomeViewModel", exception.msg)
            }
        }
    }

}