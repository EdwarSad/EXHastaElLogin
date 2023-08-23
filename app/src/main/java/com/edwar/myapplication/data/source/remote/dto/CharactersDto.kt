/*
package com.edwar.myapplication.data.source.remote.dto

import com.edwar.myapplication.domain.model.Characters

data class CharactersDto(
    val info: Info,
    val results: List<Result>
)

fun CharactersDto.toListCharacters(): List<Characters> {
    val resultEntries = results.mapIndexed { _, entries ->
        Characters(
            id = entries.id,
            name = entries.name,
            specie = entries.species,
            image = entries.image
        )
    }
    return resultEntries
}*/
