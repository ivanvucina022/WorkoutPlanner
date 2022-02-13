package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_vjezba_detail.view.*
import kotlinx.android.synthetic.main.layout_list_item.view.*
import kotlinx.android.synthetic.main.layout_list_item.view.tv_name


class VjezbaAdapter(private val vjezbe : ArrayList<Vjezba>, private val onVjezbaClickListener: OnVjezbaClickListener) : RecyclerView.Adapter<VjezbaViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VjezbaViewHolder {
        return VjezbaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: VjezbaViewHolder, position: Int) {
        val vjezba = vjezbe[position]

        holder.itemView.tv_name.text = vjezba.name

        holder.itemView.setOnClickListener {
            onVjezbaClickListener.onVjezbaItemClicked(position)
        }
    }

    override fun getItemCount(): Int {
        return vjezbe.size
    }
}