package Arrays;

import java.util.Arrays;

public class MatrisTranspoze {
    public static void main(String[] args) {
        int [][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int [][] transpoze = new int[3][2];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris: ");
        for (int i[] : matris) {
            for (int k : i) {
                System.out.print(k + "  ");
            }
            System.out.println();
        }

        System.out.println("Transpoze: ");
        for (int i[] : transpoze) {
            for (int k : i) {
                System.out.print(k + "  ");
            }
            System.out.println();
        }
    }
}
