package com.ufc.devman.mvp_login.presenterImp

import com.ufc.devman.mvp_login.presenter.Login

class LoginImp(view:Login.ViewLogin):Login.Presenter {
    val view:Login.ViewLogin
    init {
        this.view = view
    }
    override fun validarUsuario(usuario: String, senha: String) {

        if(usuario.isEmpty() && senha.isEmpty())
            this.view.erroCampoBranco("Erro campo ${usuario} ou ${senha} vazia")
        else
            if (usuario.equals("admin") && senha.equals("admin"))

                this.view.sucessoLogin("Sucesso ao logar")
            else
                this.view.erroLoginSenhaErrado("usuario ou senha errados")
    }
}