package com.revature.myuser.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Map;

@Entity(name = "players")

// Lombok -> used to alleviate boilerplate code in your entities
// a sidenote: @Data annotation can be non-performant for certain entities
@Data
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String usr;
    private String pwd;
    private String images;

    public MyUser(){}

//    @OneToMany(mappedBy = "author")
//    @JsonIgnore // jackson mapper will ignore the JSON
//    private List<Flashcard> flashcards;
}
