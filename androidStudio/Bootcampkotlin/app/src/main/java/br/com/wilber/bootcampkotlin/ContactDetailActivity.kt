package br.com.wilber.bootcampkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class ContactDetailActivity : AppCompatActivity() {
    private var contact: Contact? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_detail)

        initToolbar()
        getExtras()
        bindviews()
    }

    private fun initToolbar(){
        val toolbars = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbars)

        //inserir botao voltar na toolbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    //metodo para recuperar
    private fun getExtras(){
        contact = intent.getParcelableExtra(EXTRA_CONTACT)
    }

    //setar dados na tela
    private fun bindviews(){
        findViewById<TextView>(R.id.tv_name).text = contact?.name
        findViewById<TextView>(R.id.tv_phone).text = contact?.phone
    }


    companion object{
        const val EXTRA_CONTACT:String = "EXTRA_CONTACT"
    }

    //funcionalidade para o botão voltar ter efeito
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}