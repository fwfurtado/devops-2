package br.com.caelum.devops.api.books

import br.com.caelum.devops.api.books.mapper.mapToResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("books")
class QueryBookController(private val repository: QueryBookRepository) {

    @GetMapping
    fun list(): List<BookResponse> {
        return repository.findAll().map(::mapToResponse)
    }
}

data class BookResponse(var title: String, var author: String, var releaseDate: LocalDate? = null)
