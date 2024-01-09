package workshop;

public class ConsonantDemo {

	public static void main(String[] args) {
		char ch = new java.util.Scanner(System.in).next().charAt(0);
		if ((ch >= 'a' && ch <='z') || (ch >='A' && ch <='Z')) {
			if (!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' ||
					ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else 
			System.out.println("No");
	}
}
