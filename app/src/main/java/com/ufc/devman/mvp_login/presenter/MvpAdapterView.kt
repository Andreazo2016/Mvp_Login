package com.ufc.devman.mvp_login.presenter

interface MvpAdapterView {
    interface View{
        fun montarView(dados:MutableList<String>)
    }
    interface Presenter{
        fun carregarDados()
        fun content(view: MvpAdapterView.View)
    }
}