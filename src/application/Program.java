package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		// Listing folders
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		// Listing files
		File[] files = path.listFiles(File::isFile);
		for (File file: files) {
			System.out.println(file);
		}
		
		// Creating folder 
		boolean success = new File(strPath + ".\\createdFolder").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}
