package com.revature.TeamRocket.controller;


import com.revature.TeamRocket.model.UserTeam;
import com.revature.TeamRocket.repository.UserTeamRepository;
import com.revature.TeamRocket.service.UserTeamService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/user-teams")
public class UserTeamController {

    private UserTeamService userTeamService;

    public UserTeamController(UserTeamService userTeamService) {
        this.userTeamService = userTeamService;
    }

    @GetMapping
    public List<UserTeam> getAllUserTeams(){
        return userTeamService.getAllUserTeams();
    }

    @PostMapping
    public UserTeam createUserTeam(@RequestBody UserTeam userTeam) {

        System.out.println(userTeam);

        return userTeamService.createNewUserTeam(userTeam);
    }
}
