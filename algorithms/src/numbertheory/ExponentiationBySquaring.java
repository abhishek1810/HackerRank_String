/**
 * 
 */
package numbertheory;

/**
 * @author Naveen Jakkani
 * 
 * This class deals with getting power of a number using modular exponentiation by squaring.
 *
 */
public class ExponentiationBySquaring {

	/**
	 * 
	 */
	public ExponentiationBySquaring() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 2;
		int res = 1;
		int power = 9;
		while(power > 0){
			if(power % 2 == 1) {
				res = res * n;
				power -= 1;
			}
			n = n*n;
			System.out.println(n);
			power /= 2;
		}
		System.out.println(res + " <> " + Math.pow(2, 9));
		
	}

}
