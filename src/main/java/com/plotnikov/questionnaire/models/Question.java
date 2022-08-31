package com.plotnikov.questionnaire.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qid;

    private String title;

    @ManyToOne
    @JoinColumn(name = "questionnaireid", insertable = false, updatable = false)
    private Questionnaire questionnaire;

    private int questionnaireid;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
}
