package workshop;

import java.util.Scanner;

public class DateValidation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean valid = true;
		int d, m, y;
		 d = in.nextInt();
		 m = in.nextInt();
		 y = in.nextInt();
		 if ( d > 31 || d < 1 || m > 12 || m < 1 || y < 1)
			 valid = false;
		 else {
			 switch(m) {
			 case 4,6,9,11:
				 if ( d > 30)
					 valid = false; break;
			 case 2:
				 if ( y % 400 == 0 || (y % 4==0 && y % 100 !=0)) {
					 if ( d > 29)
						 valid = false;
				 }
				 else if (d > 28) valid = false;
			 }
		 }
		 if (valid)
			 System.out.println("Valid");
		 else
			 System.out.println("Invalid");
			 
	}

}
