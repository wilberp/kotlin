package com.everis.bootcamp.threading

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: 018 - fazer o handle do clique do botão
        button_load_data.setOnClickListener {
            launchAstroTask()
        }
    }


    //TODO: 013 - Criar função para exibir os dados carregados
    fun showData(list: List<AstrosPeople>?){
        textview_data.text = ""
        list?.forEach { people ->
            textview_data.append("${people.name} - ${people.craft} \n\n")
        }
    }

    //TODO: 014 - Criar função para exibir a ProgressBar
    fun showLoadingIndicator(){
        progressbar_load_indicator.visibility = View.VISIBLE
    }

    //TODO: 015 - Criar função para esconder a ProgressBar
    fun hideLoadingIndicator(){
        progressbar_load_indicator.visibility = View.GONE
    }

    //TODO: 017 - Criar função para lançar a Task
    fun launchAstroTask(){
        val task = TaskAstros()
        task.execute()
    }


    //TODO: 016 - Criar classe interna para rodar a tarefa assincrona
    inner class TaskAstros() : AsyncTask<Void, Int, List<AstrosPeople>>(){
        private val repository = AstrosRepository()


        override fun onPreExecute() {
            super.onPreExecute()
            showLoadingIndicator()
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
        }

        override fun doInBackground(vararg params: Void?): List<AstrosPeople> {
            //onProgressUpdate()
            return repository.loadData()
        }

        override fun onPostExecute(result: List<AstrosPeople>?) {
            super.onPostExecute(result)
            hideLoadingIndicator()
            showData(result)
        }
    }
}
