package com.revature.TeamRocket.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "user-teams")
@Data

public class UserTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String pokemon;
    private String users;
}
