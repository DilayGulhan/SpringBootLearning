package com.Dilay.KodluyoruzSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeLeafController {
    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
//    @ResponseBody // kodlarımızı yazarken sayfa oluşturuyor
    public String getThyMeLeaf() {
        return "thymeleaf1"; //buradaki html sayfasını algılıyor
    }

    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeLeaf2Model(Model model) {
        model.addAttribute("key_model", "I'm coming from model");
        model.addAttribute("key_model2", "I'm coming from model2");
        return "thymeleaf1";
    }
    //http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeLeaf3Model(Model model) {
        model.addAttribute("key_model", "I'm coming from model");
        model.addAttribute("key_model2", "I'm coming from model2");
        return "thymeleaf_file/thymeleaf3";
    }
}