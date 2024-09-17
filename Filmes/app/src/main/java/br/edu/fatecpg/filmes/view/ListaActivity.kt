package br.edu.fatecpg.filmes.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.filmes.R
import br.edu.fatecpg.filmes.adapter.DiretorAdapter
import br.edu.fatecpg.filmes.adapter.FilmeAdapter
import br.edu.fatecpg.filmes.dao.FilmeDaoImpl
import br.edu.fatecpg.filmes.model.Diretor

class ListaActivity : AppCompatActivity() {
    val dao = FilmeDaoImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        Log.i("Filmes", dao.obterFilme().toString())
        val rvFilmes = findViewById<RecyclerView>(R.id.rv_filmes)
        val rvDiretores = findViewById<RecyclerView>(R.id.rv_diretores)
        val filme = dao.obterFilme()

        rvFilmes.layoutManager = LinearLayoutManager(this)
        rvFilmes.adapter = FilmeAdapter(filme)

    }
}
