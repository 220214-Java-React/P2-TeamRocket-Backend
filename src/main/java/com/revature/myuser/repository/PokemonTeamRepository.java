package com.revature.myuser.repository;

import com.revature.myuser.model.PokemonTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PokemonTeamRepository extends JpaRepository <PokemonTeam, Integer> {
//    @Query("select p from PokemonTeam p where p.userid = ?")
//    Optional<PokemonTeam> findAllPokemonTeamsById( int userid);



}
