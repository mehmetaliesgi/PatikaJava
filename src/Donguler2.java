import java.util.Scanner;

public class Donguler2 {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        boolean isOdd = true;

        Scanner sc = new Scanner(System.in);

        while (isOdd) {
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi = sc.nextInt();

            if(sayi % 2 == 0) {
                if(sayi % 4 == 0) {
                    toplam += sayi;
                }
            }
            else {
                isOdd = false;
            }
        }
        System.out.println("Toplam: " + toplam);
    }
}
