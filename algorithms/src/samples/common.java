package samples;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class common {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        s1 = s1.toUpperCase();
        String s2 = s.nextLine();
        s2 = s2.toUpperCase();
        char cs1[] = s1.toCharArray();
        char cs2[] = s2.toCharArray();
        int counter = 0;
        //Arrays.sort(cs1);
        //Arrays.sort(cs2);
        for(int i =0; i<cs1.length; i++){
        	int index = 0;
        	for (int j = 0; j < cs2.length; j++) {
        		if((cs1[i] - cs2[j]) == 0 && index <= i) { counter ++;   }
        		index ++;
			}
        }
        System.out.println(counter);
        s.close();
    }
}