import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen test etmek istediğiniz sayıyı giriniz: ");
        number = scanner.nextInt();

        if (isPalindrom(number) == true) {
            System.out.println(number + " sayısı bir palindrom sayıdır.");
        }
        else {
            System.out.println(number + " sayısı palindrom bir sayı değildir.");
        }
    }

    public static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastIndex;

        while (temp != 0) {
            lastIndex = temp % 10;
            reverseNumber  = (reverseNumber * 10) + lastIndex;
            temp /= 10;
        }

        if (number == reverseNumber) {

            return true;
        }
        else {
            return false;
        }
    }
}
