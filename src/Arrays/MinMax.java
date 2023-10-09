package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int [] list = new int [5];
        Scanner scanner = new Scanner(System.in);
        int max = list[0];
        int min = list[0];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Lütfen bir sayı giriniz: ");
            list[i] = scanner.nextInt();
            if (list[i] > max) {
                max = list[i];
            }
            if (list[i] < min) {
                min = list[i];
            }
        }
        System.out.println("Dizinin en büyük elemanı: " + max);
        System.out.println("Dizinin en küçük elemanı: " + min);

        /*
        int [] list = new int [5];
        Scanner scanner = new Scanner(System.in);
        int max = list.length -1;

        for (int i = 0; i < list.length; i++) {
            System.out.print("Lütfen bir sayı giriniz: ");
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Dizinin en küçük elemanı: " + list[0]);
        System.out.println("Dizinin en büyük elemanı: " + list[max]);
         */

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int index = 0;
        int girilen;
        System.out.print("Lütfen bir sayı giriniz: ");
        girilen = scanner.nextInt();
        for (int i = 0; i < list.length; i++) {
            if (list[i] > girilen) {
                index = i;
                break;
            }
        }
        if (index != 0) {
            System.out.println("Girilen sayıya en yakın küçük sayı = " + list[index-1]);
            System.out.println("Girilen sayıya en yakın büyük sayı = " + list[index]);
        }
        else {
            System.out.println("Zaten girilen sayı en küçük sayı.");
            System.out.println("Girilen sayıya en yakın büyük sayı = " + list[index]);
        }
    }
}
