package daythree;
// ques1. --> square hollow pattern
public class patt1 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 0; i<=n;i++){
            System.out.print("*");
            for(int j = 0; j<n-2; j++){
                if (i == 0 || i == n) {
                    System.out.print("*");
                }
                
                else{
                    
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}