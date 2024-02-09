package org.example.entites;

import org.example.entites.Company;
import org.example.entites.Customer;
import org.example.entites.person;
import  org.example.entites.CustomerManager;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=100;
        System.out.println("sayı2'nin en son değeri :"+ sayi2);
        System.out.println("sayi1'nin en son değeri : "+ sayi1);

        int[] sayilar1 = new int[]{1,2,3};

        int[] sayilar2 = new int[]{10, 20, 30};

        sayilar1=sayilar2;

        sayilar2[0]=1000;
        System.out.println(sayilar1[0]);
        //OOP_Intro

        CreditManager creditManager =new CreditManager();
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.hesapla();
     //SOLİD
        Customer customer =new Customer();
        customer.ıd=1;


      CustomerManager customerManager =new CustomerManager(customer);
      customerManager.Save();
      customerManager.Delete();

      Company company=new Company("1000","Arçelik");
      company.ıd=100;
      company.City="Ankara";


        company.setCity("Ankara");
        System.out.println(company.getCity());

      CustomerManager customerManager2=new CustomerManager(new person());

      person Person1=new person();
      Person1.NationalIdentity="";

      Customer c1 =new Customer();
      Customer C2 =new person();


    }

    static class CreditManager
    { public static  void Calculate (){
            System.out.println("Hesaplandı");}
    public static void hesapla(){
        System.out.println("Kredi verildi.");}
    }



}
