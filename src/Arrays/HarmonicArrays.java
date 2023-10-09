package Arrays;

import java.util.Scanner;

public class HarmonicArrays {
    public static void main(String[] args) {
        int [] list = new int[3];
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;

        for (int i = 0; i < list.length; i++) {
            System.out.print("Lütfen eklemek istediğiniz " + (i+1) +". değeri giriniz: ");
            list[i] = scanner.nextInt();
            for (int j = 1; j <= list[i]; j++) {
                sum += 1.0/j;
            }
        }
        double avarage = sum / list.length;
        System.out.println("Dizideki sayıların ortalaması: " + avarage);
    }
}
