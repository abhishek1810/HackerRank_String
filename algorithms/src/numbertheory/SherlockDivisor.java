/**
 * 
 */
package numbertheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Naveen Jakkani
 * @link https://www.hackerrank.com/challenges/sherlock-and-divisors
 *
 */
public class SherlockDivisor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < t; i++) {
			list.add(s.nextLong());
		}

		for (Iterator<Long> iterator = list.iterator(); iterator.hasNext();) {
			Map<Long, Integer> map = new HashMap<Long, Integer>();
			Long n = (Long) iterator.next();
			if(n%2 ==0) { 
				while (n % 2 == 0) {
					n = n / 2;
					setHash(map, new Long("2"));
				}
				for (long x = 3; x <= Math.sqrt(n); x = x+2) {
					while(n%x == 0){
						setHash(map, Long.parseLong("" + x));
						n = n/x;
					}
				}
				if(n > 2) { 
					setHash(map, Long.parseLong("" + n));
				}
				int twos = map.get(Long.parseLong("2"));
				Set keys = map.keySet();
				List<Long> kList = new ArrayList<Long>(keys);
				long res = twos;
				for (int j = 0; j < kList.size(); j++) {
					if(kList.get(j) != 2) {
						res = res*  (map.get(kList.get(j)) + 1);
					}
				}
				System.out.println(res);
			}else{
				System.out.println(0);
			}
		}
		s.close(); 
	}

	private static void setHash(Map<Long, Integer> map, Long l) {
		if(!map.containsKey(l)){
			map.put(l, 1);
		}
		else{
			map.put(l, (map.get(l) + 1));
		}
	}
}