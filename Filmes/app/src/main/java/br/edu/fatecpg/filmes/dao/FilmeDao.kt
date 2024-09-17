package br.edu.fatecpg.filmes.dao

import br.edu.fatecpg.filmes.model.Diretor
import br.edu.fatecpg.filmes.model.Filme

interface FilmeDao {
    fun adicionarFilme(filme: Filme)
    fun adicionarDiretor(diretor: Diretor)
    fun obterFilme():List<Filme>
    fun obterDiretor():List<Diretor>
}