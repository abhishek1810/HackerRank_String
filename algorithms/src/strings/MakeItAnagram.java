/**
 * 
 */
package strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/make-it-anagram
 *
 */
public class MakeItAnagram {

	/**
	 * 
	 */
	public MakeItAnagram() { }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String one = s.next();
		String two = s.next();
		char[] oneC = one.toCharArray();
		Arrays.sort(oneC);
		
		char[] twoC = two.toCharArray();
		Arrays.sort(twoC);
		
		one = new String(oneC);
		two = new String(twoC);
		char[] l = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		int counter = 0;
		System.out.println(one + " " + two);
		for (int i = 0; i < l.length; i++) {
			//System.out.println(l[i]);
			if(one.indexOf(l[i]) != -1 && two.indexOf(l[i]) != -1){
				while(one.indexOf(l[i]) != -1 && two.indexOf(l[i]) != -1) {
					one = one.replaceFirst("" + l[i], "-");
					two = two.replaceFirst("" + l[i], "-");
				}
			}
				counter = one.replace("-", "").length() + two.replace("-", "").length();
		}
		System.out.println(counter);
	}

}
