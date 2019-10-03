

import java.math.BigInteger;
import java.util.Scanner;

public class ADifferentProblem {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner("1 12345677654321");
		while(in.hasNext()){
			String num1 = in.next();
			String num2 = in.next();
			BigInteger big1 = new BigInteger(num1);
			BigInteger big2 = new BigInteger(num2);
			BigInteger diff = big1.subtract(big2);
			System.out.println(diff.abs());
		}
	}
}
