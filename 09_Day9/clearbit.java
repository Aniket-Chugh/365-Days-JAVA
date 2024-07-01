package daynine;

public class clearbit {
    public static void main(String[] args) {
        // input the n so acc to the user !
        int n = 5;
        // input the pos , its important!
        
        int pos = 2;

        int bitMask = 1<<pos;

        int notBitMask = ( ~ bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);

    }
}
