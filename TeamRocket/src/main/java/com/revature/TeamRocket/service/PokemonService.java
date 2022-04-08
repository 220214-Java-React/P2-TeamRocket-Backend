package com.revature.TeamRocket.service;

import com.revature.TeamRocket.repository.PokemonRepository;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    private PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository){this.pokemonRepository = pokemonRepository;}

    public Pokemon createNewPokemon(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }
    public List<Pokemon> getAllPokemon(){return pokemonRepository.findAll();}
}
