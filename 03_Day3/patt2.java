package daythree;
// ques2. --> number triangular -->
public class patt2 {
 public static void main(String[] args) {
    int n = 4;

    for(int i = 0; i<=n; i++){
      
       for(int j = 0 ; j<n-i ; j++){
        System.out.print(" ");
       }
       for(int j = 0; j<i; j++){
        System.out.print(i + " ");
       }
       System.out.println();
    }
 }   
}
