/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/the-love-letter-mystery/
 *
 */
public class LoveLetterMystery {

	  public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int testCount = s.nextInt();
			String arr[] = new String[testCount+1];
			for (int i = 0; i < testCount + 1; i++) {
				arr[i] = s.nextLine();
			}
			inputStrings(arr);
		}

	  private static void inputStrings(String[] arr) {
		  for (int i = 1; i < arr.length; i++) {
			  int counter = 0;
			  String r = reverse(arr[i]);
			  if(r.equalsIgnoreCase(arr[i])) {  System.out.println(counter);  }
			  else {
				  char[] c = arr[i].toCharArray();
				  char[] rc = r.toCharArray();
				  int k = c.length - 1;
				  int j = 0;
				  while(j < k){
					  counter+=Math.abs(c[k] - c[j]);
					  j++; k--;
					  if(j == k) break;
				  }
				  System.out.println(counter);
			  }
		  }
	  }
		private static String reverse(String str){
			String reverse = "";
			 for ( int i = str.length() - 1 ; i >= 0 ; i-- )
		         reverse = reverse + str.charAt(i);
			return reverse;
		}
}
