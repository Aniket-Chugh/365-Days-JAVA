// Taking input in java 

import java.util.*;
import java.util.Scanner;;
public class input {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);


        System.out.println("input your good name : ");
        String name = input.nextLine();
        System.out.println("input your age : ");
        int age = input.nextInt();
        System.out.println("input your height : ");
        int height = input.nextInt();
        System.out.println("input your last name : ");
        String lastname = input.next();


        System.out.println("your name is :  " + name);
        System.out.println("your age  is :  " + age);
        System.out.println("your height is :  " + height);
        System.out.println("your lastname is :  " + lastname);


        // this is the way to take input in java 
        // import java.util.*; or scanner 

        
    }
}