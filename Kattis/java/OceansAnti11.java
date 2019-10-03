import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class OceansAnti11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		HashMap<Long, Long> savedVals = new HashMap();
		for (long i = 0; i < t; i++) {
			long n = in.nextInt();
			System.out.println(fib(n, savedVals));
		}
	}
	
	static long fib(long n, HashMap<Long, Long> savedVals) {
		if (n==1) return 2;
		if (n==2) return 3;
		
		long val1;
		long val2;
		
		if (savedVals.containsKey(n-1)) val1 = savedVals.get(n-1);
		else {
			val1 = fib(n-1, savedVals) % 1000000007;
			savedVals.put(n-1, val1);
		}
		if (savedVals.containsKey(n-2)) val2 = savedVals.get(n-2);
		else {
			val2 = fib(n-2, savedVals) % 1000000007;
			savedVals.put(n-2, val2);
		}
		
		return (val1+val2) % 1000000007;
	}
	
	static int substringCountBF(int n) {
		int count = 0;
		LinkedList<String> strings = getStrings(n);
		ListIterator<String> iter = strings.listIterator();
		while(iter.hasNext()) {
			String s = iter.next();
			if (!s.contains("11")) {
				count++;
			}
		}
		return count;
	}
	
	static LinkedList<String> getStrings(int n){
		LinkedList<String> strings = new LinkedList();
		strings.add("0");
		strings.add("1");
		while (strings.element().length() < n) {
			String base = strings.poll();
			strings.add(base + "0");
			strings.add(base + "1");
		}
		return strings;
	}
}
