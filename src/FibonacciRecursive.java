import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int sayi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir değer giriniz: ");
        sayi = scanner.nextInt();

        System.out.println(sayi + ". fibobacci sayısı = " + fibonacci(sayi));
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n -1) + fibonacci(n - 2);
    }
}
