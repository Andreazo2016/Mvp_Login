package com.ufc.devman.mvp_login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ufc.devman.mvp_login.presenter.Login
import com.ufc.devman.mvp_login.presenterImp.LoginImp
import org.androidannotations.annotations.Click
import org.androidannotations.annotations.ViewById

class MainActivity : AppCompatActivity(),Login.ViewLogin {

    lateinit var usuario:EditText
    lateinit var senha:EditText
    lateinit var btnLogar:Button

    lateinit var loginImp:Login.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.usuario = findViewById(R.id.EditLogin)
        this.senha = findViewById(R.id.EditSenha)
        this.btnLogar = findViewById(R.id.btnLogar)
        loginImp = LoginImp(this@MainActivity)
        btnLogar?.setOnClickListener() {logar(usuario?.text.toString(),senha?.text.toString())}

    }

    fun logar(usuario:String,senha:String){
        loginImp.validarUsuario(usuario,senha)
    }

    override fun erroCampoBranco(msg:String) {
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setTitle("Msg")
        builder.setMessage(msg)
        val dialod = builder.create()
        dialod.show()
    }

    override fun erroLoginSenhaErrado(msg:String) {
        Log.e("erro","Erro ${msg}")
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setTitle("Msg")
        builder.setMessage(msg)
        val dialod = builder.create()
        dialod.show()
    }

    override fun sucessoLogin(msg:String) {
        startActivity(Intent(this@MainActivity,RecicleActivity::class.java))
           }
}
