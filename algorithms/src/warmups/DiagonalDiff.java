/**
 * 
 */
package warmups;

import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @LINK https://www.hackerrank.com/challenges/diagonal-difference
 *
 */
public class DiagonalDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		s.nextLine();
		int inc = 0, dec = t-1;
		int lr = 0, rl = 0;
		for (int i = 0; i < t; i++) {
			String[] str = s.nextLine().split(" ");
			lr += Integer.parseInt(str[inc]); rl += Integer.parseInt(str[dec]);
			System.out.println(lr-rl);
			inc++;
			dec--;
		}
		
		System.out.println(Math.abs(lr - rl));
		
		s.close();

	}

}
