/**
 * 
 */
package numbertheory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/fibonacci-finding-easy
 *
 */
public class FindFibonacci {

	public static long R= 1000000007;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		List<long[]> list = new ArrayList<long[]>();
		s.nextLine();
		for (int i = 0; i < t; i++) {
			long[] l = new long[3];
			String[] ip = s.nextLine().split(" ");
			l[0] = Long.parseLong(ip[0]);
			l[1] = Long.parseLong(ip[1]);
			l[2] = Long.parseLong(ip[2]);
			list.add(l);
		}
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			long[] ls = (long[]) iterator.next();
			
			long[][] mat = new long[2][2];
			mat[0][0] = 1; mat[0][1] = 1;
			mat[1][0] = 1; mat[1][1] = 0;
			
			if(ls[2] == 1) { System.out.println(ls[1]); }
			else if(ls[1] == 0) { System.out.println(ls[0]); }
			else {
				long[][] rr = matPower(mat, ls[2]);
				long _f[][] = new long[2][1];
				_f[0][0] = ls[1];
				_f[1][0] = ls[0];
				System.out.println(((ls[1] * rr[1][0]) + (ls[0] * rr[1][1]))%R);
			}
		}
		s.close();
	}

	private static long[][] matPower(long[][] mat, long l ) {
		long[][] res = new long[2][2];
		
		/* Identity matrix 1 0 / 0 1*/
		res[0][0] = 1; res[0][1] = 0; // 2 1
		res[1][0] = 0; res[1][1] = 1; // 1 1
		
		long[][] x = mat;
		
		while(l > 0){
			if(l % 2 == 1){
				long p,q,r,s;
				p = ((res[0][0] * x[0][0]) + (res[0][1] * x[1][0]))%R;
				q = ((res[0][0]* x[0][1]) + (res[0][1] * x[1][1]))%R;
				r = ((res[1][0] * x[0][0]) + (res[1][1] * x[1][0]))%R;
				s = ((res[1][0] * x[0][1]) + (res[1][1] * x[1][1]))%R;
				
				res[0][0] = p;
				res[0][1] = q;
				res[1][0] = r  ;
				res[1][1] = s;
			}
			
			long p,q,r,s;
			p = ((x[0][0] * x[0][0]) + (x[0][1] * x[1][0]))%R;
			q = ((x[0][0] * x[0][1]) + (x[0][1] * x[1][1]))%R;
			r = ((x[1][0] * x[0][0]) + (x[1][1] * x[1][0]))%R;
			s = ((x[1][0] * x[0][1]) + (x[1][1] * x[1][1]))%R;
			
			x[0][0] = p;
			x[0][1] = q;
			x[1][0] = r;
			x[1][1] = s;
			l/=2;
		}
		return res;
	}

}
