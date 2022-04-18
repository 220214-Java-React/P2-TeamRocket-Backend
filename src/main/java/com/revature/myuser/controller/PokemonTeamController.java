package com.revature.myuser.controller;


import com.revature.myuser.model.PokemonTeam;
import com.revature.myuser.service.PokemonTeamService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/team")
public class PokemonTeamController {

    private final PokemonTeamService pokemonTeamService;

    public PokemonTeamController(PokemonTeamService pokemonTeamService){
        this.pokemonTeamService = pokemonTeamService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PokemonTeam createPokemonTeam(@RequestBody PokemonTeam pokemonTeam){
        return PokemonTeamService.createPokemonTeam(pokemonTeam);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Optional<PokemonTeam> findPokemonTeam(@PathVariable Integer id) {
        return pokemonTeamService.findPokemonTeam(id);
    }



}
