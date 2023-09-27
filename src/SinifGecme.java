import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, invalidLesson = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Lütfen Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if (mat > 100 || mat < 0) {
            invalidLesson += 1;
            mat = 0;
        }
        if (fizik > 100 || fizik < 0) {
            invalidLesson += 1;
            fizik = 0;
        }
        if (kimya > 100 || kimya < 0) {
            invalidLesson += 1;
            kimya = 0;
        }
        if (turkce > 100 || turkce < 0) {
            invalidLesson += 1;
            turkce = 0;
        }
        if (muzik > 100 || muzik < 0) {
            invalidLesson += 1;
            muzik = 0;
        }
        double avarage = (mat + fizik + kimya + turkce + muzik) / (5 - invalidLesson);

        if(avarage <= 55) {
            System.out.println("Sınıfta kaldınız seneye görüşmek üzere!\nNot ortalamanız: " + avarage);
        }
        else {
            System.out.println("Tebrikler sınıfı geçtiniz!\nNot ortalamanız: " + avarage);
        }

    }
}
