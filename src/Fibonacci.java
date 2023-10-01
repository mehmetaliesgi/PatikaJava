import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int ilkSayi = 0, ikinciSayi = 1, kacSayi;

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Fibonacci serisinin kaç adet sayısını görmek istediğinizi giriniz: ");
        kacSayi = sc.nextInt();

        for (int i = 2; i <= kacSayi; i++) {
            int sonrakiSayi = ilkSayi + ikinciSayi;
            System.out.print(sonrakiSayi + ", ");
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
            sonrakiSayi = ilkSayi + ikinciSayi;
        }
    }
}

// 0 ile
