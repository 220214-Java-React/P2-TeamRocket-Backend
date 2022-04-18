package com.revature.myuser.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PokemonTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int position1;
    private int position2;
    private int position3;
    private int position4;
    private int position5;
    private int position6;
    private int userid;


}
