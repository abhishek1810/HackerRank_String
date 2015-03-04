package numbertheory;

public class SquareRoot {
	public static void main(String args[]){
		System.out.println(isPerfectSquare(12));
	}
	public final static boolean isPerfectSquare(long n)
	{
	  if (n < 0)
	    return false;
	
	  long tst = (long)(Math.sqrt(n) + 0.5);
	  return tst*tst == n;
	}
}

