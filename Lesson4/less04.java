package by.epam.jb25.Lesson4;

import java.util.Scanner;

public class less04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = 0, Fx;
		System.out.print("Введите x: ");
		if (sc.hasNextDouble()) {
		x = sc.nextDouble();
		}
		less04.calcY(x);
		
		}

	
	public static void calcY(double x)
	{	
	double Fx;
	if (x >= 3) {
		Fx = -x * x + 3 * x + 9;
		} else {
		Fx = 1 / (Math.pow(x, 3) - 6);
		}
		System.out.println("F(x)=" + Fx);
}}
