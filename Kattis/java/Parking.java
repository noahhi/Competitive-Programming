
import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;

public class Parking {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++){
			int length = in.nextInt();
			in.nextLine();
			int[] nums = new int[length];
			for(int j = 0; j < length; j++){
				nums[j] = in.nextInt();
			}
			Arrays.sort(nums);
			int small = nums[0];
			int big = nums[nums.length-1];
			int distance = (big-small)*2;
			System.out.println(distance);
		}
	}
}
