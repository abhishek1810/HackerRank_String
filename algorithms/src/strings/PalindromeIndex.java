/**
 * 
 */
package strings;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author CipherCloud
 *
 */
public class PalindromeIndex {

	/**
	 * 
	 */
	public PalindromeIndex() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int tests = s.nextInt();
		List<String> list = new ArrayList<String>();
		s.nextLine();
		for (int i = 0; i < tests; i++) {
			list.add(s.nextLine());
		}
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			StringBuffer str = new StringBuffer("" + iterator.next());
			int i = 0;
			int j = str.length() - 1;
			int len = str.length();
			StringBuffer rev = new StringBuffer(str);
			if (str.toString().equals(rev.reverse().toString())) {
				System.out.println(-1);
			} else {
				for (int k = 0; k < len / 2; k++) {
					if (str.charAt(i) != str.charAt(j)) {
						str.deleteCharAt(i);
						String newTemp = str.toString();
						str = str.reverse();
						if (newTemp.equals(str.toString())) {
							System.out.println(i);
						} else {
							System.out.println(j);
						}
						break;
					}
					i += 1;
					j -= 1;
				}
			}
		}
	}

}
