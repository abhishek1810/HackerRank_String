package strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CommonSubstring {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String i1[] = new String[t];
		String i2[] = new String[t];
		int one=0, two=0;
		for (int j = 0; j < t * 2; j++) {
			if(j%2 == 0) {
				char a[] = s.next().toCharArray();
				Arrays.sort(a);
				i1[one] = new String(a);
				one ++;
			}
			else {
				char a[] = s.next().toCharArray();
				Arrays.sort(a);
				i2[two] = new String(a);
				two++;
			}

		}
		char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		outer :
			for (int j = 0; j < i1.length; j++) {
				String available = "NO";
				for (int i = 0; i < letters.length; i++) {
					if(i1[j].indexOf(letters[i]) != -1 && i2[j].indexOf(letters[i]) != -1) {
						available = "YES"; 
						System.out.println(available);
						continue outer; 
					}
				}
				System.out.println(available);
			}

	}
}