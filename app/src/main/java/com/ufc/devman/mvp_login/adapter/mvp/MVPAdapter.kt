package com.ufc.devman.mvp_login.adapter.mvp

interface MVPAdapter{
    interface View{
        fun getList():List<String>
        fun novaListas(list:MutableList<String>)
        fun add(item:String)
        fun remover(posicao:Int)
    }
    interface Presenter{
        fun contApp(view:MVPAdapter.View)
        fun setList(list:MutableList<String>)
        fun add(item:String)
        fun remover(posicao:Int)

    }
}