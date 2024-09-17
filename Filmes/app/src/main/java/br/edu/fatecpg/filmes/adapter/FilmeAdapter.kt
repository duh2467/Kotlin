package br.edu.fatecpg.filmes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.filmes.R
import br.edu.fatecpg.filmes.model.Filme

class FilmeAdapter (private val filme: List<Filme>):
    RecyclerView.Adapter<FilmeAdapter.ViewHolder>(){
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val txvFilme: TextView = itemView.findViewById(R.id.txv_filme)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_filme,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val filme = filme[position]
        holder.txvFilme.text = filme.filme
    }

    override fun getItemCount(): Int {
        return filme.size
    }
}