package daysix;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the rows : ");
        int rows = input.nextInt();
        System.out.println("enter the column number : ");
        int colm = input.nextInt();


        int[][] arr = new int[rows][colm];


        System.out.println("Input all the elements: ");
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<colm;j++){
                arr[i][j] = input.nextInt();
            }
        }
        int sum = 0;

System.out.println("sum of all the elements : ");
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<colm;j++){
                sum  = sum + arr[i][j];
            }
        }
        System.out.println(sum);

        
    }
}
