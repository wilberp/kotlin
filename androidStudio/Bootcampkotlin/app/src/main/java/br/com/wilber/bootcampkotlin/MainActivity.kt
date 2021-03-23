package br.com.wilber.bootcampkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.wilber.bootcampkotlin.R.layout.activity_main

class MainActivity : AppCompatActivity() {

    private val rvList:RecyclerView by lazy{
        findViewById<RecyclerView>(R.id.rv_list)
    }

    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        bindViews()
        updateList()
    }


    private fun bindViews(){
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList(){
        adapter.updateList(
            arrayListOf(
                Contact(
                "Wilian Peres",
                "(16) 12345-43",
                "img.png"
                    ),
                Contact(
                "Wilian Peres",
                "(16) 12345-43",
                "img.png"
                )
            )
        )
    }
}


