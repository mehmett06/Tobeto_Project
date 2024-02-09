package org.example;

import org.example.entites.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Clean Code OOP_Intro
    //Senaryo
    //Kullanıcı bir ürünü satın almak istiyor.
    // Ürünün fiyatı öğrencilere %10 indirimli oalrak yansıyacaktır.
    //Default olarak TL ödeme yapacaktır.
    //fiyat istenirse Dolar ve Euro ödeyebilecektir.
    //Döviz karşılığı merkez bankası servisinden alınacaktır.

        //ürünler kısmı oluşturuldu
        Product product1 =new Product(1,"Ayakkabı",120);
     Product product2=new Product(2,"Pantolon",100);
     //bir normal müşteri, bir öğrenci
        Customer customer1=new Customer(3,"Mehmet Duman");
       Military customer2=new Military(4,"hasan kuş");

        IBankService iBankService = new CentralBankService();
        ProductManager productManager = new ProductManager(iBankService);
        System.out.println("************");

        productManager.Sell(product1,customer1);
        productManager.Sell(product2,customer2);
        productManager.sell(product1,customer2);
    }
}

//inheritance :extends altsınıf ve üst sınıf ve impelements: ise interface ve abstract dır
//eğer class bu iki özelliği almıyorsa sürdürelebilir değildir.
