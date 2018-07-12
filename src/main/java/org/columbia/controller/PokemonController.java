package org.columbia.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.columbia.dto.PokedexDto;
import org.columbia.dto.PokemonDto;
import org.columbia.dto.TextDto;
import org.columbia.entity.TextEntity;
import org.columbia.service.DemoService;
import org.columbia.service.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.awt.Desktop;
import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;
import java.net.URI;

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



