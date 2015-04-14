package numbertheory;

import java.math.BigInteger;

public class SM {

	private static final BigInteger _9 = new BigInteger("9");

	public static void main(String[] args) {
		BigInteger b = null;
		BigInteger[] bb = new BigInteger[1500];
		for(int i = 1; i<=1500; i++){
			b = new BigInteger(Integer.toBinaryString(i));
			b = b.multiply(_9);
			bb[i] = b;
		}
		for (int k = 1; k <= 500; k++) {
			BigInteger x = new BigInteger("" + k);
			for (int i = 1; i < bb.length; i++) {
				if(bb[i].mod(x).equals(BigInteger.ZERO)){
					System.out.println(x + " -- >> " + i + ">>" + bb[i]);break;
				}
			}
		}
	}

}
