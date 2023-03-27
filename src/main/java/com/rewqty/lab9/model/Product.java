package com.rewqty.lab9.model;

public class Product {
    int id;
    String name;
    boolean isPurchased;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
        isPurchased = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public void setPurchased() {
        isPurchased = !isPurchased;
    }
}
