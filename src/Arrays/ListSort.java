package Arrays;

import java.util.Scanner;

public class ListSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen dizinizin boyutunu giriniz: ");
        int size = scanner.nextInt();
        int[] list = new int[size];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < list.length; i++) {
            System.out.print("Lütfen " + (i + 1) + ". değeri giriniz: ");
            list[i] = scanner.nextInt();
        }

        sortList(list);

        for (int value : list) {
            System.out.print(value + " ");
        }
    }

    static void sortList(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

}
