package combinatorics;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SocksPair {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int testCount = s.nextInt();
        int[] input = new int[testCount];
        for(int i=0; i< testCount; i++){
            input[i] = s.nextInt();
        }
        s.close();
        
        for (int j = 0; j < input.length; j++) {
			System.out.println(input[j] + 1);
		}
    }
}