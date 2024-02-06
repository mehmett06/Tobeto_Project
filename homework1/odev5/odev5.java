package homework1.odev5;

import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir sayı giriniz :");
        int n = input.nextInt();

        int total =0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
               // System.out.println(i);
            total+=i;

            }

        }

        if(total==n){
            System.out.println(n + "  sayısı mükemmel bir sayıdır.");
        }
        else {
            System.out.println( n+ "  sayısı mükemmel bir sayı değildir.");
        }
    }
}
