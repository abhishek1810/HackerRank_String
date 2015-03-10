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
public class Anagram {

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
			 	/*for (int k = 0; k < c2.length; k++) {
			 		sub1 = sub1.replaceFirst("" + c2[k], "");
				}
			 	System.out.println(sub1.length());*/
				
				char[] l = "abcdefghijklmnopqrstuvwxyz".toCharArray();
				int count = 0;
				for (int k = 0; k < l.length; k++) {
					
					int l1 = 0 ;
					if(sub1.indexOf(l[k]) != -1)
						l1 = sub1.length() - sub1.replace("" + l[k], "").length();
					int l2 = 0;
					if(sub2.indexOf(l[k]) != -1)
						l2 = sub2.length() - sub2.replace("" + l[k], "").length();
					if(l1 >= l2) {
						count += (l1 - l2);
					}
				}
				System.out.println(count);
			}
		}
		s.close();
	}
}