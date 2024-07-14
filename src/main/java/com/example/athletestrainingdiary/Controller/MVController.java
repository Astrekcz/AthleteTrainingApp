package com.example.athletestrainingdiary.Controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MVController {

    @GetMapping
    public String LandingPage(Model model){
        return "index";
    }

}
