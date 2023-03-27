package com.rewqty.lab9.controller;

import com.rewqty.lab9.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsDeleteController {
    @Autowired
    ProductService productService;

    @RequestMapping(path = "/list/{id}/delete", method = RequestMethod.POST)
    private String delete(@PathVariable("id") int id) {
        productService.remove(id);
        return "redirect:/list";
    }
}
