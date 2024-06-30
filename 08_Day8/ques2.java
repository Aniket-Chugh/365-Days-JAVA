import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Multiply the number by 4 using left shift operator
        int result = number << 2; // Equivalent to number * 4

        // Output the result
        System.out.println(number + " multiplied by 4 is: " + result);

        scanner.close(); 
    }
}
