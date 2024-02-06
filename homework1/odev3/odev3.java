package homework1.odev3;
import java.util.Scanner;
public class odev3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int n = scanner.nextInt();
        int toplam = 0;

        do {//İşlemlerimizi yapıyoruz.
            toplam += n;
            n--;
        }
        while(n > 0);//Koşulumuzu giriyoruz.
        System.out.println("Girilen sayıdan 0'a kadar olan sayılar toplamı = " +toplam);
        //örnek2= negatif bir değer giriline kadar kuallnıcıdan  sayıları kabul eden ve girilen değerleden tek sayıların toplamını çıkaran değerler

        Scanner scan =new Scanner(System.in);
        int toplamm =0;
        int input;
        while (true ){
            System.out.println("Lütfen bir sayı giriniz:");
            input = scan .nextInt();
            if(input <0)
            {
                System.out.println("Program bitti negatif sayı girdiniz !!!");
                System.out.println("Girilen tek sayı toplamı " + toplamm);
                break;
            }
            if(input %2 == 1){
            toplamm+=input;

            }
        }
    }
}
