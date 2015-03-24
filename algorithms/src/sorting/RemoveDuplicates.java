/**
 * 
 */
package sorting;

/**
 * @author Naveen Jakkani
 *
 */
public class RemoveDuplicates {

	/**
	 * 
	 */
	public RemoveDuplicates() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,2,3,4,4,5,6,7,7};
		
		removeDuplicates(a);

	}

	private static void removeDuplicates(int[] a) {
		int j = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] != a[j]){
				j++;
				a[j] = a[i];
			}
		}
		for (int i = 0; i < j + 1; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
