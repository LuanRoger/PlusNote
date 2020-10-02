package com.luanroger.plusnote.note

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.luanroger.plusnote.R
import kotlinx.android.synthetic.main.note_item.view.*

class NoteAdapter(private val note: List<NoteModel>) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    class NoteViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val noteTitle = itemview.txt_title_note_item
        val noteMessage = itemview.txt_message_note_item
        val noteTime = itemview.txt_time_note_item
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent,
            false)
        return NoteViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val noteNow = note[position]
        holder.noteTitle.text = noteNow.title
        holder.noteMessage.text = noteNow.note
        holder.noteTime.text = noteNow.time.toString()
    }

    override fun getItemCount(): Int = note.size
}