package workshop;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int principal;
		float rate, year, interest;
		System.out.print("Principal Amount : ");
		principal = in.nextInt();
		System.out.print("Years : ");
		year  = in.nextFloat();
		System.out.print("Rate of interest : ");
		rate = in.nextFloat();
		interest = principal * (float)Math.pow(1+rate/100, year);
		System.out.printf("Interest : %.2f", interest);
		int a = Integer.parseInt("0b86",16);
		System.out.println((char)a);

	}

}
