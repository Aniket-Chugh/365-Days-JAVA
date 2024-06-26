package dayfour;
import java.util.Scanner;
// ques2. --> Make a function to print the table of a given number n. upto 10
public class ques2 {
    static void printn(int n){
        int m = 10;
        int result;
        for(int i = 0; i<=m;i++){
       result = n*i;
       System.out.println(n + " X " + i + " = " + result);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write the number : ");
        int y = input.nextInt();
        printn(y);
    }
}
