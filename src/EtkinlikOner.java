import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {
        int temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        temp = input.nextInt();

        if(temp < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
        else if (temp >= 5 && temp <10) {
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if (temp >= 10 && temp <= 15) {
            System.out.println("Sinemaya gidebilirsiniz\nPiknik yapmaya gidebilirsiniz");
        }
        else if (temp >15 && temp <= 25) {
            System.out.println("Piknik yapmaya gidebilirsiniz");
        }
        else {
            System.out.println("Yüzemeye gidebilirsiniz");
        }
    }
}
