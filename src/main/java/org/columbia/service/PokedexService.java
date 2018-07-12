package org.columbia.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.columbia.dto.PokemonDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Optional;

@Service
public class PokedexService {
    @Autowired
    private ModelMapper modelMapper;

    public PokemonDto[] marshallPokedex() throws Exception {

        Resource resource = new ClassPathResource("pokemon.json");
        InputStream resourceInputStream = resource.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        PokemonDto[] pokemon = mapper.readValue(resourceInputStream, PokemonDto[].class);
        return pokemon;
    }

    public Optional<PokemonDto> findPokemon(PokemonDto[] pokemon, String s) {
        for (PokemonDto poke : pokemon) {
            if (poke.getEname().equals(s)) {
//                PokemonDto returnPoke = new PokemonDto();
//                returnPoke.setBase(poke.getBase());
//                returnPoke.setCname(poke.getCname());
//                returnPoke.setEname(poke.getEname());
//                returnPoke.setFlatName(poke.getFlatName());
//                returnPoke.setId(poke.getId());
//                returnPoke.setJname(poke.getJname());
//                returnPoke.setModel(poke.getModel());
//                returnPoke.setSkills(poke.getSkills());
//                returnPoke.setType(poke.getType());
                return Optional.of(poke);
            }
        }

        return Optional.empty();
    }

}
