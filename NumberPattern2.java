package workshop;

public class NumberPattern2 {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		
		for(int r = n;r>=1;r--) {
			System.out.print(" ".repeat(n-r));
			for (int c = 1;c<=r;c++)
				System.out.print(c);
			System.out.println();
		}	

	}

}
//5
//12345
// 1234
//  123
//   12
//    1