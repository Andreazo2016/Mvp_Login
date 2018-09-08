package com.ufc.devman.mvp_login.adapter.mvpImpl

import com.ufc.devman.mvp_login.adapter.mvp.MVPAdapter

class MVPPresenterAdapter: MVPAdapter.Presenter{
    lateinit var view:MVPAdapter.View


    override fun setList(list: MutableList<String>) {
    this.view.novaListas(list)
    }

    override fun add(item: String) {
        this.view.add(item)
    }

    override fun remover(posicao: Int) {
        this.remover(posicao)
    }

    override fun contApp(view: MVPAdapter.View) {
        this.view = view
    }


}