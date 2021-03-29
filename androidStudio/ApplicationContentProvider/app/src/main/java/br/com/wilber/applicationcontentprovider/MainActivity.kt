package br.com.wilber.applicationcontentprovider

import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.BaseColumns._ID
import androidx.loader.app.LoaderManager
import androidx.loader.content.CursorLoader
import androidx.loader.content.Loader
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.wilber.applicationcontentprovider.database.NotesDatabaseHelper.Companion.TITLE_NOTES
import br.com.wilber.applicationcontentprovider.database.NotesProvider.Companion.NOTES_BY_ID
import br.com.wilber.applicationcontentprovider.database.NotesProvider.Companion.URI_NOTES
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), LoaderManager.LoaderCallbacks<Cursor> {
    lateinit var noteRecyclerView: RecyclerView
    lateinit var noteAdd: FloatingActionButton

    lateinit var adapter: NotesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noteAdd = findViewById(R.id.note_add)
        noteAdd.setOnClickListener{
            NotesDetailFragment().show(supportFragmentManager, "dialog")
        }

        adapter = NotesAdapter(object : NoteClickedListener{
            override fun noteClickeditem(cursor: Cursor) {
                val id = cursor.getLong(cursor.getColumnIndex(_ID))
                val fragment = NotesDetailFragment.newInstance(id)
                fragment.show(supportFragmentManager, "dialog")
            }

            override fun noteRemoveItem(cursor: Cursor?) {
                val id = cursor?.getLong(cursor.getColumnIndex(_ID))
                contentResolver.delete(Uri.withAppendedPath(URI_NOTES, id.toString()), null, null)
            }

        })
        adapter.setHasStableIds(true)

        noteRecyclerView = findViewById(R.id.notes_recycler)
        noteRecyclerView.layoutManager = LinearLayoutManager(this)
        noteRecyclerView.adapter = adapter

        LoaderManager.getInstance(this).initLoader(0, null, this)

    }

    //serve para instanciar o eque buscar
    override fun onCreateLoader(id: Int, args: Bundle?): Loader<Cursor> =
        CursorLoader(this, URI_NOTES, null, null, null, TITLE_NOTES)


    //serve para pegasr os dados recebido e manipular
    override fun onLoadFinished(loader: Loader<Cursor>, data: Cursor?) {
        if(data != null){adapter.setCursor(data)}
    }

    //serve para acabar com a pesquisa em 2º plano no loadmanager
    override fun onLoaderReset(loader: Loader<Cursor>) {
        adapter.setCursor(null)
    }
}