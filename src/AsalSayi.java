public class AsalSayi {
    public static void main(String[] args) {
        int k = 2;
        while (k <= 100) {
            boolean isPrime = true;
            for (int j = 2; j < k; j++) {
                if (k % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(k + ", ");
            }
            k++;
        }
    }
}
