package by.epam.jb25.lesson02;

import java.util.Scanner;

public class Task_02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int R = 0 , z, s ;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите радиус: ");
		if (sc.hasNextInt()) {
		R = sc.nextInt();
		
		
		
	}
		int temp;
		temp = (int) Math.PI;
				
				{
			z =2* R * temp;
			s = R*R*temp;
			
			System.out.println("Длинна окружности= " + z + "\nПлощадь круга " + s);
			
			}

}
}