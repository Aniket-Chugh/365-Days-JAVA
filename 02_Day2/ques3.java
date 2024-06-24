package daytwo;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       while(true){
        System.out.println("input 1 to 3 ");
        int n = input.nextInt(); 
       
       while(n == 0){
        switch (n) {
            case 0:
            System.out.println("exiting....");
            break;
            case 1:
                System.out.println("you entered 1");
                break;

                case 2 : 
                System.out.println("you entered 2 ");
        break;
        case 3 : 
        System.out.println("you entered 3");
        break;
            default:
            System.out.println("invalidd input !!");
                break;
        }
      break;  
    }
       }
    }
}
