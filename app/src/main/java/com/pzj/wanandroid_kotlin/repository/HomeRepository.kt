package com.pzj.wanandroid_kotlin.repository

import com.pzj.wanandroid_kotlin.base.BaseRepository
import com.pzj.wanandroid_kotlin.model.Articles
import com.pzj.wanandroid_kotlin.model.Banner
import com.pzj.wanandroid_kotlin.network.response.ResponseResult

/**
 * @description: HomeRepository
 * @author: pengzhenjin
 * @date: 2020/10/29
 */
class HomeRepository : BaseRepository() {

    suspend fun getBannerList(): ResponseResult<List<Banner>> {
        val bannerList = getApiService().getBannerList()
        return callRequest(call = { handleResponse(bannerList) })
    }

    suspend fun getArticleData(pageNum: Int): ResponseResult<Articles> {
        val articleData = getApiService().getArticleData(pageNum)
        return callRequest(call = { handleResponse(articleData) })
    }
}