package com.manage.tasks.controller.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testAPIController {
    @GetMapping("/test")
    private String test(){
        return "Success";
    }
    @GetMapping("/home")
    private String home(@RequestParam(name="nome")String nome){
        return"Olá, "+nome+". Seja bem-vindo";
    }
}
