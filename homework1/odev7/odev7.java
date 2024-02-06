package homework1.odev7;
import java.util.Scanner;
public class odev7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci sayısını giriniz: ");
        int ogrenciSayisi = scanner.nextInt();

        // Öğrenci bilgilerini tutmak için diziler oluşturuluyor
        String[] adlar = new String[ogrenciSayisi];
        String[] soyadlar = new String[ogrenciSayisi];
        double[] s1Notlar = new double[ogrenciSayisi];
        double[] s2Notlar = new double[ogrenciSayisi];
        double[] s3Notlar = new double[ogrenciSayisi];
        double[] ortalamaNotlar = new double[ogrenciSayisi];

        // Her öğrenci için bilgileri kullanıcıdan alıyoruz
        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println("\n" + (i + 1) + ". Öğrenci Bilgileri:");

            System.out.print("Ad: ");
            adlar[i] = scanner.next();

            System.out.print("Soyad: ");
            soyadlar[i] = scanner.next();

            System.out.print("1. Sınav Notu: ");
            s1Notlar[i] = scanner.nextDouble();

            System.out.print("2. Sınav Notu: ");
            s2Notlar[i] = scanner.nextDouble();

            System.out.print("3. Sınav Notu: ");
            s3Notlar[i] = scanner.nextDouble();

            // Not ortalamasını hesapla
            ortalamaNotlar[i] = (s1Notlar[i] + s2Notlar[i] + s3Notlar[i]) / 3;
        }

        // Her öğrenci için not bilgilerini ekrana yazdır
        System.out.println("\nÖğrenci Bilgileri ve Not Ortalamaları:");
        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println("\n" + (i + 1) + ". Öğrenci: " + adlar[i] + " " + soyadlar[i]);
            System.out.println("1. Sınav: " + s1Notlar[i]);
            System.out.println("2. Sınav: " + s2Notlar[i]);
            System.out.println("3. Sınav: " + s3Notlar[i]);
            System.out.println("Ortalama: " + ortalamaNotlar[i]);
        }
    }
}