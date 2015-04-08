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
 * @link https://www.hackerrank.com/challenges/sherlock-and-the-beast
 *
 */
public class SherlockandBeast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		List<String> list = new ArrayList<String>();
		s.nextLine();
		for (int i = 0; i < t; i++) {
			list.add(s.nextLine());
		}
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String n = (String) iterator.next();
			String x = "555", y = "33333";
			int xlen = 3; int ylen = 5;
			if(n.equals(xlen)){
				System.out.println(x);
			}
			else if(n.equals(ylen)){
				System.out.println(y);
			}
			else if(Integer.parseInt(n) < 3){
				System.out.println("-1");
			}
			else if(Integer.parseInt(n)  ==  4 || Integer.parseInt(n) == 7){
				System.out.println("-1");
			}
			else {
				StringBuffer sb = new StringBuffer();
				long th = Long.parseLong(n)/3;
				long thR = Long.parseLong(n)%3;
				long fv = thR;
				
				if(thR%5 != 0){
					while(fv%5 != 0){
						th = th - 1;
						fv = fv + 3;
					}
					fv = fv/5;
				}
				
				// System.out.println("three : " + th + "   :: five >>" + fv);
				
				for (int i = 0; i < th; i++) {
					sb= sb.append(x);
				}
				for (int i = 0; i < fv; i++) {
					sb= sb.append(y);
				}
				System.out.println(sb.toString());
			}
			
		}
		s.close();
	}

}
