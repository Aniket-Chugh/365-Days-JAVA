package dayseven;

import java.util.Scanner;

public class inputjava {
    public static void main(String[] args) {
        // taking input ->
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string : ");

        StringBuilder inputsb = new StringBuilder(input.nextLine());

System.out.println("here the output you entered : ");
        System.out.println(inputsb);


        System.out.println("enter the letter you want to replace : ");
        System.out.println("enter start : ");
        int start = input.nextInt();
        System.out.println("enter end : ");
        int end  = input.nextInt();
System.out.println("enter the char you want : ");
        String str = input.next();

        inputsb.replace(start, end, str);



        System.out.println(inputsb);


    }
}
