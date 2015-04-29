/**
 * 
 */
package numbertheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 *
 */
public class ReverseGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		List<int[]> list = new ArrayList<int[]>();
		s.nextLine();
		for (int i = 0; i < t; i++) {
			String[] ip = s.nextLine().split(" ");
			int[] in = new int[2];
			in[0] = Integer.parseInt(ip[0]);
			in[1] = Integer.parseInt(ip[1]);
			list.add(in);
		}
		for (Iterator<int[]> iterator = list.iterator(); iterator.hasNext();) {
			int[] is = (int[]) iterator.next();
			int n  =is[0];
			int p = is[1];
			Integer[] arr = new Integer[n];
			int j = 0;
			for (int i = 0; i < arr.length; i++) {
				if(i%2  == 0){
					arr[i] = n-(j+1);
					j++;
				}
				else{
					arr[i] = j - 1;
				}
			}
			 System.out.println(Arrays.asList(arr).indexOf(p));
		}
		s.close();
	}
}
