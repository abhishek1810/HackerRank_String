package warmups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/sherlock-and-squares
 *
 */

class PerfectSquares{
	public static void main(String[] args){
	 
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		List<Double[]> list = new ArrayList<Double[]>();
		s.nextLine();
		for (int i = 0; i < t; i++) {
			Double[] d = new Double[2];
			String[] input = s.nextLine().split(" ");
			d[0] = Double.parseDouble(input[0]);
			d[1] = Double.parseDouble(input[1]);
			list.add(d);
		}
		for (Iterator<Double[]> iterator = list.iterator(); iterator.hasNext();) {
			Double[] d = (Double[]) iterator.next();
			Double r = (Math.floor(Math.sqrt(d[1])) - Math.ceil(Math.sqrt(d[0])) + 1);
			System.out.println(r.intValue());
		}
		s.close();
	}
}
