package org.columbia.controller;

import org.columbia.dto.PokemonDto;
import org.columbia.service.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("api")
public class PokemonController {

    /**
     * Spring controllers! opening development branch ... test!
     */

    @Autowired
    PokedexService pokedexService;


    @RequestMapping(value = "/pokedex/{pokemon}", method = RequestMethod.GET)
    @ResponseBody
   public ResponseEntity<?> getPokedex(@PathVariable String pokemon) throws Exception {

        PokemonDto[] pokemonDto = pokedexService.marshallPokedex();
        Optional<PokemonDto> poke = pokedexService.findPokemon(pokemonDto, pokemon);
        if (poke.isPresent()) {
            return ResponseEntity.ok(poke.get());
        }
        else return ResponseEntity.notFound().build();
    }



}



