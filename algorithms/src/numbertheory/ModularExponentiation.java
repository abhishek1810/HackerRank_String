package numbertheory;

import java.math.BigInteger;
import java.util.Scanner;

public class ModularExponentiation {

	public ModularExponentiation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			//int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			b = b-1;
			int x = 1; int y = 10; // 2 5 3
			while (b > 0){
				if(b % 2 == 1){
					x =(x*y)%c;
				}
				 y = (y*y)%c;
				b/= 2;
				System.out.println(b + ", " + x + ", " + y);
			}
			
			System.out.println(x + " <> " + x%c);
			int aa = x%c;
			int bb= (10/9)%c;
			System.out.println("bb >> " + bb);
			x = x%c;
			System.out.println((x*(10/9))%c);
			
			System.out.println(BigInteger.valueOf(9).modInverse(BigInteger.valueOf(18)));
		
	}
	/**/

}
