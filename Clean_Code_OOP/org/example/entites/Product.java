package org.example.entites;

import java.math.BigDecimal;

public class Product implements IEntity{

    public int Id;
    public String Name;

    public int  Price;

    public Product(int id, String name, int price) {
        Id = id;
        Name = name;
        Price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
