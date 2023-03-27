package com.rewqty.lab9.service;

import com.rewqty.lab9.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    private final ArrayList<Product> _products = new ArrayList<>();

    public void add(String productName) {
        if (_products.isEmpty()) {
            _products.add(new Product(1, productName));
        } else {
            _products.add(new Product(_products.get(_products.size() - 1).getId() + 1, productName));
        }
    }

    public void remove(int id) {
        _products.remove(_products.stream()
                .filter(x -> x.getId() == id)
                .findAny()
                .get());
    }

    public Product get(int id) {

        return _products.get(
                _products.indexOf(
                        _products.stream()
                                .filter(x -> x.getId() == id)
                                .findAny()
                                .get()));
    }
    public ArrayList<Product> getAll() {
        return _products;
    }

}
