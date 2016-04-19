/**
 * 
 */
package bitmanipulation;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author jakkanin
 *
 */
public class XorSubSequence {

	/**
	 * 
	 */
	public XorSubSequence() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int lines = s.nextInt();

		int[] arr = new int[lines];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		Map<Integer, Integer> map  = new TreeMap<Integer, Integer>();


		int val = 0;
		for(int i =0; i< arr.length; i++) {
			int temp = Integer.MIN_VALUE;

			if(map.containsKey(arr[i])) {
				int mV = map.get(arr[i]);
				mV++;
				map.put(arr[i], mV);
			}
			else {
				map.put(arr[i], 1);
			}


			for(int j=i+1; j< arr.length ; j++) {
				if(temp != Integer.MIN_VALUE)
				{
					val  = temp ^ arr[j];
				}
				else
				{
					val = arr[i] ^ arr[j];
				}

				if(map.containsKey(val)) {
					int mVal = map.get(val);
					mVal++;
					map.put(val, mVal);
				}
				else {
					map.put(val, 1);
				}

				temp = (temp != Integer.MIN_VALUE ? temp : arr[i]) ^ arr[j];
			}
		}

		findMinValuefromMAp(map);

		s.close();
	}

	private static void findMinValuefromMAp(Map<Integer, Integer> map) {
		int val = Integer.MIN_VALUE;
		int kV = Integer.MIN_VALUE;
		Iterator iter = map.keySet().iterator();

		while (iter.hasNext()) {
			int key = (int) iter.next();
			int value = map.get(key);
			if(val < value) {
				val = value;
				kV = key;
			}
		}

		System.out.println(kV + " " + val );
	}

}
