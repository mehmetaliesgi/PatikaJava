import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, wantNewPw, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.next();
        System.out.print("Password: ");
        password = input.next();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.print("Yeni şifre belirlemek ister misiniz? ");
            wantNewPw = input.next();
            switch (wantNewPw) {
                case "evet":
                    System.out.print("Lütfen yeni şifrenizi giriniz: ");
                    newPassword = input.next();

                    if (newPassword.equals("java123") || newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else {
                        System.out.println("Şifre oluşturuldu. Yeni şifreniz: " + newPassword);
                    }
                    break;
                default:
                    System.out.println("Şifreniz değiştirilmeyecek");
            }
        }
        else
        {
            System.out.println("Bilgileriniz yanlış");
        }

    }
}
