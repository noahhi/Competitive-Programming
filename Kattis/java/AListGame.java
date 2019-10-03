import java.util.ArrayList;
import java.util.Scanner;

public class AListGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		ArrayList<Long> primeFactors = new ArrayList();
		while (n % 2 == 0) {
			primeFactors.add(2L);
			n = n/2;
		}
		for(long i = 3; i <= Math.sqrt(n); i+=2) {
			while (n % i == 0) {
				primeFactors.add(i);
				n = n/i;
			}
		}
		
		if (n > 2) primeFactors.add(n);
		
		System.out.println(primeFactors.size());
	}
}
