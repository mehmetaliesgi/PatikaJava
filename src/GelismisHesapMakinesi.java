import java.sql.PreparedStatement;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        int select;

        Scanner scanner = new Scanner(System.in);

        String menu = "1- Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme İşlmei\n5- Üslü Sayı Hesaplama\n6- Mod Alma\n7- Dikdörtgen Alan ve Çevre Hesabı\n0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scanner.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("Lütfen ilk sayıyı giriniz: ");
            int a = scanner.nextInt();
            System.out.print("Lütfen ikinci sayıyı giriniz: ");
            int b = scanner.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if ((a == 0 && b == 0) || b == 0) {
                        System.out.println("Lütfen geçerli bir değer giriniz!!");
                        break;
                    }
                    else {
                        devide(a, b);
                    }
                    break;
                case 5:
                    System.out.println("Çarpma İşlemi Sonuncu: " + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi Sonucu: " + mod(a, b));
                    break;
                case 7:
                    System.out.println("Dikdörtgen Çevre Uzunluğu: " + cevreHesapla(a, b));
                    break;
                case 8:
                    System.out.println("Dikdörtgen Alanı: " + alanHesapla(a, b));
                    break;

                default:
                    System.out.println("Lütfen geçerli bir işlem giriniz!!!");
                    break;
            }
        }
        System.out.println("Güle Güle");
    }

    public static int sum(int x, int y) {
        int result = x + y;
        System.out.println("Toplam İşlemi Sonucu: " + result);
        return result;
    }

    public static void minus(int x, int y) {
        System.out.println("Çıkarma İşlemi Sonucu: " + (x - y));
    }

    public static void times(int x, int y) {
        System.out.println("Çarpma İşlemi Sonucu: " + (x * y));
    }

    public static double devide (int x, int y) {
        double result = x / y;
        System.out.println("Bölme İşlemi Sonucu: " + result);

        return x/y;
    }

    public static int power(int x, int y) {
        int result;
        if (x == 0 || y == 0) {
            return 0;
        }
        else {
            result = x * y;
        }
        return result;
    }

    public static int mod(int x, int y) {
        int result;
        if (x == 0 || y == 0) {
            System.out.println("Lütfen geçerli değerler giriniz!!!");
            return 0;
        }
        else {
            result = x % y;
        }
        return result;
    }

    public static int cevreHesapla(int x, int y) {
        int cevre;
        cevre = (2 * x) + (2 * y);
        return cevre;
    }

    public static int alanHesapla(int x, int y) {
        int alan;
        alan = x * y;
        return alan;
    }
}
