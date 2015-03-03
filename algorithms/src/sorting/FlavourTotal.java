package sorting;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlavourTotal {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		List<int[]> total = new ArrayList<int[]>();

		for (int tCount = 1; tCount <= t; tCount++) {
			
			int M = s.nextInt();
			int N = s.nextInt();
			s.nextLine();
			String input = s.nextLine();
			int arr[] = new int[N + 1];

			String in[] = input.split(" ");
			arr[0] = M;
			for (int i = 0; i < N; i++) {
				if(in[i] != " "){
					arr[i + 1] = Integer.parseInt(in[i]);
				}
			}
			total.add(arr);
		}
		
		for (Iterator<int[]> iterator = total.iterator(); iterator.hasNext();) {
			int[] a = (int[]) iterator.next();
			int len = a.length - 1;
			boolean found = false;
			for (int i = 1; i <= len; i++) {
				for (int j = i + 1; j <= len; j++) {
					if(a[i] + a[j] == a[0]){
						System.out.println(i + " " + j);
						found = true;
						break;
					}
				}
				if(found) { break; }
			}
			
		}
		
		s.close();

	}
}