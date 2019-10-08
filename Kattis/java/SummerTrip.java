import java.util.HashSet;
import java.util.Scanner;

public class SummerTrip {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.next();
		long count = 0;
		for(int i = 0; i < line.length()-1;i++) {
			char c1 = line.charAt(i);
			HashSet<Character> seen = new HashSet();
			for(int j = i+1; j < line.length(); j++) {
				char c2 = line.charAt(j);
				if (c2 == c1) break;
				if (seen.contains(c2)) continue;
				count++;
				seen.add(c2);
			}
		}
		System.out.println(count);
	}
}
