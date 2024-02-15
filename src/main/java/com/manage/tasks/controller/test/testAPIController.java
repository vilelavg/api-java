package com.manage.tasks.controller.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testAPIController {
    @GetMapping("/test")
    private String test(){
        return "Success";
    }
}
