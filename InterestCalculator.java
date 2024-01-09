package workshop;

import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char choice;
		int principal;
		float rate, year, interest=0;
		System.out.print("Principal Amount : ");
		principal = in.nextInt();
		System.out.print("Years : ");
		year  = in.nextFloat();
		System.out.print("Rate of interest : ");
		rate = in.nextFloat();
		System.out.print("[S]imple/[C]ompound Interest ? ");
		choice = in.next().charAt(0); //Simple
		if (choice == 'S' || choice =='s')
			interest = principal * rate * year/100;
		else if (choice =='C' || choice == 'c')
				interest = principal * (float)Math.pow(1+rate/100, year);
		else {
			System.out.println("Invalid  choice!");
			return;
		}
		System.out.printf("Interest : %.2f", interest);


	}

}
