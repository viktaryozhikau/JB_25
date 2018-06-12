package by.epam.jb25.lesson03;

import java.util.Scanner;

import java.util.Scanner;


public class task_02 {
	
	public static void main(String[] args) {
		double a = 0, b = 0,  h = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите a ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		System.out.print("Введитеt b ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}

		System.out.print("Введите h ");
		if (sc.hasNextDouble()) {
			h = sc.nextDouble();
		}
		fx(a, b, h);
		System.out.println("End");
	}

	public static void fx(double a, double b, double h) {
		for (double i = a; i <= b; i = i + h) {
			double fx = 2 * Math.tan(i / 2) + 1;


			printRes(i, fx);
		}

	}

	public static void printRes(double i, double fx) {

		System.out.println("f(x) = 2tg(x / 2) + 1" + " | " + "f(" + i + ")"
				+ " " + "= " + fx);
	}

}

