/**
 * 
 */
package search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/bigger-is-greater
 *
 */
public class BiggerIsGreater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		String[] inputs = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			inputs[i] = s.next();
		}

		for (int i = 0; i < inputs.length; i++) {
			String input = inputs[i];

			if(input.length() == 1) {
				System.out.println("no answer");
			}
			else if (input.length() == 2) {
				int len = input.length();
				String sub = input.substring(0, 1);
				int replaceLen = input.length() - input.replace(sub, "").length();
				if(len == replaceLen) { System.out.println("no answer"); }
				//else { System.out.println("here"); System.out.println(input.substring(1, len) + input.substring(0, 1)); }
				else {
					String origin = input;
					printPermutations(input.toCharArray(), origin);
				}
			}
			else {
				String origin = input;
				printPermutations(input.toCharArray(), origin);
			}
			}
		}
 
	private static void printPermutations( char[] c, String origin ) {
		//System.out.println( Arrays.toString( c ) );
		int count = 0;
		 while ( ( c = nextPermutation( c ) ) != null ) {
			 count ++ ;
			 if(origin.equals(new String(c))) {
				 System.out.println("no answer");
			 }
			 else {
				 System.out.println(new String(c));
			 }
			break;
		}
		 
		 if(count == 0) { 
			 System.out.println("no answer");
		 }
		 
		 
	}

	// modifies c to next permutation or returns null if such permutation does not exist
	private static char[] nextPermutation( final char[] c ) {
		// 1. finds the largest k, that c[k] < c[k+1]
		int first = getFirst( c );
		if ( first == -1 ) return null; // no greater permutation
		// 2. find last index toSwap, that c[k] < c[toSwap]
		int toSwap = c.length - 1;
		while ( c[ first ]>=( c[ toSwap ] ))
			--toSwap;
		// 3. swap elements with indexes first and last
		swap( c, first++, toSwap );
		// 4. reverse sequence from k+1 to n (inclusive) 
		toSwap = c.length - 1;
		while ( first < toSwap )
			swap( c, first++, toSwap-- );
		return c;
	}

	// finds the largest k, that c[k] < c[k+1]
	// if no such k exists (there is not greater permutation), return -1
	private static int getFirst( final char[] c ) {
		for ( int i = c.length - 2; i >= 0; --i )
			if ( c[ i ]<( c[ i + 1 ] )   )
				return i;
		return -1;
	}

	// swaps two elements (with indexes i and j) in array 
	private static void swap( final char[] c, final int i, final int j ) {
		final char tmp = c[ i ];
		c[ i ] = c[ j ];
		c[ j ] = tmp;
	}
 
}
