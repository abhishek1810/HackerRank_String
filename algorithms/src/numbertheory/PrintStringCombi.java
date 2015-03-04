package numbertheory;
/**
 * 
 * @author Unknown
 * 
 * This class will print all srting combinations of a given string.
 *
 */

class PrintStringCombi {

	static char s[] = "6112785".toCharArray();

	/* Function to swap values at two pointers */
	static void swap(int i, int j) {
		//System.out.println(i + ", " + j);
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}

	/*
	 * Function to print permutations of string This function takes three
	 * parameters: 1. String 2. Starting index of the string 3. Ending index of
	 * the string.
	 */
	static void permute(int i) {
		int j;
		if (i == s.length - 1)
			System.out.println(new String(s));
		else {
			for (j = i; j < s.length; j++) {
			//	System.out.println(">>> >> > > >>>" + i + "," + j);
				swap(i, j);
				permute(i + 1);
				swap(i, j); // backtrack
			}
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		permute(0);
	}
}