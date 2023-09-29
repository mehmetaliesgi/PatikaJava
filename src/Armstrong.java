import java.util.Scanner;

public class Armstrong {
    public static void arm() {
        int num, basNum = 0, result = 0, basValue, basPow;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen sayı giriniz: ");
        num = scanner.nextInt();
        int tempNum = num;

        while (tempNum != 0) {
            tempNum /= 10;
            basNum++;
        }

        tempNum = num;
        while (tempNum != 0) {
            basValue = tempNum % 10;
            basPow = 1;
            for (int i = 1; i <= basNum; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNum /= 10;
        }
        if (num == result) {
            System.out.println("Sayı Armstrong sayıdır.");
        }
        else {
            System.out.println("Sayı Armstrong sayı değildir.");
        }
    }

    public static void main(String[] args) {
        int sayi, basVal, result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = scanner.nextInt();

        while (sayi != 0) {
            basVal = sayi % 10;
            sayi /= 10;
            result += basVal;
        }
        System.out.println(result);
    }
}
