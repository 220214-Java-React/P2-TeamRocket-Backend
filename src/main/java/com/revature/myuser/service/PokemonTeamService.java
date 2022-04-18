package com.revature.myuser.service;


import com.revature.myuser.model.PokemonTeam;
import com.revature.myuser.repository.PokemonTeamRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PokemonTeamService {

    private static PokemonTeamRepository pokemonTeamRepository;

    public PokemonTeamService(PokemonTeamRepository pokemonTeamRepository){
        PokemonTeamService.pokemonTeamRepository = pokemonTeamRepository;

    }

    public static PokemonTeam createPokemonTeam(PokemonTeam pokemonTeam){
        return pokemonTeamRepository.save(pokemonTeam);
    }

    public Optional<PokemonTeam> findPokemonTeam(Integer id) {
        return pokemonTeamRepository.findById(id);
    }
}
