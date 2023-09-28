import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int mesafe, yas, yolculuk_tipi;
        double km_cost = 0.10, bilet_fiyatı = 0.0, yas_12_indirim = 0.5, yas_12_24_indirim = 0.1, yas_65_ustu_indirim = 0.3, cift_yon_indirim = 0.2, indirim = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Mesafe Giriniz: ");
        mesafe = sc.nextInt();
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = sc.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculuk_tipi = sc.nextInt();

        if((yas > 1 && mesafe > 0) && (yolculuk_tipi == 1 || yolculuk_tipi == 2)) {
            if(yas < 12) {
                bilet_fiyatı = km_cost * mesafe;
                indirim = bilet_fiyatı * yas_12_indirim;
                bilet_fiyatı = bilet_fiyatı - indirim;
                if (yolculuk_tipi == 2) {
                    indirim = bilet_fiyatı * cift_yon_indirim;
                    bilet_fiyatı = bilet_fiyatı - indirim;
                    System.out.println("Bilet Fiyatı: " + bilet_fiyatı);
                }
                else {
                    System.out.println("Bilet Fiyatı: " + bilet_fiyatı);
                }
            }
            else if(yas >= 12 && yas <= 24) {
                bilet_fiyatı = km_cost * mesafe * 2;
                indirim = bilet_fiyatı * yas_12_24_indirim;
                bilet_fiyatı = bilet_fiyatı - indirim;
                if (yolculuk_tipi == 2) {
                    indirim = bilet_fiyatı * cift_yon_indirim;
                    bilet_fiyatı = bilet_fiyatı - indirim;
                    System.out.println("Bilet Fiyatı: " + bilet_fiyatı);
                }
                else {
                    System.out.println("Bilet Fiyatı: " + bilet_fiyatı);
                }
            }
            else if(yas > 65) {
                bilet_fiyatı = km_cost * mesafe;
                indirim = bilet_fiyatı * yas_65_ustu_indirim;
                bilet_fiyatı = bilet_fiyatı - indirim;
                if (yolculuk_tipi == 2) {
                    indirim = bilet_fiyatı * cift_yon_indirim;
                    bilet_fiyatı = bilet_fiyatı - indirim;
                    System.out.println("Bilet Fiyatı: " + bilet_fiyatı);
                }
                else {
                    System.out.println("Bilet Fiyatı: " + bilet_fiyatı);
                }
            }
            else {
                bilet_fiyatı = km_cost * mesafe;
                if(yolculuk_tipi == 2){
                    indirim = bilet_fiyatı * cift_yon_indirim;
                    bilet_fiyatı = bilet_fiyatı - indirim;
                    System.out.println("Bilet Fiyatı: " + bilet_fiyatı);
                }
                else {
                    System.out.println("Bilet Fiyatı: " + bilet_fiyatı);
                }
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
