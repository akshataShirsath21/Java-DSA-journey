package Java_Practice;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter cols : ");
        int cols = sc.nextInt();

        int[][] numbers;
        numbers = new int[rows][cols];

//      INPUT
        for (int i = 0; i < rows; i++) {                      //ROWS INPUT
            for (int j = 0; j < cols; j++) {                 //COLS INPUT
                numbers[i][j] = sc.nextInt();
            }
        }

//      OUTPUT
            for (int i = 0; i < rows; i++) {                  //ROWS OUTPUT
                for (int j = 0; j < cols; j++) {             //COLS OUTPUT
                    System.out.print(numbers[i][j] + "  ");
                }
                System.out.println();
            }


    }
}