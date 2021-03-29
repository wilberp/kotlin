package br.com.wilber.applicationcontentprovider

import android.database.Cursor

interface NoteClickedListener {
    fun noteClickeditem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)

}