package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Patuljci {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] nums = new int[9];
		int sum = 0;
		for(int i = 0; i < 9; i++){
			int num = in.nextInt();
			nums[i] = num; 
			sum += num; 
		}
		int diff = sum - 100; 
		int non1 = -1;
		int non2 = -1;
		for(int i = 0; i< nums.length; i++){
			int newDiff = diff - nums[i];
			for(int j = 0; j< nums.length; j++){
				if((nums[j] == newDiff) && (i != j)){
					 non1 = i;
					 non2 = j;
				}
			}
		}
		for(int i = 0; i<nums.length; i++){
			if(i != non1 && i != non2){
				System.out.println(nums[i]);
			}
		}
	}
}
