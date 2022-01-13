package net.plavcak.tutorial

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("net.plavcak.tutorial")
		.start()
}

