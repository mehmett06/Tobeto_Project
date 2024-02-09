package org.example.entites;

public class Military extends Customer{

    public Military(int id, String name) {
        super(id, name);
    }

    private double discountRate = 0.70;
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
