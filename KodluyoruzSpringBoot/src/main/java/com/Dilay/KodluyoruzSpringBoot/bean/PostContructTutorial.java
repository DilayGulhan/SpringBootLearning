package com.Dilay.KodluyoruzSpringBoot.bean;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.logging.Logger;

@Controller
public class PostContructTutorial {

    @Autowired
    Logger Log;
    //Parametresiz constructor
    /*   public PostContructTutorial(){
           Log.info("Log info çağrıldı");
       }
   */
//bean henüz başlamadığından null alıyoruz ve burada bağımlılığı enjekte ediyoruz
//Görevi : Bir bean nesnesi oluşturulduğunda hemen oluşur
    /*    @PostConstruct
    public void init(){
        Log.info("Log info çağrıldı");
    }*/
    public static void main(String[] args) {
       PostContructTutorial  beanController= new PostContructTutorial();
        System.out.println(beanController);
    }
}



