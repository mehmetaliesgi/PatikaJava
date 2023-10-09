package Arrays;

public class PrintLetter {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];
        String[][] letterB = new String[7][4];
        String[][] letterC = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2) {
                    if ((i == 0 && j == 0) || (i == 0 && j ==3)) {
                        letter[i][j] = "   ";
                    }
                    else
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("*******************************");
        System.out.println(

        );
        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    if ((i == 0 && j == 3) || (i == 2 && j == 3) || (i == 3 && j == 3) || (i == 6 && j == 3)) {
                        letterB[i][j] = "   ";
                    }
                    else {
                        letterB[i][j] = " * ";
                    }
                } else if (j == 0 || j == 3) {
                    letterB[i][j] = " * ";
                } else {
                    letterB[i][j] = "   ";
                }
            }
        }


        for (String[] row : letterB){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*******************************");
        System.out.println();


        for (int i = 0; i < letterC.length; i++) {
            for (int j = 0; j < letterC[i].length; j++) {
                if (i == 0 || i == 6) {
                    if ((i == 0 && j == 0) || (i == 6 && j == 0)) {
                        letterC[i][j] = "   ";
                    }
                    else {
                        letterC[i][j] = " * ";
                    }

                } else if (j == 0) {
                    letterC[i][j] = " * ";
                } else {
                    letterC[i][j] = "   ";
                }
            }
        }


        for (String[] row : letterC){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
