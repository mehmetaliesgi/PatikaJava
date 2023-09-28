import java.util.Scanner;

public class Cin_Zodyagi {
    public static void main(String[] args) {
        int dogumYili;
        String burc = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen doğum yılınızı giriniz: ");
        dogumYili = sc.nextInt();

        switch (dogumYili % 12) {
            case 0:
                burc = "Maymun";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            case 1:
                burc = "Horoz";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            case 2:
                burc = "Köpek";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            case 3:
                burc = "Domuz";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            case 4:
                burc = "Fare";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            case 5:
                burc = "Öküz";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            case 6:
                burc = "Kaplan";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            case 7:
                burc = "Tavşan";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            case 8:
                burc = "Ejderha";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            case 9:
                burc = "Yılan";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            case 10:
                burc = "At";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;

            default:
                burc = "Koyun";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
        }
    }
}
