package warmups;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/halloween-party
 *
 */

public class HaloweenParty {

	public HaloweenParty() {

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		BigInteger[] input = new BigInteger[t];
		for (int i = 0; i < t; i++) {
			input[i] = new BigInteger(s.next());
		}
		for (int i = 0; i < input.length; i++) {
			BigInteger b = input[i].divide(new BigInteger("2"));
			BigInteger c = input[i].subtract(b);
			System.out.println(b.multiply(c));
		}
		s.close();
	}

}
