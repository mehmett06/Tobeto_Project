package homework1.odev1;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {

        System.out.println("1- ayakkabı ");
        System.out.println("2- pantolon");
        System.out.println("3- gömlek");

        System.out.println("lütfen almak istediğiniz ürünün numarasını giriniz: ");
        Scanner scanner =new Scanner(System.in);
        int input =scanner.nextInt();

        Products(input);

    }
    public static void Products(int input) {
        switch (input){
            case 1:
                System.out.println("ayakkabı satın alacaksın");
                break;
            case 2:
                System.out.println("pantolon satın alacaksın");
                break;
            case 3:
                System.out.println("gömlek satın alacaksın");
                break;



        }
    }
    }

