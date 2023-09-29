import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        int kalanHak = 3, miktar, bakiye = 1500, islem;

        Scanner scanner = new Scanner(System.in);

        while (kalanHak > 0) {
            System.out.print("Username: ");
            userName = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();
            if(userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Giriş yaptınız.");
                do {
                    System.out.print("1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
                    islem = scanner.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            miktar = scanner.nextInt();
                            bakiye += miktar;
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz miktar: ");
                            miktar = scanner.nextInt();
                            if(bakiye < miktar) {
                                System.out.println("Girdiğiniz değer hatalı. Maksimum çekebileceğiniz miktar: " + bakiye);
                            }
                            else {
                                bakiye -= miktar;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                    }
                } while (islem != 4);
                System.out.println("Bankamızı kullandığınız için teşekkürler. Görüşmek Üzere!");
                break;
            }
            else {
                System.out.println("Hatalı giriş yaptınız, kalan hakkınız: " + --kalanHak);
            }
        }
    }
}
