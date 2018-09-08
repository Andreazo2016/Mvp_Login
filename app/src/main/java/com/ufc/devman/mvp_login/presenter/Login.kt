package com.ufc.devman.mvp_login.presenter

interface Login {
    interface ViewLogin{
        fun erroCampoBranco(msg:String)
        fun erroLoginSenhaErrado(msg:String)
        fun sucessoLogin(msg:String)
    }
    interface Presenter{
        fun validarUsuario(usuario:String,senha:String):Unit
    }
}