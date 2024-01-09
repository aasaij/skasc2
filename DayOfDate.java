package workshop;

import java.util.Scanner;

public class DayOfDate {

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
		 if (valid) {
			 int D, C, f;
			 if ( m == 1 || m == 2) {
				 m+=10;
				 y--;
			 }
			 else {
				 m-=2;
			 }
			 D = y % 100;
			 C= y / 100;
			 f = (d + (13*m-1)/5 + D + D/4 + C/4-2*C)%7;
			 if (f < 0) f += 7;
			 switch(f) {
			 case 0: 
				 System.out.println("Sunday");break;
			 case 1:
				 System.out.println("Monday");break;
			 case 2:
				 System.out.println("Tuesday");break;
			 case 3:
				 System.out.println("Wednesday");break;
			 case 4:
				 System.out.println("Thursday");break;
			 case 5:
				 System.out.println("Friday");break;
			 case 6:
				 System.out.println("Saturday");
			 }
		 }
		 else
			 System.out.println("Invalid");
			

	}

}
