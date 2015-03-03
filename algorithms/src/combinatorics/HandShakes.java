package combinatorics;
import java.math.BigInteger;
import java.util.Scanner;

public class HandShakes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int testCount = s.nextInt();
        long[] input = new long[testCount];
        for(int i=0; i< testCount; i++){
            input[i] = Long.parseLong("" + s.nextInt());
        }
        s.close();
        
        for (int j = 0; j < input.length; j++) {
        	long n = input[j];
        	long formulae = (n*(n-1))/(2);
			System.out.println(formulae);
		}
    }
}