/**
 * 
 */
package bitmanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jakkanin
 *
 */
public class SansaAndXOR {

	/**
	 * 
	 */
	public SansaAndXOR() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			s.nextLine();
			String ss = s.nextLine();
			list.add(ss);
		}
		
		for (Object element : list) {
			String string = (String) element;
			
			String arr[] = string.split(" ");
			
			if(arr.length % 2 == 0) { System.out.println("0"); } 
			
			
			else {
				int result = 0;
				for (int i = 0; i < arr.length; i++) {
					if(i%2 == 0) {
						result =  result ^ Integer.parseInt(arr[i]);
					}
				}
				System.out.println(result);
			}
			
		}
		s.close();

	}

}
