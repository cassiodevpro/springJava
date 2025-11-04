package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExController {

    @GetMapping("/api")
    public String home(){

        return "Ola, aplicação spring";
    }
    @GetMapping("/api/teste/{numUm}/{numDois}")
    public String teste(@PathVariable int numUm, @PathVariable int numDois){
        int soma = numUm + numDois;

        String resultado;
        if(soma % 2 == 0){
            resultado = "A SOMA É PAR";
        } else {
            resultado = "A SOMA É ÍMPAR";
        };
        return resultado;
    }
    

}
