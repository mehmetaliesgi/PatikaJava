import java.util.Scanner;

public class Donguler1 {
    public static void main(String[] args) {
        int sayi, toplam = 0, sayac = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        sayi = sc.nextInt();

        for (int i = 1; i < sayi; i++) {
            if(i % 3 == 0 || i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }
        System.out.println("Ortalama = " + (toplam / sayac));
    }
}

