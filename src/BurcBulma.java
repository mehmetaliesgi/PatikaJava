import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int day;
        String month, burc = "";
        boolean isBoolean = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.next();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        if((month.equals("Aralık") && day >= 22) || (month.equals("Ocak") && day < 22)) {
            if((month.equals("Aralık") && (day < 31 && day > 0)) || (month.equals("Ocak") && (day < 31 && day > 0))) {burc = "Oğlak Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Ocak") && day >= 22) || (month.equals("Şubat") && day < 20)) {
            if((month.equals("Ocak") && (day <= 31 && day > 0)) || (month.equals("Şubat") && (day < 29 && day > 0))) { burc = "Kova Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Şubat") && day >= 20) || (month.equals("Mart") && day < 21)) {
            if((month.equals("Mart") && (day <= 31 && day > 0)) || (month.equals("Şubat") && (day < 29 && day > 0))) { burc = "Balık Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Mart") && day >= 21) || (month.equals("Nisan") && day < 20)) {
            if((month.equals("Nisan") && (day <= 30 && day > 0)) || (month.equals("Mart") && (day <= 31 && day > 0))) { burc = "Koç Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Nisan") && day >= 20) || (month.equals("Mayıs") && day < 22)) {
            if((month.equals("Mayıs") && (day <= 31 && day > 0)) || (month.equals("Nisan") && (day <= 30 && day > 0))) { burc = "Boğa Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Mayıs") && day >= 22) || (month.equals("Haziran") && day < 23)) {
            if((month.equals("Haziran") && (day <= 30 && day > 0)) || (month.equals("Mayıs") && (day <= 31 && day > 0))) { burc = "İkizler Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Haziran") && day >= 23) || (month.equals("Temmuz") && day < 23)) {
            if((month.equals("Haziran") && (day <= 30 && day > 0)) || (month.equals("Temmuz") && (day <= 31 && day > 0))) { burc = "Yengeç Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Temmuz") && day >= 23) || (month.equals("Ağustos") && day < 23)) {
            if((month.equals("Ağustos") && (day <= 31 && day > 0)) || (month.equals("Temmuz") && (day <= 31 && day > 0))) { burc = "Aslan Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Ağustos") && day >= 23) || (month.equals("Eylül") && day < 23)) {
            if((month.equals("Eylül") && (day <= 30 && day > 0)) || (month.equals("Ağustos") && (day <= 31 && day > 0))) { burc = "Başak Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Eylül") && day >= 23) || (month.equals("Ekim") && day < 23)) {
            if((month.equals("Ekim") && (day <= 31 && day > 0)) || (month.equals("Eylül") && (day <= 30 && day > 0))) { burc = "Terazi Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Ekim") && day >= 23) || (month.equals("Kasım") && day < 22)) {
            if((month.equals("Kasım") && (day <= 30 && day > 0)) || (month.equals("Ekim") && (day <= 31 && day > 0))) { burc = "Akrep Burcu"; }
            else {
                isBoolean = true;
            }
        }
        else if ((month.equals("Kasım") && day >= 22) || (month.equals("Aralık") && day < 22)) {
            if((month.equals("Aralık") && (day <= 31 && day > 0)) || (month.equals("Kasım") && (day <= 30 && day > 0))) { burc = "Yay Burcu"; }
            else {
                isBoolean = true;
            }
        }
        if(isBoolean) {
            System.out.println("Hatalı giriş yaptınız tekrar deneyiniz....");
        }
        else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
