package com.codeTcsKot.codeTcsKot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CodeTcsKotApplication

fun main(args: Array<String>) {
	println("hello")
	runApplication<CodeTcsKotApplication>(*args)
}
