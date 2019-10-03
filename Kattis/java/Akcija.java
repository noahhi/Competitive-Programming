import java.util.Arrays;
import java.util.Scanner;

public class Akcija {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] prices = new int[n];
		for(int i = 0; i < n; i++) {
			int price = in.nextInt();
			prices[i] = price;
		}
		Arrays.parallelSort(prices);
		int count = 0;
		for(int j = n-1; j >= 2; j-=3) {
			count += prices[j];
			count += prices[j-1];
		}
		if(prices.length % 3 == 0) System.out.println(count);
		if(prices.length % 3 == 1) System.out.println(count + prices[0]);
		if(prices.length % 3 == 2) System.out.println(count + prices[0] + prices[1]);
	}
}
