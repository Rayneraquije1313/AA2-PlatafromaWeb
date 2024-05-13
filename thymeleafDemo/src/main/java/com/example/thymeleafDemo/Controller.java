package com.example.thymeleafDemo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping
    String getIndex(Model model){
        model.addAttribute("Algo","Esto es una prueba de Thymeleaf");
        model.addAttribute("user", Arrays.asList(
                new Personas("Rainer",19),
                new Personas("Juan",45),
                new Personas("Alvaro", 25),
                new Personas("Patricio",30)
        ));
        return "index";
    }
}
