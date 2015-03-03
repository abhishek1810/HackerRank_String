package search;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		input = input.replace(" ", "");
		double len = input.length();
		double sqrt = Math.sqrt(len);

		int cols = (int) Math.round(Math.ceil(sqrt));
		int rows = (int) Math.round(Math.floor(sqrt));

		StringBuilder sb = new StringBuilder();
		int start = 0; int end = 0;
		while(start < cols){
			end = 0;
			while(end <= rows && ((start + end*cols + 1) <= len)) {
				sb.append(input.substring(start + end*cols, start + end*cols + 1));
				end++;
			}
			sb.append(" ");
			start++;
		}
		System.out.println(sb.toString());
		s.close();
	}
}