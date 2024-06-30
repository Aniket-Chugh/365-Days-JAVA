import java.util.Scanner;

public class leftshift {
    public static void main(String[] args) {
        // left Shift operator ("<<")

Scanner input = new Scanner(System.in);
System.out.println("enter the first element : ");
int a = input.nextInt();
System.out.println("shifted by ? : ");
int b = input.nextInt();
// left shift -->

System.out.println("the the element : " + a  + " shifted  left by : " + b + " is eqaul to : " + (a<<b));
    }
}
