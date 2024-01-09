package workshop;
//Program to check whether the given is sum of two even numbers or not
public class EvenDemo {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
//		if (n==2) {
//			System.out.println("No");
//		}
//		else if (n % 2 == 0) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		System.out.println(n!=2 && n%2==0?"Yes":"No");
	}

}
