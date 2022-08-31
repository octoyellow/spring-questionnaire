package com.plotnikov.questionnaire.repositories;

import com.plotnikov.questionnaire.models.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Integer> {
}
