package com.Dilay.KodluyoruzSpringBoot.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDTO {
    private Long id ;
    private String beanName ;
    private String beanData ;

//    start
    public void initialBeanMethod (){
        log.info("I'm there before bean starting");
        System.out.println("The method that run before bean starting ");
    }
//    finish
    public void destroyBeanMethod(){
        log.info("I'm there after bean finished");
        System.err.println("The method that run after bean finished ");
    }
}
