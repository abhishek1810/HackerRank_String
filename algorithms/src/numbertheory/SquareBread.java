package numbertheory;

/**
 * @author jakkani naveen
 * @link https://www.hackerrank.com/challenges/restaurant
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SquareBread {

	/* Driver program to test above functions */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		s.nextLine();
		List<Integer> res = new ArrayList<Integer>();
		List<String[]> list = new ArrayList<String[]>();
		for (int i = 0; i < testCases; i++) {
			String[] is = s.nextLine().split(" ");
			list.add(is);
		}

		for (int i = 0; i < list.size(); i++) {
			String[] input = list.get(i);
			int l = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int min = l <b ? l : b;
			int max = l > b ? l : b;
			if(l == b) {
				System.out.println(1);
			}
			else {
				int gcd = findGCD(min, max);
				System.out.println((l*b)/ (gcd * gcd));
			}
		}
		s.close();
	}

	private static int findGCD(int min, int max) { // 12 16  | 16, 12 | 12,4 | 4,0
		
		if(max == 0 ) { return min; }
		
		return findGCD(max, min%max);
	}
 
	
		/*
				for (int j = 1; j <= min/2; j++) {
					if((l*b)%(j*j) == 0) {
						count = ((l*b)/(j*j));
						visited = true;
						if(diff % j == 0) { 
							res.add(count); 
						}
					}
				}
				count = l * b;
			*/
}