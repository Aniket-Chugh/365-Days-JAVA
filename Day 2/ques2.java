package daytwo;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
System.out.println("enter the value of n = ");
        int n = input.nextInt();
        int y;
     
            for(int i = 1; i<=10; i++){
    y = i*n;
    System.out.println(n+ " X " + i + " = " + y);
            }
    }
}
