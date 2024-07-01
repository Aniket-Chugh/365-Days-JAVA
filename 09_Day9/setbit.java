package daynine;
import java.util.*;
public class setbit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Enter the position: ");
        int pos = input.nextInt();

        int bitMask = 1 << pos; // Shift 1 to the left by pos positions

        int newNumber = bitMask | n; // Use OR to set the bit at the specified position
        System.out.println("The new number is: " + newNumber);
    }
}
