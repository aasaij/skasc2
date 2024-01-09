package workshop;

public class SievePrimeNumber {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
        if ( n == 1)
            System.out.println("Neither prime nor composite");
        else if (n > 3 && (n % 2 == 0 || n%3 ==0))
            System.out.println("Not Prime");
        else {
            for (int i = 5; i<=Math.sqrt(n);i+=6) {
                if (n % i == 0 || n % (i+2)==0) {
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
	}
}

// 5   11    17   23 29 31
//Twin prime --> difference between two prime number should be 2