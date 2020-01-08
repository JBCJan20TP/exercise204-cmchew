package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/autoform")
    public String loadAutoForm(Model model){
        model.addAttribute("autoshow", new Autoshow());
        return "autoform";
    }

    @PostMapping("/autoform")
    public String processAutoForm(@Valid Autoshow autoshow,
        BindingResult result){
    if (result.hasErrors()){
        return "autoform";
    }
    return "autoshowconfirm";
    }
}
