import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        int rakam;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen basamak sayısını giriniz: ");
        rakam = scanner.nextInt();

        for (int i = 0; i <= rakam ; i++) {
            for (int j = 0; j < (rakam - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i = rakam; i >= 0; i--) {
            for (int j = 1; j <= rakam - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
