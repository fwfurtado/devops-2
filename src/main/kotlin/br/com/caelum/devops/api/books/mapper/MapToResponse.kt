package br.com.caelum.devops.api.books.mapper

import br.com.caelum.devops.api.books.BookResponse
import br.com.caelum.devops.domain.Book

fun mapToResponse(book: Book): BookResponse {
    return BookResponse(title=book.title, releaseDate = book.releaseDate, author=book.author)
}