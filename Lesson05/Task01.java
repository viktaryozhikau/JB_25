package by.epam.jb25.Lesson05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		
				int len = 0;
				fraction f = new fraction();
				Scanner sck = new Scanner(System.in);
				for (int i = 0; i < 1; i++) {
					System.out.print("Please enter massive length K > ");
					if (sck.hasNextInt()) {
						f.k = sck.nextInt();
						len = f.k;
					}
				}

				Scanner scm = new Scanner(System.in);
				int[] num = new int[len];
				int[] denom = new int[len];
				for (int ii = 0; ii < num.length; ii++) {
					System.out.print("Please enter next numerator > ");
					if (scm.hasNextInt()) {
						num[ii] = scm.nextInt();
					}
					System.out.print("Please enter next denominator > ");
					if (scm.hasNextInt()) {
						denom[ii] = scm.nextInt();
					}
				}
				System.out.println("");
			
				print(num, denom);
				calsulateFraction(num, denom);
			}

			public static void print(int[] num, int[] denom) {
				for (int i = 0; i < num.length | i < denom.length; i++)

					System.out.print("numerator" + i + "=" + num[i] + "; ");
				System.out.println("");

				for (int ii = 0; ii < denom.length; ii++)
					System.out.print("denominator" + ii + "2=" + denom[ii] + "; ");
				System.out.println("");

			}

			public static void calsulateFraction(int[] num, int[] denom) {
				fraction f = new fraction();
				System.out.println("The massive is: ");
				for (int concat = 0; concat < num.length; concat++) {
					f.fracArray = num[concat] + "/" + denom[concat];
		
					System.out.print("fraction[" + concat + "]=" + f.fracArray + ";");
				}
			}

		

	}


