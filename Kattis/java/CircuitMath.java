import java.util.Scanner;
import java.util.Stack;

public class CircuitMath {

	public static void main(String[] args) {
		String test = "4\r\n" + 
				"T F T F\r\n" + 
				"A B * C D + - +\r\n" + 
				"";
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean[] truth_values = new boolean[n];
		for(int i = 0; i < n; i++) {
			String c = in.next();
			truth_values[i] = (c.equals("T")) ? true : false;
		}
		
		Stack<Boolean> stack = new Stack<>();
		
		while(in.hasNext()) {
			String s = in.next();
			char c = s.charAt(0);
			if(c=='*' || c=='+' || c=='-') {
				if (c=='-') {
					boolean b = stack.pop();
					stack.push(!b);
				}
				else {
					boolean b1 = stack.pop();
					boolean b2 = stack.pop();
					if (c=='*') {
						stack.push(b1 && b2);
					}
					if (c=='+') {
						stack.push(b1 || b2);
					}
				}
			}else {
				boolean truth = truth_values[c-'A'];
				stack.push(truth);
			}
		}
		String res = stack.pop() ? "T" : "F";
		System.out.println(res);
	}
}
