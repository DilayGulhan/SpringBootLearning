package com.Dilay.KodluyoruzSpringBoot.controller;

import com.Dilay.KodluyoruzSpringBoot.bean.BeanConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

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
    //////////////////////////////////////////

}



