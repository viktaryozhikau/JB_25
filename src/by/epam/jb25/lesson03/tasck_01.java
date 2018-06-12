package by.epam.jb25.lesson03;

import java.util.Scanner;

public class tasck_01 {

	public static void main(String[] args) {
		
		
		int n = 10;
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
		
		
		
		
		
		
		
	}}
		
		
		
		
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
//		double x = 0, y = 0,   a=0,  b=0;
		
	//	System.out.print("Введите x: ");
//		x = sc.nextDouble();
	//	y = calcY(x);
//		System.out.println("y=" + y);
	//	System.out.print("Введите  x: ");
		//x = sc.nextDouble();
	
//		y = calcY(x);
	//	
	//	System.out.println("y(" + x + ")=" + y);
	//	}
	//	public static double calcY(double x){
	//	double fx , h;
	//	System.out.print("Введите h: ");
	//	Scanner sh = new Scanner(System.in);
	///	h = sh.nextDouble();
	//	if (h >= 12) {
	//		fx = 2* Math.tan(x/2) + 1;
	//	} else {
	//		return h;
	//	}
	
	
//	}

//}






