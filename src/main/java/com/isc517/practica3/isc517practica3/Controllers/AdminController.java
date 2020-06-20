package com.isc517.practica3.isc517practica3.Controllers;

import com.isc517.practica3.isc517practica3.Repositories.FormRepository;
import com.isc517.practica3.isc517practica3.Services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @Autowired
    FormRepository formRepository;

    @Autowired
    FormService formService;

    @RequestMapping(path = "/admin")
    public String graphs(Model model){

        model.addAttribute("question_one", formRepository.sumQuestionOne());
        model.addAttribute("question_two", formRepository.sumQuestionTwo());
        model.addAttribute("question_three", formRepository.sumQuestionThree());

        return "/review";
    }
}
