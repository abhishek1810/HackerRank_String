/**
 * 
 */
package warmups;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/find-digits
 *
 */
public class FindDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		BigInteger[] n = new BigInteger[9];
		for (int i = 0; i < n.length; i++) {
			n[i] = BigInteger.ONE.add(new BigInteger("" + i));
			//System.out.println(n[i]);
		}
		BigInteger[] input = new BigInteger[t];
		for (int i = 0; i < t; i++) {
			input[i] = new BigInteger(s.next());
		}
		for (int i = 0; i < input.length; i++) {
			int counter = 0;
			BigInteger b = input[i];
			//char[] c = b.toString().toCharArray();
			for (int j = 0; j < n.length; j++) {
				if(b.toString().indexOf("" + n[j]) != -1){
					int len = b.toString().length() - b.toString().replace("" + n[j] , "").length();
					//System.out.println(n[j] + " <> " + len);
					if(b.mod(n[j]).equals(BigInteger.ZERO)){
						counter+= len;
					}
				}
			}
			System.out.println(counter);
		}
		s.close();
	}

}
