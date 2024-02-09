package org.example.entites;

public class CustomerManager {
    private Customer _customer;
    public  CustomerManager(Customer customer1){
        _customer=customer1;

    }

    public void Save() {
        System.out.println("Müşteri Kaydedildi : ");}

    public void Delete() {
        System.out.println("Müşteri Silindi : ");
    }
}
