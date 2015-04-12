/**
 * 
 */
package warmups;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/identify-smith-numbers
 *
 */
public class SmithNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int a = 2147483647;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sq = (int) Math.sqrt(Double.parseDouble("" + n));
		Object[] p = findPrimeNo(sq);
		String temp = "" + n;
		int op = findSum(temp);
		int res = 0;
		for (int i = 0; i < p.length; i++) {
			if(n%(int)p[i] == 0 ){
				n  = n/(int)p[i];
				res += findSum("" + p[i]);
				//System.out.println(i + " : " + n + " >> " + p[i]);
				i  = 0 ;
			}
			//if((int)p[i] > n){ break; }
		}
		//System.out.println(n + " -------- >> " + res + " >>>>>>>>>>>>>>> " + op);
		res = res + (int) findSum(("" + (n > 1 ? n : 0)));
		if(res-op == 0){ System.out.println("1"); }
		else{ System.out.println(0);}
		s.close();
	}

	private static int findSum(String o) {
		
		//System.out.println("Here in sum " + o);
		int t = 0;
		for (int i = 0; i <= o.length() - 1  ; i++) {
			t = t +  Integer.parseInt(o.substring(i, i + 1));
			if((i + 1) == o.length()) {  break; }
		}
		return t;
	}

	private static Object[] findPrimeNo(int sq) {
		List<Integer> l = new ArrayList<Integer>();
		int sqq = (int) Math.sqrt(Integer.MAX_VALUE);
		l.add(2); l.add(3); l.add(5);
		l.add(7);
		for (int i = 8; i <= sqq; i++) {
			if(i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0){
				l.add(i);
			}
		}
		return l.toArray();
	}

}
