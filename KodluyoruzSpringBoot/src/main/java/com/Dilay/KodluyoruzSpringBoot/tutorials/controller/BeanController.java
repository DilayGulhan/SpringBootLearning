package com.Dilay.KodluyoruzSpringBoot.tutorials.controller;

import com.Dilay.KodluyoruzSpringBoot.tutorials.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired
     BeanConfig beanConfig ;
    //Autowired == Inject



    //http://localhost:8080/bean/beanDTO

    @ResponseBody// show in screen without html
    @GetMapping("/bean/beanDTO") //URL
    public String getBeanDTO(){
        return beanConfig.beanDTO()+ ".";
    }


}



