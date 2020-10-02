package com.luanroger.plusnote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.luanroger.plusnote.note.NoteAdapter
import com.luanroger.plusnote.note.NoteModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Preparar o recycler
        val testList = listOf<NoteModel>(
            NoteModel("Test title", "test message", Calendar.getInstance().time)
        )
        rcv_notes.adapter = NoteAdapter(testList)
        rcv_notes.layoutManager = LinearLayoutManager(this)
    }
}