package br.edu.fatecpg.filmes.dao

import br.edu.fatecpg.filmes.model.Diretor
import br.edu.fatecpg.filmes.model.Filme

class FilmeDaoImpl:FilmeDao {
    companion object {
        private val filme = mutableListOf<Filme>()
        private val diretor = mutableListOf<Diretor>()
    }
    override fun adicionarFilme(filme: Filme) {
        Companion.filme.add(filme)
    }

    override fun adicionarDiretor(diretor: Diretor) {
        Companion.diretor.add(diretor)
    }

    override fun obterFilme(): List<Filme> {
        return Companion.filme
    }

    override fun obterDiretor(): List<Diretor> {
        return Companion.diretor
    }
}