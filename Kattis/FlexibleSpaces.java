
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FlexibleSpaces {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int width = in.nextInt();
		int numWalls = in.nextInt();
		numWalls += 2;
		int[] walls = new int[numWalls];
		walls[0] = 0;
		walls[numWalls-1] = width;
		for(int i = 1; i < numWalls-1; i++){
			walls[i] = in.nextInt();
		}
		ArrayList<Integer> lengths = new ArrayList<Integer>(); 
		for(int i = 0; i < numWalls; i++){
			for(int j = i+1; j < numWalls; j++){
				int length = walls[j] - walls[i];
				if(!lengths.contains(length)){
					lengths.add(length);
				}
			}
		}
		Collections.sort(lengths);
		for(int i = 0; i < lengths.size(); i++){
			System.out.println(lengths.get(i));
		}
	}
}
