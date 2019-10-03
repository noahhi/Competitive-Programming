
import java.util.Scanner;

public class ColdPuterScience {
	public static void main(String[] args){
		//Scanner in = new Scanner("4 -9 0 -3 -4");
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int count = 0;
		for(int i  = 0; i < n; i++){
			int temp = in.nextInt();
			if(temp < 0){
				count +=1;
			}
		}
		System.out.print(count);
		in.close();
		
	}
}
