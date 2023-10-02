import java.util.Scanner;

public class AsalSayiRecursive {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        number = sc.nextInt();

        if(isPrime(number, number/2)) {
            System.out.println("Girdiğiniz sayı asal sayıdır");
        }
        else {
            System.out.println("Girdiğiniz sayı asal sayı değildir.");
        }
    }

    public static boolean isPrime(int number, int divisor) {
       if (divisor == 1) {
           return true;
       }
       if (number % divisor == 0) {
           return false;
       }
       return isPrime(number, divisor-1);
    }
}
