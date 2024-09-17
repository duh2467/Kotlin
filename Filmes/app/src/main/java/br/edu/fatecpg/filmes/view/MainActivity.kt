package br.edu.fatecpg.filmes.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.filmes.R
import br.edu.fatecpg.filmes.dao.FilmeDaoImpl
import br.edu.fatecpg.filmes.model.Diretor
import br.edu.fatecpg.filmes.model.Filme
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    val dao = FilmeDaoImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtFilme = findViewById<EditText>(R.id.edt_filme)
        val edtDiretor = findViewById<EditText>(R.id.edt_diretor)
        val btnSalvar = findViewById<Button>(R.id.btn_salvar)
        val fabLista = findViewById<FloatingActionButton>(R.id.fab_lista)
        btnSalvar.setOnClickListener {
            val nm_filme = edtFilme.text.toString()
            val filme = Filme(nm_filme)
            dao.adicionarFilme(filme)
            Toast.makeText(this, "Filme Cadastrado", Toast.LENGTH_SHORT).show()
            edtFilme.text.clear()

            val nm_diretor = edtDiretor.text.toString()
            val diretor = Diretor(nm_diretor)
            dao.adicionarDiretor(diretor)
            edtDiretor.text.clear()

        }
        fabLista.setOnClickListener {
            val intent = Intent(this,ListaActivity::class.java)
            startActivity(intent)
        }
    }
}