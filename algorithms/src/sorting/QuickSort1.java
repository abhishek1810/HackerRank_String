/**
 * 
 */
package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/quicksort1
 *
 */
public class QuickSort1 {

	/**
	 * 
	 */
	public QuickSort1() {
		// TODO Auto-generated constructor stub
	}

	static int arr[] ;//= new int[c];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		arr = new int[c];
		s.nextLine();
		String[] ip= s.nextLine().split(" ");
		for (int i = 0; i < ip.length; i++) {
			arr[i] = Integer.parseInt(ip[i]);
		}
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		int pivot = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] <= pivot){
				left.add(arr[i]);
			}
			else {
				right.add(arr[i]);
			}
		}
		Object[] l = left.toArray();
		Object[] r = right.toArray();
		
		int[] finalL = new int[arr.length];
		int counter = 0;
		for (int i = 0; i < l.length; i++) {
			finalL[counter] = (int) l[i];
			counter++;
		}
		finalL[counter] = pivot;
		counter++;
		//System.out.println(l.length + " " + counter);
		for (int i = 0; i < r.length; i++) {
			finalL[counter] = (int)r[i];
			counter ++;
		}
		printArray(finalL);
		s.close();
	}
	
	
	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
          System.out.println("");
     }

}
