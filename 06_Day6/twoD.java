package daysix;

import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {
        // 2D arrays have rows and column both... just like a matrix !! , i- rows , j -
        // column
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows you want : ");
        int rows = input.nextInt();
        System.out.println("enter the column you want  : ");
        int colmn = input.nextInt();

        // way of writing two d arrays -->
        int[][] twoD = new int[rows][colmn];

        // direct meathod -->
        int[][] example = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 }
        };

        System.out.println("enter the elements you want : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colmn; j++) {
                twoD[i][j] = input.nextInt();
            }
        }

        System.out.println("these are the elements you have given as input ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colmn; j++) {
                System.out.print(twoD[i][j]);
            }
            System.out.println();
        }

        input.close();

        System.out.println("out put of the example 2 : ");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(example[i][j]);
            }
            System.out.println();
        }

    }
}
