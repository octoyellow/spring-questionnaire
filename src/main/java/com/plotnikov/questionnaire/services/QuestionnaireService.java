package com.plotnikov.questionnaire.services;

import com.plotnikov.questionnaire.models.Questionnaire;
import com.plotnikov.questionnaire.repositories.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionnaireService {

    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    public List<Questionnaire> getQuestionnaires() {
        return questionnaireRepository.findAll();
    }

    public void save(Questionnaire questionnaire) {
        questionnaireRepository.save(questionnaire);
    }

    public Optional<Questionnaire> findById(Integer id) {
        return questionnaireRepository.findById(id);
    }
}
