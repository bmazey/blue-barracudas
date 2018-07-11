package org.columbia.service;

import org.columbia.dto.PokemonDto;
import org.columbia.dto.TextDto;
import org.columbia.entity.TextEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PokedexService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DemoJpaRepository repository;
    public boolean checkIfPokemonExists(TextDto text) {
        return repository.findByName(text).isPresent();
    }
 public void deletePokemonbyName(TextDto text){
        repository.deleteByName(text);
 }

}
