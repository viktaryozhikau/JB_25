package by.epam.jb25.Lesson4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = new int[5];
	
		CreateMass(array);
		PrintArray(array);
		checkArray(array);
	}

	public static void CreateMass(int[] array) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("Please enter number > ");
			if (sc.hasNextInt()) {
				array[i] = sc.nextInt();
			}

		}
	}

	public static void PrintArray(int[] array) {
		
		System.out.print("Massive: ");
		for (int i = 0; i < array.length; i++) {

			System.out.print("number" + i + "=" + array[i] + "; ");
		}
		System.out.println();
	}
	public static void checkArray(int[] array) {
		
		for (int i = 0; i < array.length;) {
			if (array[i] < array[i + 1]) {
			
				System.out.print("The massive is ASC ");
				return;
			} else{
			
				System.out.print("The massive is DESC");
				return;
			}
		} 
	}

}
