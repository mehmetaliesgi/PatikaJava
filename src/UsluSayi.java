import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int taban, us, sonuc = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen taban sayısını giriniz: ");
        taban = sc.nextInt();
        System.out.print("Lütfen üs sayısını giriniz: ");
        us = sc.nextInt();

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        System.out.println(sonuc);
    }
}
