package com.revature.TeamRocket.repository;

import com.revature.TeamRocket.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

//    @Override
//    List<Pokemon> findAll();
}
