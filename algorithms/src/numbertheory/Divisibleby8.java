package numbertheory;

/**
 * @author jakkani naveen
 * @link https://www.hackerrank.com/challenges/manasa-loves-maths
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Divisibleby8 {

	/* Driver program to test above functions */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		List hash = prepare8Hash();
		BigInteger[] input = new BigInteger[testCases];
		for (int i = 0; i < testCases; i++) {
			input[i] = new BigInteger("" + s.next());
		}
		for (int i = 0; i < input.length; i++) {
			List<String> list = new ArrayList<String>();
			boolean found = false;
			if (new String("" + input[i]).length() > 3) {
				for (Iterator iterator = hash.iterator(); iterator.hasNext();) {
					String number = "" + input[i];
					int counter = 0;
					String string = "" + iterator.next();
					char[] h = string.toCharArray();
					if (number.indexOf(h[0]) != -1) { number = number.replaceFirst("" + h[0], "-"); counter++; }
					if (number.indexOf(h[1]) != -1) { number = number.replaceFirst("" + h[1], "-"); counter++; }
					if (number.indexOf(h[2]) != -1) { number = number.replaceFirst("" + h[2], "-"); counter++; }
					if(counter == 3) { System.out.println("YES"); found = true; break;  }
				}
				if( !found) System.out.println("NO");
			} else {
				char[] c = new String("" + input[i]).toCharArray();
				permute(0, c, list);
				System.out.println(isDivisible(list));
			}
		}
		s.close();
	}

	private static List prepare8Hash() {
		List list = new ArrayList();
		for (int i = 100; i < 1000; i++) {
			if (i % 8 == 0) {
				list.add(i);
			}
		}
		return list;
	}

	private static String isDivisible(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			int r = Integer.parseInt(list.get(i)) % 8;
			if (r == 0) {
				return "YES";
			}
		}
		return "NO";
	}

	private static void swap(int i, int j, char[] c) {
		char temp;
		temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}

	private static void permute(int i, char[] c, List<String> list) {
		if (i + 1 == c.length) {
			list.add(new String(c));
		} else {
			for (int j = i; j < c.length; j++) {
				swap(i, j, c);
				permute(i + 1, c, list);
				swap(i, j, c);
			}
		}
	}

}