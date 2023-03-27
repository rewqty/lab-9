package com.rewqty.lab9.controller;

import com.rewqty.lab9.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsCreateController {
    @Autowired
    ProductService productService;

    @RequestMapping(path = "/list/new", method = RequestMethod.GET)
    public String create(Model model) {
        return "create";
    }

    @RequestMapping(path = "/list", method = RequestMethod.POST)
    private String doCreate(@ModelAttribute("name") String name) {
        productService.add(name);
        return "redirect:/list";
    }

}
