import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int sayi1, sayi2, ebob = 1, ekok = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        int i = sayi1;
        while (i >= 1) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("İki sayının EBOB değeri: " + ebob);

        int j = 1;
        while (j <= (sayi1 * sayi2)) {
            if (j % sayi1 == 0 && j % sayi2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }
        System.out.println("İki sayının EKOK değeri: " + ekok);
    }
}
