import java.util.Arrays;
import java.util.Scanner;

public class CountingStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "10 20\n" + 
				"#################---\n" + 
				"##-###############--\n" + 
				"#---################\n" + 
				"##-#################\n" + 
				"########---#########\n" + 
				"#######-----########\n" + 
				"########---#########\n" + 
				"##################--\n" + 
				"#################---\n" + 
				"##################-#\n" + 
				"3 10\n" + 
				"#-########\n" + 
				"----------\n" + 
				"#-########";
		Scanner sc = new Scanner(System.in);
		int caseNum = 0;
		while(sc.hasNextLine()) {
			int rows = sc.nextInt();
			int cols = sc.nextInt();
			char[][] board = new char[rows][cols];
			sc.nextLine();
			for(int i = 0; i < rows; i++) {
				String row = sc.nextLine();
				for(int j = 0; j < cols; j++) {
					board[i][j] = row.charAt(j);
				}
			}
			//System.out.println(Arrays.deepToString(board));
			int count = 0;
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
					if(board[i][j] == '-') {
						count++;
						fill(board,i,j);
					}
				}
			}
			caseNum++;
			System.out.println("Case " + caseNum + ": " + count);
		}
	}
	
	public static void fill(char[][] board, int i, int j) {
		if (i >= 0 && i < board.length && j >= 0 && j < board[0].length && board[i][j]=='-') {
			board[i][j] = 'x';
			fill(board, i+1, j);
			fill(board, i-1, j);
			fill(board, i, j+1);
			fill(board, i, j-1);
		}
	}
}
