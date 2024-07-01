package daynine;

import java.util.Scanner;

public class getbit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the elment :");
        int a = input.nextInt();
        System.out.println("enter the position you wanna know is 0 or 1 : ");
        int pos = input.nextInt();

        int bitMask = 1<<pos;

        if ((bitMask & a) == 0)  {

            System.out.println("bit was zero");

            
        }
        else{
            System.out.println("bit was one !");
        }

    }
}
