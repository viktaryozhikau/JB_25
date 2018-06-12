package by.epam.jb25.lesson03;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int x = 0;
				Scanner sc = new Scanner(System.in);
				System.out.print("Введите x ");
				if (sc.hasNextInt()) {
					x = sc.nextInt();

				}
				Calc(x);
			}

			public static void Calc(int x) {
				double fx = 0;
				if (x <= -3) {
					fx = 9;
				} else if (x > 3) {
					fx = 1 / ((Math.pow(x, 2))+1);
				} else {
					System.out.println("Введите x вне интервала от -3 до 3 ");
					return;
				}
				printResult(fx);
			}
			
			public static void printResult(Double x){
				System.out.println("f(x) = "+x);
			}
		
		
		
		
		
	}


