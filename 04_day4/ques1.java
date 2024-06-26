package dayfour;
// ques1. --> find factorial of the number n by recursion....
public class ques1 {

    public static void factorial(long n){
       int y = 1;
       for(int i = 1; i <= n; i++){
        y = y*i;
// y ki value change hogi , new y me store hogi , firstly 1 , then to 120 , and then finally print ho jaeegiii..
       }
       System.out.println(y);
    }
    public static void main(String[] args) {
       factorial(5); 
    }
}
