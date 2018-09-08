package com.ufc.devman.mvp_login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ufc.devman.mvp_login.adapter.RecicleAdapter
import com.ufc.devman.mvp_login.adapter.mvp.MVPAdapter
import com.ufc.devman.mvp_login.adapter.mvpImpl.MVPPresenterAdapter
import com.ufc.devman.mvp_login.presenter.MvpAdapterView
import com.ufc.devman.mvp_login.presenterImp.MvpPresenterImpl

class RecicleActivity : AppCompatActivity(),MvpAdapterView.View {

    lateinit var recicleView:RecyclerView
    lateinit var presenter:MvpAdapterView.Presenter
    lateinit var adapterPresenter:MVPAdapter.Presenter
    lateinit var recicleAdaper:RecicleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recicle)
        this.recicleView = findViewById(R.id.recileView)
        this.recicleAdaper = RecicleAdapter(this@RecicleActivity)
        this.presenter = MvpPresenterImpl()
        this.presenter.content(this@RecicleActivity)
        this.adapterPresenter = MVPPresenterAdapter()
        this.adapterPresenter.contApp(recicleAdaper)
        this.recicleView.layoutManager = LinearLayoutManager(this)
        this.recicleView.adapter = recicleAdaper
        this.presenter.carregarDados()

    }

    override fun montarView(dados: MutableList<String>) {
        this.adapterPresenter.setList(dados)
    }

}
