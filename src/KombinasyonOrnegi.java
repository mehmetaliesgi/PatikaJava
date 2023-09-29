import java.util.Scanner;

public class KombinasyonOrnegi {
    public static void main(String[] args) {
        int n, r, kombinasyon, fak_r = 1, fak_n = 1, fak_nr = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz: ");
        n = sc.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        r = sc.nextInt();


        if(n<0 || r<0 || n<r){
            System.out.println("Geçersiz bir sayı girdiniz! ");

        }else {
            for (int i = 1; i <= n; i++) {
                fak_n = fak_n * i;
            }
            for (int i = 1; i <=r; i++) {
                fak_r = fak_r * i;
            }
            for (int i = 1; i <= (n-r); i++) {
                fak_nr = fak_nr * i;
            }
            kombinasyon = fak_n / (fak_r * fak_nr);
            System.out.println("Birinci sayının ikinci sayıyla kombinasyonu = " + kombinasyon);
        }

    }
}
