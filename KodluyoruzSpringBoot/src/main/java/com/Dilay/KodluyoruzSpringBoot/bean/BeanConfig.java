package com.Dilay.KodluyoruzSpringBoot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    //  @Scope("request")
    //  @Scope("session")
    @Bean(initMethod = "initialBeanMethod" , destroyMethod = "destroyBeanMethod")
    @Scope("singleton") // projeyle başlayıp projeyle ölen yapı

    public BeanDTO beanDTO(){
        return BeanDTO.builder()
                .id(0L).beanName("Name")
                .beanData("ABC").build();
    }

}
