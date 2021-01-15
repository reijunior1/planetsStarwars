package com.api.planets.starwars.controller

import com.api.planets.starwars.model.Planet
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PlanetController {

    @GetMapping("/planet")
    fun getPlanet(): Planet {
        val planet = Planet(1, "Tattoine", "dry", "dry", "Anakin Skywalker")
        return planet
    }
}