package strings;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/anagram
 *
 */
public class TwoStringAnagram {

	public static void main(String[] args) { 
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String i[] = new String[t];
		for (int j = 0; j < t; j++) {
			i[j] = s.next();
		}

		for (int j = 0; j < i.length; j++) {
			String str = i[j];
			if(str.length()%2 == 1) {
				System.out.println("-1");
			}
			else{
				String sub1 = str.substring(0, str.length()/2);
				String sub2 = str.substring(str.length()/2, str.length());
				char c1[] = sub1.toCharArray();
				char c2[] = sub2.toCharArray();
				 
			 	Arrays.sort(c1);
				Arrays.sort(c2);
			 	int counter = 0;
				for (int k = 0; k < c1.length; k++) {
					for (int k2 = 0; k2 < c2.length; k2++) {
						//System.out.println("c2 length :: " + c2.length);
						if(c1[k] == c2[k2] && c1[k] != '-') {
							c1[k] = '-';
							c2[k2] = '-';
							String a = new String(c2);
							a = a.replace("-", "");
							c2 = a.toCharArray();
							//System.out.println(c2);
							counter ++ ;
						}
					}
				}
			 	System.out.println(c1.length-counter);
			}
		}
		s.close();
	}
}