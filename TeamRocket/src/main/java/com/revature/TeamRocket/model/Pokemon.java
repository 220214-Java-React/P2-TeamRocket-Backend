package com.revature.TeamRocket.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String imagefront;


//    @ManyToOne
//    @JoinColumn(name ="userName", nullable = false)
//    private User user;
}
