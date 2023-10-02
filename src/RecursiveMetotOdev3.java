import java.util.Scanner;

public class RecursiveMetotOdev3 {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        number = scanner.nextInt();

        incAndDecNumber(number);
    }
    static void incAndDecNumber(int number) {
        System.out.print(number + " ");
        if (number > 0) {
            incAndDecNumber(number - 5);
        }
        if (number > 0) {
            System.out.print(number + " ");
        }
    }
}
