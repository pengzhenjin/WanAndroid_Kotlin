package com.pzj.wanandroid_kotlin.ui

import android.widget.LinearLayout
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.pzj.wanandroid_kotlin.R
import com.pzj.wanandroid_kotlin.adapter.HomeListAdapter
import com.pzj.wanandroid_kotlin.base.BaseFragment
import com.pzj.wanandroid_kotlin.base.BaseVMFragment
import com.pzj.wanandroid_kotlin.vm.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * @description: HomeFragment
 * @author: pengzhenjin
 * @date: 2020/10/30
 */
class HomeFragment : BaseVMFragment() {

    private var pageNum: Int = 0
    private lateinit var adapter: HomeListAdapter

    private val mode: HomeViewModel by viewModels()

    override fun getLayoutId(): Int = R.layout.fragment_home

    override fun initView() {
        super.initView()
        recyclerView.layoutManager = LinearLayoutManager(requireContext());
        val decoration = DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(decoration)

        adapter = HomeListAdapter()
        recyclerView.adapter = adapter
    }

    override fun initData() {
        mode.apply { getArticleData(pageNum) }
    }

    override fun startDataObserver() {
        mode.getArticleLiveData().observe(this, {
            val dataList = it.datas
            adapter.setData(dataList)
        })
    }
}