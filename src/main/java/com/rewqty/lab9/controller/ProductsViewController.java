package com.rewqty.lab9.controller;

import com.rewqty.lab9.model.Product;
import com.rewqty.lab9.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductsViewController {
    @Autowired
    ProductService productService;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products", productService.getAll());
        return "list";
    }

    @RequestMapping(path = "/list/{id}", method = RequestMethod.GET)
    public String product(@PathVariable("id") int id, Model model) {
        Product product = productService.get(id);
        model.addAttribute("product", product);
        return "product";
    }
}
