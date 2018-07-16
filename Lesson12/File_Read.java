package by.epam.jb25.Lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class File_Read {

	
		public static void main(String[] args) throws FileNotFoundException {	
	
		
			Scanner sc = new Scanner(new File("PrindedEdition.txt"));
			ArrayList<String> list = new ArrayList<String>();
			
			while (sc.hasNextLine())
				list.add(sc.nextLine());
			
			
			System.out.println(list);

	}

}

