package com.example.athletestrainingdiary.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVController {

    @GetMapping("index")
    public String LandingPage(){
        return "index";
    }

}
