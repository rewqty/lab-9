package com.rewqty.lab9.controller;

import com.rewqty.lab9.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsUpdateController {
    @Autowired
    ProductService productService;

    @RequestMapping(path = "/list/{id}/update", method = RequestMethod.POST)
    private String update(@PathVariable("id") int id,
                          @ModelAttribute("name") String text){
        productService.get(id).setName(text);
        return "redirect:/list";
    }
}
