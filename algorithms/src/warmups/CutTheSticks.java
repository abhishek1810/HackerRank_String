/**
 * 
 */
package warmups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/cut-the-sticks
 *
 */
public class CutTheSticks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputCount = s.nextInt();
		Object[] input = new Object[inputCount];
		s.nextLine();
		String[] str = s.nextLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			input[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(input);
		System.out.println(input.length);
		while(input.length >= 1){
			int min = (int) input[0];
			int j = 0;
			List<Object> l = new ArrayList<Object>();
			for (int i = 0; i < input.length; i++) {
				int t = (int)input[i] - min;
				if(t!= 0) {
					input[i] = t ;
					l.add(t);
					j++;
				}
			}
			input=l.toArray();
			Arrays.sort(input);
			if(input.length != 0) { System.out.println(input.length); }
			if(j <= 1) break;
		}
		s.close();
	}

}
