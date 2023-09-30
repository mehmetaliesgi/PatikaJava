import java.util.Scanner;

public class TestUcgen {
    public static void main(String[] args) {
        int sayi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 0; i < sayi; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * sayi - (2 * i) - 1; k >=1; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
