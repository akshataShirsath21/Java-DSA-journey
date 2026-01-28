package Java_Practice;

import java.util.Scanner;

public class Array2DProblem {
    public static void main(String[] args) {
//
//  SEARCHING FOR AN ELEMENT XIN  A MATRIX
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter cols : ");
        int cols = sc.nextInt();

        int[][] numbers;
        numbers = new int[rows][cols];

//      INPUT
        for (int i=0; i < rows; i++) {                      //ROWS INPUT
            for (int j = 0; j < cols; j++) {                 //COLS INPUT
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter wanted Num : ");
         int x = sc.nextInt();

         for (int i=0;i<rows;i++){
             for (int j=0;j<cols;j++){
//                 COMPARE WITH X
                 if (numbers[i][j] == x){
                     System.out.println("x is found at location ("+i+","+j+")");
                 }
             }
         }

    }
}
