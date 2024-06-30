import java.util.Scanner;

public class rightshift {
    public static void main(String[] args) {
        // right shift ( ">>")
        Scanner input = new Scanner(System.in);
        System.out.println("enter the element : ");
        int a = input.nextInt();
        System.out.println("shifted right by : ");
        int b = input.nextInt();

        // right shift -->

        System.out.println("the element : " + a + " shifted right by : " + b + " is equal to : " + (a >> b));
        // the 0-1 form ---->
        int result = a >> b;

        System.out.println("the element : " + Integer.toBinaryString(a) + " shifted right by : "
                + Integer.toBinaryString(b) + " is equal to : " + Integer.toBinaryString(result));

    }
}
