import java.util.Scanner;

public class bitwiseop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first element : ");
        int first = input.nextInt();
        System.out.println("enter the second integer : ");
        int second = input.nextInt();

    // out put of all the basic bitwise operator -->
// Example: 5 & 3 (binary 0101 & 0011 results in 0001, which is 1).


// AND - Each bit in the result is 1 if the corresponding bits in both operands are 1.


    System.out.println("Bitwise AND : " + (first & second));

    // OR - Each bit in the result is 1 if at least one of the corresponding bits in the operands is 1.

    System.out.println("Bitwise OR : " + (first | second ) );

   // xor -  Each bit in the result is 1 if the corresponding bits in the operands are different.

    System.out.println("Bitwise XOR : "  + (first^second));

    // NOT : Each bit in the result is the inverse of the corresponding bit in the operand.

    System.out.println("Bitwise NOT for first integer : " + (~first));
// Example: ~5 (binary ~0101 results in 1010, which is -6 in 2's complement form).

    
    }
}
