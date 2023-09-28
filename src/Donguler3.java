import java.util.Scanner;

public class Donguler3 {
    public static void main(String[] args) {
        int sayi;

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = sc.nextInt();

        int k4 = 1;
        int k5 = 1;

        while (k4 <= sayi || k5 <= sayi) {
            if (k4 <= sayi) {
                System.out.println("4'ün kuvveti: " + k4);
                k4 *= 4;
            }
            if (k5 <= sayi) {
                System.out.println("5'ün kuvveti: " + k5);
                k5 *= 5;
            }
        }
    }
}
