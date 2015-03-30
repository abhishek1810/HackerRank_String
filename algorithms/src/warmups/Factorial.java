package warmups;
import java.math.BigInteger;


public class Factorial {

	public static void main(String args[]){
		System.out.println(fact(new BigInteger("5"), new BigInteger("0")));
	}
	
	public static BigInteger fact(BigInteger n, BigInteger nn){
		if ( n.compareTo(nn)<= 0){
			return new BigInteger("1");
		}
		BigInteger b = fact(n.subtract(new BigInteger("1")), nn);
		return  b.multiply(n);
	}
	
}
