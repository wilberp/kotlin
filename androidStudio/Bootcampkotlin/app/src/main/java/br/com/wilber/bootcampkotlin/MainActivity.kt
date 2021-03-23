package br.com.wilber.bootcampkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.wilber.bootcampkotlin.R.layout.drawer_menu

class MainActivity : AppCompatActivity() {

    private val rvList:RecyclerView by lazy{
        findViewById<RecyclerView>(R.id.rv_list)
    }

    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(drawer_menu)
        bindViews()
        updateList()
    }

    private fun initDrawer(){
        val drawerLayout = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toolbars = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbars)

        var toggle = ActionBarDrawerToggle(this, drawerLayout, toolbars, R.string.open_drawer, R.string.close_drawer)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
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

    private fun showToast(message: String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_menu_1 ->{
                showToast("Exibindo item menu 1")
            true
        }
            R.id.item_menu_2 ->{
                showToast("Exibindo item menu 2")
                true
        }
            else -> super.onOptionsItemSelected(item)
        }
    }
}


