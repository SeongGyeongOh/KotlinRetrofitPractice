package com.osg.practice01kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.movieitem_layout.view.*

class MyAdapter (var context: Context, var items: ArrayList<DailyBoxOfficeList>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater=LayoutInflater.from(context)
        val itemView = layoutInflater.inflate(R.layout.movieitem_layout, parent, false)

        val vh=VH(itemView)
        return vh
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val vh = holder as VH
        val item=items[position]
        vh.itemView.rank.text=item.rank
        vh.itemView.tv_title.text=item.movieNm
        vh.itemView.tv_date.text=item.openDt
        vh.itemView.tv_sales.text=item.salesAmt

    }

    inner class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}