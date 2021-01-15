package com.api.planets.starwars

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PlanetsStarwarsApplication

fun main(args: Array<String>) {
	runApplication<PlanetsStarwarsApplication>(*args)
}
