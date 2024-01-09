package workshop;

public class AlphabetPattern {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for(int r = n;r>=1;r--) {
			for (int c = 1;c<=r;c++)
				System.out.print((char)(c+64));
			System.out.println();
		}

	}

}



