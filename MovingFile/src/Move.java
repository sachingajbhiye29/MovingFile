

import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.Scanner;

public class Move{
	
	public static void main(String args[]) throws IOException{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many images or files you want to move: ");
		int imgNum = scan.nextInt();
		
		System.out.println("Enter Image or File Name with .jpg or .txt and destination name for the Image or File with .jpg or .txt: ");
		String imgName = scan.next();
		String imgDestName = scan.next();
		
		for(int i = imgNum; i>0; i--) {
			
			Path temp = Files.move
			        (Paths.get("C:\\Users\\sachin.gajbhiye\\Downloads\\" + imgName), 
			        Paths.get("C:\\Projects\\EHI\\DL\\" + imgDestName));
			
			if(temp!=null) {
				System.out.println("File is renamed and moved successfully" + temp);
			}
			else {
				System.out.println("Failes to move file");
			}
			
		}
		
	}
}