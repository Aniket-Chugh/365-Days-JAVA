package dayfive;

import java.util.Scanner;

public class inputtaking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size : ");
            int size = input.nextInt(); // only have row !
            int[] number = new int[size];

// taking input of array -->
            System.out.println("enter the elements/numbers : ");
            for(int i = 0;i<size;i++){
                number[i] = input.nextInt();
            }

            // taking output-->
            System.out.println("here's the element as out put : ");
            for(int i = 0; i<number.length;i++){
                System.out.println(number[i]);
            }
    }
}
