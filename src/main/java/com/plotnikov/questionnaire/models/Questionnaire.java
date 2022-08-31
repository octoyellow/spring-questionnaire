package com.plotnikov.questionnaire.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "questionnaire")
public class Questionnaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "userid", insertable = false, updatable = false)
    private User user;

    private Integer userid;

    @OneToMany(mappedBy = "questionnaire")
    private List<Question> questions;


}
