package by.epam.jb25.Lesson4;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] mas = new int[10];
		mas[0] = 34;
		mas[1] = 35;
		mas[2] = 0;
		mas[3] = 59;
		mas[4] = 0;
		mas[5] = 24;
		mas[6] = 0;
		mas[7] = 45;
		mas[8] = 0;
		mas[9] = 78;
		

	}
	public static void calculate(int[] mas) {
		
		System.out.print("Massive 1 is: [");
		for (int i = 0; i < mas.length; i++) {
			
			if (mas[i] == 0) {
				int[] mas1 = { i };

				printRes(mas1);

			}
		}
	}

	public static void printRes(int[] mas1) {

		for (int mas1_1 : mas_1 {
			
			System.out.print(mas1 + " ");

		}
	}

}
