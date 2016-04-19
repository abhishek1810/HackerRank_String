/**
 * 
 */
package bitmanipulation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jakkanin
 *
 */
public class XORingNinja {

	private static final BigInteger MOD = new BigInteger("1000000007");

	/**
	 * 
	 */
	public XORingNinja() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 int t = s.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			s.nextLine();
			String ss = s.nextLine();
			list.add(ss);
		}
		
		for (Object element : list) {
			String[] string = element.toString().split(" ");
			BigInteger multiplier = new BigInteger("2").pow(string.length-1).mod(MOD);
			//BigInteger res =new BigInteger(string[0]);
			BigInteger res =BigInteger.ZERO;
			for (String element2 : string) {
				res  = res.or(new BigInteger(element2));
			}
			res = (res.mod(MOD).multiply(multiplier).mod(MOD)).mod(MOD);
			System.out.println(res);
		}
		 
	 	
		s.close();
	}

	private static BigInteger caliculateMultiplier(int power) {
		BigInteger val = BigInteger.ONE;
		BigInteger two = new BigInteger("2");
		if(power == 1) {
			return two;
		}
		while(power > 0) {
			System.out.println(power + " :: val :: " + val);
			if(power %2 == 1) {
				val = val.multiply(two);
				power = power - 1;
			}
			two = two.multiply(two);
			power = power/2;
		}
		
		return val;
	}

	private static BigInteger multiply(int power) {
		
		if(power == 1) {
			return new BigInteger("2");
		}
		
		BigInteger val = multiply(power/2);
		BigInteger two = new BigInteger("2");
		 if(power %2 == 1) {
			 return val .multiply(val).multiply(two);
		}
		 else {
			 return val.multiply(val);
		 }
	}
	
}
