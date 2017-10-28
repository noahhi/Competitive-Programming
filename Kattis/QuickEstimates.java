package Easy;

import java.util.Scanner;

public class QuickEstimates {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner("5 314 1 5926 5 35897");
		int n = in.nextInt();
		
		for(int i = 0; i<n; i++){
			String num = in.next();
			System.out.println(num.length());
		}
	}
}
