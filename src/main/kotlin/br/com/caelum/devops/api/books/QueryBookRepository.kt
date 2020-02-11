package br.com.caelum.devops.api.books

import br.com.caelum.devops.domain.Book

interface QueryBookRepository {
    fun findAll(): List<Book>
}
