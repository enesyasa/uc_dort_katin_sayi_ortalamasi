import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girişi al
        System.out.print("Bir sayı giriniz: ");
        int limit = scanner.nextInt();

        // Toplamı ve sayacı tutacak değişkenler
        int toplam = 0;
        int sayac = 0;

        // 0'dan girilen sayıya kadar olan sayıları kontrol et
        for (int i = 0; i <= limit; i++) {
            // 3 ve 4'e tam bölünen sayıları bul
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i; // Toplamı güncelle
                sayac++; // Sayacı arttır
            }
        }

        // Eğer sayac 0 değilse (tam bölünen sayı bulunduysa) ortalamayı hesapla ve ekrana yazdır
        if (sayac != 0) {
            double ortalama = (double) toplam / sayac;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }

    }
}
