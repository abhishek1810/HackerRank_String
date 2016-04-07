package DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author JakkaniN
 * @link https://www.hackerrank.com/challenges/maxsubarray
 *
 */

public class MaxSubArray {

	public MaxSubArray() {
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		s.nextLine();

		List<String> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			int size = s.nextInt();
			s.nextLine();
			String input = s.nextLine();
			list.add(input);
		}

		for (Object element : list) {

			String[] string = ((String) element).split(" ");
			int input[] = new int[string.length];

			for (int i = 0; i < string.length; i++) {
				input[i] = Integer.parseInt(string[i]);
			}
			int max = input[0], sum = input[0], total = input[0];

			for (int i = 1; i < input.length; i++) {
				int ele = input[i];

				if (ele >= 0 && total < 0) {
					total = ele;
				} else if (total < ele && total < 0) {
					total = ele;
				} else if ((total + ele) > total) {
					total = total + ele;
				}

				if (ele < (max + ele)) {
					max = max + ele;
				} else {
					max = ele;
				}

				if (max > sum) {
					sum = max;
				}
			}

			System.out.println(sum + " " + total);

		}
		s.close();
	}

}