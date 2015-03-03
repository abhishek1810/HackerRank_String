package combinatorics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ConnectingTown {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();

		List<int[]> inputList = new ArrayList<int[]>();

		for (int i = 0; i < testCases; i++) {
			int towns = s.nextInt();
			s.nextLine();
			String in = s.nextLine();
			String[] input = in .split(" ");
			int[] arr = new int[input.length + 1];
			arr[0] = towns;
			for (int j = 0; j < input.length; j++) {
				arr[j+1] = Integer.parseInt(input[j]);
			}
			inputList.add(arr);
		}

		for (Iterator<int[]> iterator = inputList.iterator(); iterator.hasNext();) {
			int[] is = (int[]) iterator.next();
			BigInteger d = new BigInteger("1");
			for(int dd =1; dd< is.length; dd++){
				d = d.multiply(new BigInteger("" + is[dd]));
			}
			d = d.mod(new BigInteger("1234567"));
			System.out.println(d);
		}

	}


}
