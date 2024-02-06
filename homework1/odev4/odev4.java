package homework1.odev4;

import java.util.Random;
import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
int tahmin ,can =5;
        Random rand= new Random();
        Scanner scan= new Scanner(System.in);
        int sayi= rand.nextInt(10)+1;
        boolean oyunDurumu=false;
        System.out.println(sayi);
        System.out.println(" Sayı tahmin oyununa hoşgeldiniz.");
        System.out.println("lütfen 1-10 arasında bir sayı tutun");

        while(can>0)
        {
            System.out.println("Tahmininiz : ");
            tahmin= scan.nextInt();
            if((tahmin<1) || (tahmin>10)){
                System.out.println(" lütfen geçerli bir sayı giriniz");
            continue;
            //contiune başa döndürme
            }

            if (tahmin==sayi){
                oyunDurumu=true;
                break;
            }else{
                System.out.println("yanlış,tekrar deneyiniz ! kalan can : "+ --can);
            }
        }
        if(oyunDurumu){
            System.out.println("Tebrikler doğru tahmin");
            System.out.println("sayımız " + sayi);
            System.out.println("kalan can "+ can);

        }else{
            System.out.println("başaramadınız");

        }
    }
}
