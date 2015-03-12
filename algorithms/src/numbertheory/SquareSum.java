package numbertheory;
import java.math.BigInteger;
import java.util.Scanner;
/**
 * 
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/little-chammys-huge-donation
 *
 */

public class SquareSum {

	private static final BigInteger TWO = new BigInteger("2");

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();

		BigInteger[] input = new BigInteger[testcases];
		for (int i = 0; i < testcases; i++) {
			input[i] = new BigInteger( "" + s.next());
		}
		for (int i = 0; i < input.length; i++) {
			if(input[i].equals(BigInteger.ONE)) {
				System.out.println(1);
			}
			else {
				BigInteger kidCount = BigInteger.ONE;
				BigInteger arr[] = prepareRange(input[i]);
				for(int k = 0; k< arr.length; k++) {
					BigInteger two = new BigInteger("2");
					BigInteger temp = two.multiply(arr[k]).add(BigInteger.ONE);
					BigInteger temp1 = arr[k].add(BigInteger.ONE);
					BigInteger f = arr[k].multiply(temp1).multiply(temp);
					f = f.divide(new BigInteger("6"));
					//System.out.println(arr[k] + " > " + f + " -- " + input[i]);
					if(f.equals(input[i])){
						kidCount = arr[k];
						break;
					}
					else if( f.compareTo(input[i]) < 0){
						kidCount = arr[k];
					}
				}
				System.out.println(kidCount);
			}
		}
		s.close();
	}

	private static BigInteger[] prepareRange(BigInteger number) {
		BigInteger[] arr = new BigInteger[2];
		BigInteger i = BigInteger.ONE;
		BigInteger j = sqrt(number);
		BigInteger k = i.add(j).divide(TWO);
		BigInteger counter = BigInteger.ONE;
		while(i.compareTo(j) < 0 || i.equals(j)) {
			BigInteger temp = TWO.multiply(k).add(BigInteger.ONE);
			BigInteger temp1 = k.add(BigInteger.ONE);
			BigInteger f = k.multiply(temp1).multiply(temp);
			f = f.divide(new BigInteger("6"));
			if(number.compareTo(f) < 0){ j = k; }
			else if(number.compareTo(f) > 0  || number.equals(f)){ i = k; }
			k = i.add(j).divide(TWO);
			// System.out.println("After :: " + k + " : " + i + " , " + j + " " + f);
			counter = counter.add(BigInteger.ONE);
			if(f.equals(number) || i.equals(k)) break;
		}
		// System.out.println("i, j = " + i + " , " + j);
		arr[0] = i;arr[1] = j;
		return arr;
	}

	public static BigInteger sqrt(BigInteger n) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
		while(b.compareTo(a) >= 0) {
			BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
			if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
			else a = mid.add(BigInteger.ONE);
		}
		return a.subtract(BigInteger.ONE);
	}


}