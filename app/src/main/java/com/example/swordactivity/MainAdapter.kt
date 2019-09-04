package com.example.swordactivity

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MainAdapter(context: Context, list: List<Problem>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    var mContext: Context = context
    var problems = list

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MainAdapter.ViewHolder {
        val v = LayoutInflater.from(mContext).inflate(R.layout.item, p0, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int = problems.size

    override fun onBindViewHolder(p0: MainAdapter.ViewHolder, p1: Int) {
        p0.button.text = problems[p1].title
        p0.button.setOnClickListener {
            tototo(it.context, p1)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button = itemView.findViewById<Button>(R.id.btn_item)!!
    }

    private fun tototo(context: Context, p1: Int) {
        when (problems[p1].type) {
            0 -> context.startActivity(Intent(context, DetailActivity::class.java))
        }
    }
}