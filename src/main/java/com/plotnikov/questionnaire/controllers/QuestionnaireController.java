package com.plotnikov.questionnaire.controllers;

import com.plotnikov.questionnaire.models.Questionnaire;
import com.plotnikov.questionnaire.services.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class QuestionnaireController {

    @Autowired
    private QuestionnaireService questionnaireService;

    @GetMapping("/questionnaires")
    public String getQuestionnaires(Model model) {
        List<Questionnaire> questionnaireList = questionnaireService.getQuestionnaires();
        model.addAttribute("questionnaires", questionnaireList);
        return "questionnaires";
    }

    @GetMapping("/questionnaires/add-new")
    public String getAddQuestionnaire(Model model) {
        return "add-questionnaire";
    }

    @PostMapping("/questionnaires/add-new")
    public String addNewQuestionnaire(Questionnaire questionnaire) {
        questionnaireService.save(questionnaire);
        return "redirect:/questionnaires";
    }

    @GetMapping("/questionnaires/{id}")
    public String questionnaireDetails(@PathVariable(value = "id") Integer id, Model model) {
        Optional<Questionnaire> questionnaire = questionnaireService.findById(id);
        ArrayList<Questionnaire> res = new ArrayList<>();
        questionnaire.ifPresent(res::add);
        model.addAttribute("questionnaire", res);
        return "questionnaire-details";
    }
}
