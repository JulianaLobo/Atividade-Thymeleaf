package com.thymeleaf.atividade.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Home {

    @GetMapping("pagina1")
    public String home(){
        return "index";
    }

    @GetMapping("pagina2")
    public String pagina2(){
        return "pag2";
    }

    @GetMapping("fragmentos")
    public String fragmentos(){
        return "fragmentos";
    }
    
}