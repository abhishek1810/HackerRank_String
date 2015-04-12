package warmups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/song-of-pi/
 *
 */

public class SongsOfPi {

	public static void main(String[] args) {
		
		int a[]={3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6,2,6,4,3,3,8,3,3};
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		
		List<String> l = new ArrayList<String>();
		for (int i = 0; i < t; i++) {
			l.add(s.nextLine());
		}
		
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			int index  = 0;
			boolean isPi = true;
			String string = (String) iterator.next();
			String[] line = string.replaceAll("[,.;!\'?(){}\\[\\]<>%]", "").split(" ");
			for(String word: line){
				if(word.length() != a[index]){ isPi = false; break; } 
				if(index < a.length) {
					index++;
				}
				else {
					break;
				}
			}
			System.out.println(isPi ? "It's a pi song." : "It's not a pi song.");
		}
		
		s.close();
	}

}
