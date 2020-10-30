package com.pzj.wanandroid_kotlin.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.pzj.wanandroid_kotlin.R
import com.pzj.wanandroid_kotlin.model.ArticleData
import kotlinx.android.synthetic.main.item_home_list.view.*

/**
 * @description: HomeListAdapter
 * @author: pengzhenjin
 * @date: 2020/10/30
 */
class HomeListAdapter : RecyclerView.Adapter<MyViewHolder>() {

    private var articleList: List<ArticleData> = ArrayList<ArticleData>()

    fun setData(dataList: List<ArticleData>) {
        this.articleList = dataList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_home_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(articleList[position])
    }

    override fun getItemCount(): Int = articleList.size ?: 0
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(article: ArticleData) {
        itemView.tv_title.text = article.title
        itemView.tv_share_user.text = "分享人：" + article.shareUser
        itemView.tv_time.text = article.niceDate

        itemView.setOnClickListener {
            Log.e("peng", it.tv_title.text.toString())
        }
    }
}
