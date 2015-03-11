/**
 * 
 */
package search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 *
 */
public class SherlockAndArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		List<int[]> list = new ArrayList<int[]>();
		for (int i = 0; i < testCases; i++) {
			int elemC = s.nextInt();
			int[] input = new int[elemC];
			s.nextLine();
			String line = s.nextLine();
			String[] inputAr = line.split(" ") ;
			for (int j = 0; j < inputAr.length; j++) {
				input[j] = Integer.parseInt(inputAr[j]);
			}
			list.add(input);
		}
		for (Iterator<int[]> iterator = list.iterator(); iterator.hasNext();) { 
			int[] arr = (int[]) iterator.next();
			int len = arr.length;
			int i=0, j = len - 1;
			int lsum = 0, rsum = 0;
			boolean isYES = false;
			int previ = -1, prevj = -1;
			if(len == 1) {
				System.out.println("YES");
			}
			else if(len == 2){
				if(arr[0] == arr[1]){
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else {
				while(i < j){
					//System.out.println(lsum + ", " + rsum + " ===  " + i + ", " + j);
					if( i != previ){ 
						lsum += arr[i]; 
						previ =i;
					}
					if( j != prevj) {
						rsum += arr[j];
						prevj = j;
					}
					if(lsum < rsum){ i++; }
					else if(lsum > rsum){ j--; }
					else if(lsum == rsum && j-i == 2){
						isYES = true;
						break;
					}
					else  {
						i++;
						j--;
					}
					 
				}
				System.out.println(isYES ? "YES" : "NO");
			}

		 }
		s.close();
	}

}
