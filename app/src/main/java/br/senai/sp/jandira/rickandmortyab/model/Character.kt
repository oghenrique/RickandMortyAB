package br.senai.sp.jandira.rickandmortyab.model

data class Character(
    val id: Int = 0,
    val name: String = "",
    val status: String = "",
    val species: String = "",
    val gender: String = "",
    val origin: Origin? = null,
    val location: Location? = null,
    val image: String = "",
    val episode: List<String>? = null,
    val url: String = "",
    val created: String = ""
)
