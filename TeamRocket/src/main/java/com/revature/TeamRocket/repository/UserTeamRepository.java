package com.revature.TeamRocket.repository;


import com.revature.TeamRocket.model.UserTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTeamRepository extends JpaRepository<UserTeam, Integer> {
}
