import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen işlem yapmak istediğiniz ilk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("Lütfen işlem yapmak istediğiniz ikinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();


        switch (select) {
            case 1: System.out.println("İşlem sonucu = " + (n1 + n2));
                break;

            case 2: System.out.println("İşlem sonucu = " + (n1 - n2));
                break;

            case 3: System.out.println("İşlem sonucu = " + (n1 * n2));
                break;

            case 4: switch (n2) {
                case 0: System.out.println("Payda 0 olamaz.");
                    break;

                default: System.out.println("İşlem sonucu = " + (n1 / n2));
            }
                break;

            default: System.out.println("Geçersiz bir işlem girdiniz.");
        }
    }
}
