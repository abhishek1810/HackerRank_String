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
 * @link https://www.hackerrank.com/challenges/service-lane
 *
 */
public class ServiceLane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			String[] NT = s.nextLine().split(" ");
			int N = Integer.parseInt(NT[0]);
			int T = Integer.parseInt(NT[1]);
			
			int[] lanes = new int[N];
			
			String[] segments = s.nextLine().split(" ");
			for (int i = 0; i < segments.length; i++) {
				lanes[i] = Integer.parseInt(segments[i]);
			}
			
		//	s.nextLine();
			List<int[]> list = new ArrayList<int[]>();
			for (int i = 0; i < T; i++) {
				int[] in = new int[2];
				String[] ip = s.nextLine().split(" ");
				in[0] = Integer.parseInt(ip[0]);
				in[1] = Integer.parseInt(ip[1]);
				list.add(in);
			}
			
			for (Iterator<int[]> iterator = list.iterator(); iterator.hasNext();) {
				int[] is = (int[]) iterator.next();
				int start = is[0];
				int end = is[1];
				int cond = end - start + 1;
				int[] subArr = new int[cond];
				int j = 0;
				for (int i = start; i <= end; i++) {
					subArr[j] = lanes[i];
					j++;
				}
				Arrays.sort(subArr);
				System.out.println(subArr[0]);
			}
			s.close();
	}

}
