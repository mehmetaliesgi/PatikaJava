import java.util.Scanner;

public class UsluSayilarRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int x = sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int y = sc.nextInt();
        System.out.println("Sonuç = " + usluRecursive(x,y));
    }

    public static int usluRecursive(int a, int b) {
        int sonuc = 1;
        if (b == 1) {
            sonuc *= a;
        }
        else {
            sonuc = a * usluRecursive(a,b-1);
        }
        return sonuc;
    }
}
