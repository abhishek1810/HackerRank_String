/**
 * 
 */
package warmups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/angry-professor
 * 
 *
 */
public class AngryProfessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		List list = new ArrayList();
		s.nextLine();
		for (int i = 0; i < t; i++) {
			String[] NK = s.nextLine().split(" ");
			//System.out.println(NK[0] + "<><>" + NK[1]);
			String[] students = s.nextLine().split(" ");
			Object[] o = new Object[2];
			o[0] = NK;
			o[1] = students;
			//System.out.println(NK.length + " :: " + students.length);
			list.add(o);
		}
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			int counter = 0;
			Object[] object = (Object[]) iterator.next();
			
			String[] NK = (String[]) object[0];
			int N= Integer.parseInt(NK[0]);
			int K= Integer.parseInt(NK[1]);
			
			String[] st = (String[])object[1];
			for (int i = 0; i < st.length; i++) {
//				System.out.println(st[i] + " <> " + (st[i].indexOf("0")));
				if(st[i].indexOf("-") == 0  || st[i].indexOf("0") == 0) { counter ++ ; }
			}
			//System.out.println(K + " -- " + counter);
			System.out.println(counter < K ? "YES" : "NO");
			
		}
		
		s.close();
	}

}
