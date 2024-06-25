package daythree;
// ques8 --> mirror image triangle pattern
public class patter8 {
    public static void main(String[] args) {
        int n = 5;
       
        // 1st half
        for(int i = 1; i<=n-1;i++){
            for(int j = 0; j<=i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n-i;j++){
                System.out.print(j+ " ");
              
            }
            if (i == n-1) {

            }
            else{
                System.out.println();

            }        
        }
        // second half
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print(j+ " ");
               
            }
            System.out.println();
            
        }

     
    }
}
