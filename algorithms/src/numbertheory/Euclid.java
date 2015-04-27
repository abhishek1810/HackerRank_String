/**
 * 
 */
package numbertheory;

/**
 * @author Naveen Jakkani
 *
 */
public class Euclid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 6;
		int b = 64;
		
		while(b != 0){
			int temp = b;
			b = a%b;
			a = temp;
			System.out.println(a + " <> " + b);
		}
		System.out.println(a);
		
	}

}
