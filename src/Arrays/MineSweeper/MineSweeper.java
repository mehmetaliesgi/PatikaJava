package Arrays.MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    String[][] MineMap;
    String[][] GameMap;
    int mineCount;
    int r;
    int c;
    int count;
    boolean isTrue = true;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        GameMap = new String[row][col];
        MineMap = new String[row][col];
        mineCount = (row * col) / 4;
    }

    public void MineMap(){
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                MineMap[i][j] = "-";
                GameMap[i][j] = "-";
            }
        }
        randomMine();
    }

    public void randomMine() {
        Random r = new Random();

        for (int i = 0; i < mineCount; i++) {
            int mineRow = r.nextInt(this.row);
            int mineCol = r.nextInt(this.col);

            if (!MineMap[mineRow][mineCol].equals("*")) {
                MineMap[mineRow][mineCol] = "*";
            }
            else {
                mineRow = r.nextInt(this.row);
                mineCol = r.nextInt(this.col);
                MineMap[mineRow][mineCol] = "*";
            }
        }
    }

    public void printMineMap() {
        for (int i = 0; i < MineMap.length; i++) {
            for (int j = 0; j < MineMap[i].length; j++) {
                System.out.print("  " + MineMap[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("==================================");
    }

    public void printGameMap(){
        for (int i = 0; i < GameMap.length; i++) {
            for (int j = 0; j < GameMap[i].length; j++) {
                System.out.print(GameMap[i][j] = "  -  ");
            }
            System.out.println();
        }
        System.out.println("==================================");
    }

    public void control(){
        count = 0;
        for(int i = (r - 1); i <= (r + 1); i++){
            for (int j = (c - 1); j <= (c + 1); j++) {
                if(i < 0 || j < 0 || i >= this.row || j >= this.col){
                    continue;
                }
                if(MineMap[i][j].equals("*")){
                    count++;
                }
            }
        }
        GameMap[r][c] = String.valueOf(count);
        MineMap[r][c] = String.valueOf(count);
        for(int i = 0; i < this.row; i++){
            for (int j = 0; j < this.col; j++) {
                System.out.print("  " + GameMap[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public boolean finish() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (MineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void ChooseIndex(){
        Scanner sc = new Scanner(System.in);
        isTrue = false;
        while(!isTrue){
            System.out.print("Enter row: ");
            r = sc.nextInt();
            System.out.print("Enter column: ");
            c = sc.nextInt();

            r-=1; // We set the entered number equal to the index number of the array.
            c-=1;

            if(r > row || c > col ){
                System.out.println("You entered a value outside the map boundaries. Enter again.");
                continue;
            }
            if(MineMap[r][c].equals("*")){
                System.out.println("Game Over!");
                break;
            }
            control();
            if(finish()){
                System.out.println("Congratulations! You win.");
                break;
            }

        }
    }

    public void run(){
        printGameMap();
        MineMap();
        //printMineMap();
        ChooseIndex();
    }

}
