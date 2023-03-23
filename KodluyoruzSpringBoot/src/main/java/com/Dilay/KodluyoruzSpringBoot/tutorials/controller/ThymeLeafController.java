package com.Dilay.KodluyoruzSpringBoot.tutorials.controller;

import com.Dilay.KodluyoruzSpringBoot.tutorials.bean.ProductDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

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
    //http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeLeaf4Model(Model model) {
        model.addAttribute("key_model1", "I'm coming from model");

        return "thymeleaf4";
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
// Send as object
    //http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String getThymeLeaf5Model(Model model) {
        model.addAttribute("key_model1", "text");
        ProductDTO productDTO = ProductDTO.builder().productId(0L).productName("Name product").productPrice(25000).build();
       model.addAttribute("key_model2", productDTO);
        return "thymeleaf5";}

    //http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String getThymeLeaf6Model(Model model) {
        model.addAttribute("key_model1", "text");
        ArrayList<ProductDTO> productList = new ArrayList<>();
        ProductDTO productDTO = ProductDTO.builder().productId(0L).productName("Name product").productPrice(25000).build();
        ProductDTO productDTO1 = ProductDTO.builder().productId(1L).productName("Name product1").productPrice(5000).build();
        ProductDTO productDTO2 = ProductDTO.builder().productId(2L).productName("Name product2").productPrice(2000).build();
        productList.add(productDTO);
        productList.add(productDTO1);
        productList.add(productDTO2);
        model.addAttribute("product_list", productList);
        return "thymeleaf6";

}

///////////////////////////////////////////////////////////////

//opsiyonel yapı
//  http://localhost:8080
// http://localhost:8080/index
     @GetMapping({"/", "index"})
    public String index(){
        return "index" ;
}
//    http://localhost:8080/thymeleaf7
    @GetMapping({ "/thymeleaf7","/thymeleaf7/{id}"} )
    public String getThymeLeaf7Model(Model model , @PathVariable(name = "id") Long id) {
       if(id != null) {
           model.addAttribute("key_model7", "id = " + id);
       }
       else{
           model.addAttribute("key_model7", "id bulunamadı ");
       }
        return "thymeleaf7";}




//Request Parameter
    //    http://localhost:8080/thymeleaf8?id=4&name=Dilay
    @GetMapping( "/thymeleaf8" )
    public String getThymeLeaf8Model(Model model , @RequestParam(name = "id" , required = false , defaultValue = "0") Long id, @RequestParam(name = "name" ) String name) {
        if(id != null) {
            model.addAttribute("key_model", "id = " + id+ " name= "+ name) ;
        } /*else if (id==0) {
            model.addAttribute("key_model", "default değer girildi " );
        }*/ else{
            model.addAttribute("key_model", "id bulunamadı ");
        }
        return "thymeleaf8";}

}