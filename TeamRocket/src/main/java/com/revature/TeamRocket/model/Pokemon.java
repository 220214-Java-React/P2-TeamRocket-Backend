package com.revature.TeamRocket.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "pokemon")
@Data
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String Pokemon;

    @ManyToOne@JoinColumn(name ="userName", nullable = false)
    private User user;
}
