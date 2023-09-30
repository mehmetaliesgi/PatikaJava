import java.util.Scanner;

public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        int enBuyuk,enKucuk, sayıAdedi, sayi;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        sayıAdedi = scanner.nextInt();
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        sayi = scanner.nextInt();

        enKucuk = sayi;
        enBuyuk = sayi;

        for (int i = 2; i <= sayıAdedi; i++) {
            System.out.print("Lütfen " + i + ". sayıyı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
        }
        System.out.println("Girdiğiniz sayılardan en büyük olanı = " + enBuyuk);
        System.out.println("Girdiğiniz sayılardan en küçük olanu = " + enKucuk);
    }
}
