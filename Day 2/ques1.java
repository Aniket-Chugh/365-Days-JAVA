package daytwo;
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of a = ");
        int a = input.nextInt();
        System.out.println("enter the value of b = ");
        int b = input.nextInt();
        System.out.println("enter the value of c = ");
        int c = input.nextInt();


        int determinant = b*b - 4*a*c;
        // use if else conditions -->




        if (determinant > 0) {


            double root1 = (-b + Math.sqrt(determinant))/2*a;
            double root2 = (-b - Math.sqrt(determinant))/2*a;

            System.out.println("root no. 1 = " + root1);
            System.out.println("root no. 2 = " + root2);
            
        }
        else if (determinant == 0) {
            double root1 = (-b + Math.sqrt(determinant))/2*a;
System.out.println("root1 = root2 = "  + root1);
        }

        else{
           // no real roots for determinant < 0 
           System.out.println("no root found");
        }


    }
}
