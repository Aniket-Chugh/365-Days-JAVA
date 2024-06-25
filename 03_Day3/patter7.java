package daythree;
// quest7 --> k pattern
public class patter7 {
    public static void main(String[] args) {
       // 1st half -->
       int n = 4;
       for(int i = 0; i<n;i++){
        for(int j = 0; j<n-i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       //2nd half -->
       for(int i = 1; i<=n;i++){
        for(int j = 1; j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
       } 
    }
}
