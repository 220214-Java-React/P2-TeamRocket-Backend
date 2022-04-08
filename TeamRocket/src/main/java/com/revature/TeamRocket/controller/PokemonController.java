package com.revature.TeamRocket.controller;

import com.revature.TeamRocket.model.Pokemon;
import com.revature.TeamRocket.service.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pokemon")
public class PokemonController {

    private PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {this.pokemonService = pokemonService;}

    @GetMapping
    public List<Pokemon> getAllPokemon() {return pokemonService.getAllPokemon();}

    @PostMapping
    public Pokemon createPokemon(@RequestBody Pokemon pokemon){
        return pokemonService.createNewPokemon(pokemon);
    }
}
