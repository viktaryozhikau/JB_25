package by.epam.jb25.lesson02;

import java.util.Scanner;

public class Task_02_01 {
	public static void main(String[] args) {
		double a = 0, b = 0,  c = 0 , z;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите a: ");
		if (sc.hasNextDouble()) {
		a = sc.nextDouble();

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Введите b: ");
		if (sc1.hasNextDouble()) {
		b = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Введите c: ");
		if (sc2.hasNextDouble()) {
		b = sc2.nextDouble();
		}
		
		double temp;
		temp = a * 2;
		if (temp != 0) {
		z = (b + Math.sqrt (b*b + 4*a*c))  / temp -(a*a*a*c + b);
		
		 
		System.out.println("Result =" + z );
		
		}
		
		else {
		System.out.println("Знаменатель равен нулю.");
		z = Double.NaN;
		
	

}

		}	
		}
	}
}
	