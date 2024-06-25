package daythree;
//ques9 --> Diamond patterns
public class patter9 {

    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<n-i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half -->

        for(int i = 1; i<=n-1;i++){
            for(int j = 0; j<i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}