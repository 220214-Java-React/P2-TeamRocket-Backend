package com.revature.TeamRocket.service;


import com.revature.TeamRocket.model.UserTeam;
import com.revature.TeamRocket.repository.UserTeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTeamService {

    private UserTeamRepository userTeamRepository;

    public UserTeamService(UserTeamRepository userTeamRepository) {
        this.userTeamRepository = userTeamRepository;
    }

    public UserTeam createNewUserTeam(UserTeam userteam){
        return userTeamRepository.save(userteam);
    }

    public List<UserTeam> getAllUserTeams(){
        return userTeamRepository.findAll();
    }
}
