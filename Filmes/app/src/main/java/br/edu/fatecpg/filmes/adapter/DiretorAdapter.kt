package br.edu.fatecpg.filmes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.filmes.R
import br.edu.fatecpg.filmes.model.Diretor

class DiretorAdapter (private val diretor: List<Diretor>):
    RecyclerView.Adapter<DiretorAdapter.ViewHolder>(){
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_filme,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val diretor = diretor[position]
    }

    override fun getItemCount(): Int {
        return diretor.size
    }
}