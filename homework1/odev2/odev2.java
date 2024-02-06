package homework1.odev2;
import java.util.Scanner;
public class odev2 {
    public static void main(String[] args) {
        // Scanner nesnesi oluştur
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç ürün almak istediğini sor
        System.out.print("Kaç ürün almak istiyorsunuz ? =");
        int urunSayisi = scanner.nextInt();

        // Toplam alışveriş tutarını tutacak değişken
        double toplamTutar = 0;

        // Her bir ürün için döngü
        for (int i = 1; i <= urunSayisi; i++) {
            // Kullanıcıdan ürün fiyatını al
            System.out.print(i + ". ürünün fiyatını giriniz: ");
            double urunFiyati = scanner.nextDouble();

            // Toplam tutara ekle
            toplamTutar += urunFiyati;
        }

        // Alışverişin toplam tutarını ekrana yazdır
        System.out.println("Toplam alışveriş tutarı: " + toplamTutar);

        // Scanner'ı kapat
        scanner.close();
    }
}