package com.Dilay.KodluyoruzSpringBoot.tutorials.controller;

import com.Dilay.KodluyoruzSpringBoot.tutorials.bean.TeacherDto;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Controller
public class FormController {
    //FORM
    //getMethod


    //getGetMethod
    // http://localhost:8080/form
//    PostMapping
    // PutMapping
    // DeleteMapping
    @GetMapping("/form")
    public String getForm(Model model){
        model.addAttribute("cv_teacher" , new TeacherDto());
        return "form_post/validation";
    }

    @PostMapping("/form")
    public String postForm(@Valid @ModelAttribute("cv_teacher") TeacherDto teacherDto , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("Hata var...");
            System.err.println("Hata var....");
            return "form_post/validation";
        }
        log.info("Success!" + teacherDto);

        return "form_post/success";
    }

}
