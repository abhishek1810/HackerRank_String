/**
 * 
 */
package warmups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/chocolate-feast
 *
 */
public class ChocolateFeast {
	
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
			String[] input = s.nextLine().split(" ");
			l[0] = Long.parseLong(input[0]);
			l[1] = Long.parseLong(input[1]);
			l[2] = Long.parseLong(input[2]);
			list.add(l);
		}
		
		for (Iterator<long[]> iterator = list.iterator(); iterator.hasNext();) {
			long[] ls = (long[]) iterator.next();
			long count = ls[0]/ls[1];
			long rem = 0; 
			long total = count;
			
			while(count >= ls[2]){
				rem = count%ls[2];
				count = count/ls[2];
				total += count;
				count += rem;
			}
			System.out.println(total);
		}
		s.close();
	}

}
