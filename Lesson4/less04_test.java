package by.epam.jb25.Lesson4;


import java.util.Scanner;

public class less04_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] mas = new int[10];
		mas[0] = 34;
		mas[1] = 35;
		mas[2] = 56;
		mas[3] = 59;
		mas[4] = 68;
		mas[5] = 24;
		mas[6] = 45;
		mas[7] = 45;
		mas[8] = 67;
		mas[9] = 78;
		
		
		
	
		printMassive(mas);
		calcMas(mas);

	}



	public static void printMassive(int[] mas) {
		
		System.out.print("Massive: ");
		for (int i = 0; i < mas.length; i++) {

			System.out.print("mas" + i + "=" + mas[i] + "; ");
		}
		System.out.println();
		
	}

	public static void calcMas(int[] mas) {

		int sum = 0;
		int k = 0;
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 1; i++) {
			System.out.print("Enter K > ");
			if (sc.hasNextInt()) {
				k = sc.nextInt();
			}
		}
		System.out.print("multiple K: ");
		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % k == 0) {
				sum += mas[i];

				System.out.print("mas" + i + "=" + mas[i] + " ");

			}

		}
		printSum(sum);
	}

	public static void printSum(int sum) {
		System.out.println();
	
		System.out.println("Total Sum = " + sum);

	}

}
