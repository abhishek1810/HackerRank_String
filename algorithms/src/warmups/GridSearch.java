/**
 * 
 */
package warmups;

import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * {@link https://www.hackerrank.com/challenges/the-grid-search}
 *
 */
public class GridSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		StringBuffer sb = new StringBuffer();

		int t = s.nextInt();
		s.nextLine();
		startagain:
			for (int i = 0; i < t; i++) {
				String[] size = s.nextLine().split(" ");
				String[] arr = new String[Integer.parseInt(size[0])];
				for (int j = 0; j < Integer.parseInt(size[0]); j++) {
					arr[j] = s.nextLine();
				}
				String patternSize[] = s.nextLine().split(" ");
				String pattern[] = new String[Integer.parseInt(patternSize[0])];
				for (int j = 0; j < Integer.parseInt(patternSize[0]); j++) {
					pattern[j] = s.nextLine();
				}
				int temp = 0;
				nextLine : 
					for (int j = 0; j < arr.length; j++) {
						if(arr[j].indexOf(pattern[0]) != -1){
							temp = j;
							int start = arr[j].indexOf(pattern[0]);
							//System.out.println("start : > " + start);
							for (int k = 1; k < pattern.length; k++) {
								j++;
								if(arr[j].indexOf(pattern[k]) == start){
									//System.out.println(pattern.length + " << k >> " + k);
									if(k+1 == pattern.length) { sb.append("YES\n"); continue startagain; }
								}
								else{
									j = temp+1;
									continue nextLine;
								}
							}
						}
						if(j == arr.length -1) {
							//System.out.println(j + " << finished");
							sb.append("NO\n");
							continue startagain;
						}
					}

			}
		System.out.println(sb.toString());



		s.close();
	}

}
