package workshop;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		if ( n == 1)
			System.out.println("Neither prime nor composite");
		else {
			for (int i = 2; i<=n-1;i++) {
				if (n % i == 0) {
					System.out.println("Not Prime");
					return;
				}
			}
			System.out.println("Prime");
		}
	}

}
