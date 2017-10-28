package Easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cudoviste {
	//static File file = new File("C:/Users/noahh/Downloads/cudo/cudoviste.3.in");
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner("5 5 ..XX. .#XX. ..#.. ..... .....");

		int rows = in.nextInt();
		int cols = in.nextInt();
		in.nextLine();
		//System.out.println(rows);
		String[][] grid = new String[rows][cols];
		for(int i = 0; i < rows; i++){
			String row = in.nextLine();
			//System.out.println(row);
			for(int j = 0; j < cols; j++){
				char c = row.charAt(j);
				grid[i][j] = String.valueOf(c);
			}
		}
		
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		
		for(int i = 0; i < rows-1; i++){
			for(int j = 0; j < cols-1; j++){
				boolean cantPark = false;
				if(grid[i][j].equals("#") || grid[i+1][j].equals("#") 
						|| grid[i][j+1].equals("#") || grid[i+1][j+1].equals("#")){
					cantPark = true;
				}
				if(!cantPark){
					if(grid[i][j].equals(".") && grid[i+1][j].equals(".") 
							&& grid[i][j+1].equals(".") && grid[i+1][j+1].equals(".")){
						zero += 1;
					} else {
						int numCrushed = 0;
						if(grid[i][j].equals("X")){
							numCrushed +=1;
						}
						if(grid[i+1][j].equals("X")){
							numCrushed +=1;
						}
						if(grid[i][j+1].equals("X")){
							numCrushed +=1;
						}
						if(grid[i+1][j+1].equals("X")){
							numCrushed +=1;
						}
						if(numCrushed == 1){
							one +=1;
						}
						if(numCrushed == 2){
							two +=1;
						}
						if(numCrushed == 3){
							three +=1;
						}
						if(numCrushed == 4){
							four +=1;
						}
					}
				}
			}
		}
		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);		
	}
}
