package com.isc517.practica3.isc517practica3.Controllers;

import com.isc517.practica3.isc517practica3.Models.Form;
import com.isc517.practica3.isc517practica3.Repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    FormRepository formRepository;

    public UserController(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/form";
    }


    @GetMapping(path = "/form")
    public String index(Model model) {
        model.addAttribute("title", "Barcamp Form");
        return "/form";
    }

    @GetMapping(path ="/saveform")
    public String guardarform (@RequestParam("questionOne") int questionOne, @RequestParam("questionTwo") int questionTwo, @RequestParam("questionThree") int questionThree, @RequestParam("questionFour") String questionFour) {

        Form form = new Form();
        form.setQuestionOne(questionOne);
        form.setQuestionTwo(questionTwo);
        form.setQuestionThree(questionThree);
        form.setQuestionFour(questionFour);
        formRepository.save(form);
        return "redirect:/form";
    }
}
