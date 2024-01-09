package workshop;

import java.util.Scanner;

public class IncreasingOrder4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c,d, max, min, mid1, mid2;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		max = Math.max(Math.max(a,b), Math.max(c, d));
		min = Math.min(Math.min(a, b), Math.min(c, d));
		mid1 = Math.min(Math.max(a, b), Math.max(c, d));
		mid2 = a+b+c+d - (max+min+mid1);
		if (mid1 > mid2)
			System.out.println(min + " < " + mid2 +" < " + mid1 + " < "
					+ max);
		else
			System.out.println(min + " < " + mid1 +" < " + mid2 + " < "
					+ max);
	}

}
