package com.revature.TeamRocket.service;

import com.revature.TeamRocket.model.Pokemon;
import com.revature.TeamRocket.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {


    private PokemonRepository pokemonRepository;
    public PokemonService(PokemonRepository pokemonRepository) {this.pokemonRepository = pokemonRepository;}


    public List<Pokemon> findAllPokemon() {
        return pokemonRepository.findAll();
    }


    public Pokemon createPokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }




    public void deletePokemon(int id) {
        pokemonRepository.deleteById(id);


    }
}
