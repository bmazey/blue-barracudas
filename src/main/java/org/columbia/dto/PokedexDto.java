package org.columbia.dto;

import springfox.documentation.spring.web.json.Json;

import java.util.List;

public class PokedexDto{
    List<PokemonDto> pokemon;

    public List<PokemonDto> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<PokemonDto> pokemon) {
        this.pokemon = pokemon;
    }


}
