package br.com.caelum.devops

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DevopsApplication

fun main(args: Array<String>) {
    runApplication<DevopsApplication>(*args)
}
