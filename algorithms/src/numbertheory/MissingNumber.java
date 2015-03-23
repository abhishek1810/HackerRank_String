/**
 * 
 */
package numbertheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/missing-numbers
 *
 */
public class MissingNumber {

	/**
	 * 
	 */
	public MissingNumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int list[] = new int[100];
		for (int i = 0; i < list.length; i++) {
			list[i] = 0;
		}
		int first = s.nextInt();
		int[] m = new int[first];
		s.nextLine();
		String[] fArr = s.nextLine().split(" ");
		for (int i = 0; i < fArr.length; i++) {
			m[i] = Integer.parseInt(fArr[i]);
		}
		int sec = s.nextInt();
		int[] n = new int[sec];
		s.nextLine();
		String[] sArr = s.nextLine().split(" ");
		for (int i = 0; i < sArr.length; i++) {
			n[i] = Integer.parseInt(sArr[i]);
		}
		Arrays.sort(n);
		int min = n[0];
		int max = n[n.length - 1];
		
		for (int i = 0; i < n.length; i++) { list[n[i] - min] ++; }
		
		for (int i = 0; i < m.length; i++) { list[m[i] - min] --; }
		
		List<Integer> l = new ArrayList<Integer>();
		//System.out.println(min + ", " + max);
		for (int i = (min - min); i <= (max-min); i++) {
			if(list[i] != 0) {
				//System.out.print((i+min) + " ");
				l.add((i + min));
			}
		}
		
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + (i<l.size() - 1 ? " " : ""));
		}
		s.close();
	}

}
