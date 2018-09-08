package com.ufc.devman.mvp_login.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ufc.devman.mvp_login.R
import com.ufc.devman.mvp_login.adapter.mvp.MVPAdapter
import kotlinx.android.synthetic.main.simples_show_data.view.*


class RecicleAdapter(ctx:Context):RecyclerView.Adapter<RecicleAdapter.RecViewHolder>(),MVPAdapter.View{
    var ctx:Context
    lateinit var lista:MutableList<String>
    init {
        this.ctx = ctx
        this.lista = mutableListOf()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecViewHolder {
        val view = LayoutInflater.from(this.ctx).inflate(R.layout.simples_show_data,parent,false)
        return RecicleAdapter.RecViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecViewHolder, position: Int) {
        holder.showDataView.text = getList().get(position)
        val i = 0
    }

    override fun getItemCount(): Int {
        return getList().size
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
    override fun getList():List<String> {
        return this.lista
    }

    override fun novaListas(list: MutableList<String>) {
        list.forEach({s ->
            this.lista.add(s)
        })
        notifyDataSetChanged()
    }

    override fun add(item: String) {
        this.lista.add(item)
        notifyDataSetChanged()
    }

    override fun remover(posicao: Int) {
        this.lista.removeAt(posicao)
        notifyDataSetChanged()
    }


    class RecViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var showDataView = itemView.findViewById<TextView>(R.id.showData)
    }


}
