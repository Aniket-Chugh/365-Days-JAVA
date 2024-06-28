package daysix;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the rows : ");
        int rows = input.nextInt();
        System.out.println("enter the columns you want : ");
        int colmn = input.nextInt();

        int[][] arr = new int[rows][colmn];

        // taking input for the elements :
        System.out.println("enter the elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colmn; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("heres the sum of the diagonal numbers  : ");
        int sum = 0;

        System.out.println("enter the elements : ");
        for (int i = 0; i < rows; i++) {
            sum += arr[i][i];

        }
        System.out.println(sum);
    }
}
