package com.mycompany;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

@GetMapping("")
public String homePage(){
    System.out.println("MAIN CONTROLLER");
    return "index";
}
}
