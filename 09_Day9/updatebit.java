package daynine;

import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

      
       // oper=1 -> set; oper=0 -> clear
       System.out.println("enter the nunber : ");
      int n = sc.nextInt();
      System.out.println("enter the position : ");

      int pos = sc.nextInt();
      System.out.println("enter 1/0 : ");
      int oper = sc.nextInt();
      int bitMask = 1<<pos;
      if(oper == 1) {
          //set
          int newNumber = bitMask | n;
          System.out.println(newNumber);
      } else {
       //clear
       int newBitMask = ~(bitMask);
       int newNumber = newBitMask & n;
       System.out.println(newNumber);
      }

    }
}
