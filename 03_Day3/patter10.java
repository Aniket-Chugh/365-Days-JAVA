package daythree;
// ques10 --> Butterfly star pattern
public class patter10 {
    public static void main(String[] args) {
        
    
    int n = 5;

    for (int i = 1; i<=n; i++){
       
        for (int j = 1; j<=i ; j++){
            System.out.print("*");
        }
        int spaces = 2*(n-i);
        for (int j = 1; j<=spaces;j++){
            System.out.print(" ");
        }
        for (int j = 1; j<=i ; j++){
            System.out.print("*");
        }

        System.out.println();
    }
    for (int i = n; i>=1; i--){
        // printing the left side -->
        for (int j = 1; j<=i ; j++){
            System.out.print("*");
        }
        // printing the spaces -->
        int spaces = 2*(n-i);
        for (int j = 1; j<=spaces;j++){
            System.out.print(" ");
        }
        // printing the right part -->
        for (int j = 1; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}

