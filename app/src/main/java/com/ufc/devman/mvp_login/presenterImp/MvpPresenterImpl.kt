package com.ufc.devman.mvp_login.presenterImp

import com.ufc.devman.mvp_login.presenter.MvpAdapterView

class MvpPresenterImpl:MvpAdapterView.Presenter {
    lateinit var view:MvpAdapterView.View

    override fun carregarDados() {
        this.view.montarView(mutableListOf("ANDREAZO","ANDERSON","BIRICUTICO"))
    }

    override fun content(view: MvpAdapterView.View){
        this.view = view
    }

}