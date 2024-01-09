package workshop;

public class Squarepattern {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=n; j++) {
				if (i ==1 || i==n || j==1 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();	
		}


	}

}
