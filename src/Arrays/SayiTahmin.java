package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        int forecast = 0;
        int selected;
        int [] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (forecast < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = scanner.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    forecast++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: " + (5 - forecast));
                } else {
                  isWrong = true;
                  System.out.println("Bir daha hatalı giriş yaparsanız hakkınızdan düşülecektir!!");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı: " + number);
                break;
            }
            else {

                if (selected > number) {
                    System.out.println(selected + " sayısı tahmin ettiğiniz sayıdan büyüktür.");
                }
                else {
                    System.out.println(selected + " sayısı tahmin ettiğiniz sayıdan küçüktür.");
                }

                wrong[forecast++] = selected;
                System.out.println("Tahmininiz yanlış kalan tahmin hakkınız: " + (5 - forecast));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
