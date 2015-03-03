package sorting;

public class InsertionSort {
	public static void main(String args[]) {
		int[] a = { 1, 4, 3, 5, 6, 2 };
		int b[] = insertionSort(a);
	}

	public static int[] insertionSort(int[] data) {
		int len = data.length;
		int key = 0;
		int i = 0;
		for (int j = 1; j < len; j++) {
			key = data[j];
			i = j - 1;
			while (i >= 0 && data[i] > key) {
				data[i + 1] = data[i];
				i = i - 1;
				data[i + 1] = key;
			}
			for (int j2 = 0; j2 < data.length; j2++) {
				System.out.print(" " + data[j2]);
			}
			System.out.println("");
		}

		return data;
	}
}