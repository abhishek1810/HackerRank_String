/**
 * 
 */
package numbertheory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/taum-and-bday
 *
 */
public class BirthDayGifts {

	/**
	 * 
	 */
	public BirthDayGifts() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		List<BigInteger[]> list = new ArrayList<BigInteger[]>();
		s.nextLine();
		for (int i = 0; i < t; i++) {
			BigInteger input[] = new BigInteger[5];
			String[] gifts = s.nextLine().split(" ");
			input[0] = new BigInteger(gifts[0]);
			input[1] = new BigInteger(gifts[1]);
			
			String[] prices = s.nextLine().split(" ");
			input[2] = new BigInteger(prices[0]);
			input[3] = new BigInteger(prices[1]);
			input[4] = new BigInteger(prices[2]);
			list.add(input);
		}
		//System.out.println(list.size());
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			BigInteger[] is = (BigInteger[]) iterator.next();
			BigInteger minAmount = BigInteger.ONE;
			BigInteger min = is[0].multiply(is[2]).add(is[1].multiply(is[3]));
			
			BigInteger conv1 = is[0].multiply(is[4]).add((is[0].add(is[1]).multiply(is[3])));
			BigInteger conv2 = is[1].multiply(is[4]).add((is[0].add(is[1]).multiply(is[2])));
			
			if(min.compareTo(conv1) < 0 && min.compareTo(conv2) < 0){
				minAmount = min;
			}
			else if(conv1.compareTo(min) < 0 && conv1.compareTo(conv2) < 0){
				minAmount = conv1;
			}
			else {
				minAmount = conv2;
			}
			System.out.println(minAmount);
		}
		
		s.close();
	}
}
