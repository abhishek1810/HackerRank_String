package sorting;
import java.util.Scanner;


public class InsertionSort2 {
	public static void main(String args[]) {
		//int[] a = { 1, 4, 3, 5, 6, 2 };
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		String input = s.nextLine();
		int arr[] = new int[t];

		String in[] = input.split(" ");

		for (int i = 0; i < in.length; i++) {
			if(in[i] != " "){
				arr[i] = Integer.parseInt(in[i]);
			}
		}
		int b[] = insertionSort(arr);
	}

	public static int[] insertionSort(int[] data) {
		int len = data.length;
		int key = 0;
		int i = 0;

		for (int j = 1; j < len; j++) {
			key = data[j];
			i = j-1;
			while(i>=0 && data[i] > key){
				data[i +1] = data[i];
				i = i-1;
				data[i + 1] = key;
			}
			for (int j2 = 0; j2 < data.length; j2++) {
				System.out.print(data[j2]+ (j2 != data.length ? " " : ""));
			}
			System.out.println("");
		}

		return data;
	}
}