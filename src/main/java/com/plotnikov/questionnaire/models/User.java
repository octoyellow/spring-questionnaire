package com.plotnikov.questionnaire.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String login;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Questionnaire> questionnaires;
}
