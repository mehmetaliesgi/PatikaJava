import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi, toplam = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen test etmek istediğiniz sayıyı giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 1; i <= sayi/2; i++) {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println(sayi + "'sı bir mükemmel sayıdır.");
        }
        else {
            System.out.println(sayi + "'sı mükemmel sayı değildir.");
        }
    }
}
