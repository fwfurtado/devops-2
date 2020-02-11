package br.com.caelum.devops.domain

import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.NotNull


@Entity
@Table(name= "books")
class Book (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @field:NotNull
        var title: String,

        @field:NotNull
        var author:String,

        var releaseDate: LocalDate? = null)
