package org.columbia.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.columbia.dto.PokedexDto;
import org.columbia.dto.PokemonDto;
import org.columbia.dto.TextDto;
import org.columbia.entity.TextEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;
import java.util.UUID;

@Service
public class PokedexService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DemoJpaRepository repository;

    public PokemonDto[] marshallPokedex() throws Exception {

        Resource resource = new ClassPathResource("pokemon.json");
        InputStream resourceInputStream = resource.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        PokemonDto[] pokemon = mapper.readValue(resourceInputStream, PokemonDto[].class);
        return pokemon;
    }

}
