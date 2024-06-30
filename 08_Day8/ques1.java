
// ques1 : Write a Java program to read an integer from the user and check if it is even or odd using the right shift operator.

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number :  ");
        int n = input.nextInt();

              if ((n >> 1) << 1 == n) {
                System.out.println("even");

              }
              else{
                System.out.println("odd!");
              }
    }
}
