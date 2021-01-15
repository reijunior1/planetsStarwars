package com.api.planets.starwars.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Planet(

    @Id
    val id: Long,

    val name: String?,

    val climate: String,

    val ground: String,

    val person: String
)
