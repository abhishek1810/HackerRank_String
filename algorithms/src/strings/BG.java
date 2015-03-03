package strings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BG {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String i[] = new String[t];
		for (int j = 0; j < t; j++) {
			i[j] = s.next();
		}

		for (int j = 0; j < i.length; j++) {
			if(i[j].equals(rev(i[j]))){ System.out.println("no answer"); }
			else {
				List<String> combinations =getCombinations(i[j]);
				//Collections.sort(combinations);
				System.out.println(combinations);
			}

		}
	}

	private static List<String> getCombinations(String str) {
		List<String> list = new ArrayList<String>();
		System.out.println(crunchifyPermutation(str));
		return list;
	}

	private static String rev(String s){
		String r = "";
		char[] rc = s.toCharArray();
		for(int i=rc.length-1; i >= 0; i--){
			r+= rc[i];
		}
		return r;
	}

	public static Set<String> crunchifyPermutation(String str) {
		Set<String> crunchifyResult = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			crunchifyResult.add("");
			return crunchifyResult;
		}

		char firstChar = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = crunchifyPermutation(rem);
		System.out.println("Words" + words);
		for (String newString : words) {
			for (int i = 0; i <= newString.length(); i++) {
				crunchifyResult.add(crunchifyCharAdd(newString, firstChar, i));
			}
		}
		return crunchifyResult;
	}

	public static String crunchifyCharAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}
}