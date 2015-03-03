package strings;
import java.util.Scanner;


public class GemStone {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String i[] = new String[t];
		String input = "";
		for (int j = 0; j < t; j++) {
			i[j] = s.next();
			input += i[j] + "/";
		}
		int gc = 0;
		char[] l = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int inner = 0; inner < l.length; inner++) {
			String lt = new String("" + l[inner]);
			int c= 0;
			for (int j = 0; j < i.length; j++) {
				//System.out.println(i[j] + " :: " + lt);
				if(i[j].indexOf(lt) == -1){ break;}
				else { 
					c++;
				}
			}
			if(c == i.length) {
				gc++;
			}
		}
		System.out.println(gc);
	}
}