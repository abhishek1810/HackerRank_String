/**
 * 
 */
package warmups;

import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/acm-icpc-team
 *
 */
public class ACMICPC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] ip = s.nextLine().split(" ");
		int people = Integer.parseInt(ip[0]);
		int topics = Integer.parseInt(ip[1]);

		//s.nextLine();
		int[][] data = new int[people][topics];
		for (int i = 0; i < people; i++) {
			char[] cT = s.nextLine().toCharArray();
			for (int j = 0; j < cT.length; j++) {
				data[i][j] = Integer.parseInt( "" + cT[j]);
			}
		}

		int teamCount = 0;
		int topicCount = 0;
		int maxTopics = 0;

		for (int i = 0; i < people - 1; i++) {

			for (int j = i+1; j < people; j++) {
				
				for (int t = 0; t < topics; t++) {
					if(((data[i][t] | data[j][t]) != 0)){ topicCount++; }
				}
				if(maxTopics < topicCount){
					maxTopics = topicCount;
					teamCount = 1;
				}
				else if(maxTopics == topicCount) { teamCount+=1; } 
				topicCount = 0;
			}
		}

		System.out.println(maxTopics);
		System.out.println(teamCount);

		s.close();
	}

}
