package com.revature.TeamRocket.controller;

import com.revature.TeamRocket.model.Pokemon;
import com.revature.TeamRocket.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PokemonController {


    private PokemonService pokemonService;
    public PokemonController(PokemonService pokemonService){this.pokemonService=pokemonService;}

    @GetMapping("/pokemon")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Pokemon> findAllPokemon() {
        return pokemonService.findAllPokemon();
    }

    @PostMapping("/pokemon")
    @ResponseStatus(HttpStatus.CREATED)
    public Pokemon createPokemon(@RequestBody Pokemon pokemon){
        System.out.println(pokemon);
        return pokemonService.createPokemon(pokemon);
    }



    @DeleteMapping("/pokemon")
    @ResponseStatus(HttpStatus.OK)
    public void deletePokemon(@PathVariable int id){
        pokemonService.deletePokemon(id);
    }
}
