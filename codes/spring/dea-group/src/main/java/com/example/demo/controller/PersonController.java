package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping("/persons")
    public String getPersons(Model model) {
//        List<Person> persons = Arrays.asList(
//                new Person(),
//                new Person(),
//                new Person()
//        );

//        model.addAttribute("persons", persons);
        return "persons";
    }
}
