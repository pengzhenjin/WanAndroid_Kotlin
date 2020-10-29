package com.pzj.wanandroid_kotlin.network.api

import com.pzj.wanandroid_kotlin.model.*
import com.pzj.wanandroid_kotlin.network.response.ResponseData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * @description: ApiService
 * @author: pengzhenjin
 * @date: 2020/10/29
 */
interface ApiService {
    /**
     * 获取首页banner
     */
    @GET("/banner/json")
    suspend fun getBannerList(): ResponseData<List<Banner>>

    /**
     * 获取首页文章数据，支持分页
     */
    @GET("/article/list/{pageNum}/json")
    suspend fun getArticleData(@Path("pageNum") pageNum: Int): ResponseData<Articles>

    /**
     * 获取体系数据
     */
    @GET("/tree/json")
    suspend fun getTreeList(): ResponseData<List<Trees>>

    /**
     * 获取项目分类
     */
    @GET("/project/tree/json")
    suspend fun getProjectTabList(): ResponseData<List<ProjectTab>>

    /**
     * 获取项目列表数据，支持分页
     */
    @GET("/project/list/{count}/json")
    suspend fun getProjectData(
        @Path("count") count: Int,
        @Query("cid") cid: Int
    ): ResponseData<Projects>


    /**
     * 获取导航数据
     */
    @GET("/navi/json")
    suspend fun getNavigationList(): ResponseData<List<Navigations>>
}

