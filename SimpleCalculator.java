package workshop;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2;
		char sign;
		double res=0;
		n1 = in.nextInt();
		sign = in.next().charAt(0);
		n2 = in.nextInt();
		switch(sign) {
		case '+':
			res = n1 + n2; break;
		case '-':
			res = n1 - n2; break;
		case '*': case 'x': case 'X':
			res = n1 * n2; break;
		case '/':
			res = (double)n1 / n2; break;
		case '%':
			res = n1 % n2; break;
		default:
				System.out.println("Invalid operation!");
				System.exit(0);//Terminate the application
		}
		System.out.printf("%d %c %d = ",n1,sign,n2);
		System.out.println(res);

	}

}
