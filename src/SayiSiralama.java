import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        sayi3 = input.nextInt();

        if ((sayi1 < sayi2) && (sayi1 < sayi3)) {
            if (sayi2 < sayi3) {
                System.out.println("Sıralama: " + sayi1 + " < " + sayi2 + " < " + sayi3);
            }
            else {
                System.out.println("Sıralama: " + sayi1 + " < " + sayi3 + " < " + sayi2);
            }
        } else if ((sayi2 < sayi1) && (sayi2 < sayi3)) {
            if (sayi1 < sayi3) {
                System.out.println("Sıralama: " + sayi2 + " < " + sayi1 + " < " + sayi3);
            }
            else {
                System.out.println("Sıralama: " + sayi2 + " < " + sayi3 + " < " + sayi1);
            }
        }
        else {
            if(sayi1 < sayi2) {
                System.out.println("Sıralama: " + sayi3 + " < " + sayi1 + " < " + sayi2);
            }
            else {
                System.out.println("Sıralama: " + sayi3 + " < " + sayi2 + " < " + sayi1);
            }
        }
    }
}
