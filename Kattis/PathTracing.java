
import java.util.Scanner;

public class PathTracing {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner("down down left left up up up left left");
		String[][] grid = new String[1001][1001];
		int x =500;
		int y =500;
		grid[x][y] = "S";
		while(in.hasNext()){
			String instruction = in.next();
			if(instruction.equals("down")){
				y+=1; 
				grid[x][y] = "*";
			}
			else if(instruction.equals("up")){
				y-=1; 
				grid[x][y] = "*";
			}
			else if(instruction.equals("right")){
				x+=1; 
				grid[x][y] = "*";
			}
			else if(instruction.equals("left")){
				x-=1; 
				grid[x][y] = "*";
			}
		}
		grid[x][y] = "E";
		
		
		for(int i = 0; i<grid.length; i++){
			for(int j =0; j<grid[0].length; j++){
				if(grid[j][i] != null){
					System.out.print(grid[j][i]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
