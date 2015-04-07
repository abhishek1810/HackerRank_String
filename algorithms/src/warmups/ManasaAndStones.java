/**
 * 
 */
package warmups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/manasa-and-stones/
 *
 */
public class ManasaAndStones {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		List<long[]> list = new ArrayList<long[]>();
		s.nextLine();
		for (int i = 0; i < t; i++) {
			long[] input = new long[3];
			input[0] = Long.parseLong(s.nextLine());
			input[1] = Long.parseLong(s.nextLine());
			input[2] = Long.parseLong(s.nextLine());
			list.add(input);
		}

		for (Iterator<long[]> iterator = list.iterator(); iterator.hasNext();) {
			long[] ls = (long[]) iterator.next();
			if(ls[1] == ls[2]){
				System.out.println(ls[1]*(ls[0] - 1 ));
			}
			else {
				long a = ls[1] < ls[2] ? ls[1] : ls[2];
				long b = ls[1] > ls[2] ? ls[1] : ls[2];
				long lower = ls[0]/2;
				long higher = ls[0]/2;
				if(ls[0]%2 == 1){ higher += 1; }
				@SuppressWarnings("rawtypes")
				List l = new ArrayList();
				for (int i = 0; i < lower; i++) {
					l.add(((ls[0] - 1 -i)*a) + (i*b));
				}

				for (int i = 0; i < higher; i++) {
					l.add(((ls[0] - 1 -i)*b) + (i*a));
				}
				// System.out.println(l);
				Object[] aa = l.toArray();
				Arrays.sort(aa);
				for (int i = 0; i < aa.length; i++) {
					System.out.print(aa[i] + (i != aa.length - 1  ? " " : ""));
				}
			}

		}
		s.close();
	}

}
