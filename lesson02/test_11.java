package by.epam.jb25.lesson02;

import java.util.Scanner;

public class test_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int n = 3;
			Scanner sc = new Scanner(System.in);
			String max = "", min = "", str = "";
			for (int i = 0; i < n; i++) {
			System.out.print("> ");
			if (sc.hasNextLine()) {
		
			str = sc.nextLine();
			if (i == 0) {
			min = str;
			}
			if (str.length() > max.length()) {
			max = str;
			} else if (str.length() < min.length()) {
			min = str;
			}
			}
			}
			System.out.println("max string = " + max + " length=" + max.length());
			System.out.println("min string = " + min + " length=" + min.length());
	}

}
