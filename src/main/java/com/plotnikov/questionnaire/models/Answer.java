package com.plotnikov.questionnaire.models;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String value;

    @ManyToOne
    @JoinColumn(name = "questionid", insertable = false, updatable = false)
    private Question question;

    private int questionid;
}
