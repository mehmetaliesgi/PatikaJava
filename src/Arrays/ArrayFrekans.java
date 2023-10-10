package Arrays;
import java.util.Arrays;

public class ArrayFrekans {
    public static void main(String[] args) {
        int [] dizi = {1, 42, 12, 52, 23, 1, 1, 4, 12, 52, 33, 23, 42, 52, 1, 12};

        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            int frekans = 0;

            if (eleman == -1) {
                continue;
            }

            for (int j = i; j < dizi.length; j++) {
                if (eleman == dizi[j]) {
                    frekans++;
                    dizi[j] = -1;
                }
            }

            System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}
