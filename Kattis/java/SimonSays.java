
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;

public class SimonSays {
	//static File file = new File("C:/Users/noahh/Downloads/samples/03_simple.in");
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(in.hasNextLine()){
			String command = in.nextLine();
			String[] words = command.split(" ");
			if(words.length >= 2){
				if(words[0].equals("Simon")){
					if(words[1].equals("says")){
						for(int i = 2; i < words.length; i++){
							System.out.print(words[i] + " ");
						}
						System.out.println();
					}
				}
			}
		}
		in.close();
	}
}
