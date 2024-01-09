package workshop;

import java.util.Scanner;

public class SecondMaximum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int list[], size, max, smax;
		size = in.nextInt();
		list = new int[size];
		for (int i = 0; i<size; i++)
			list[i] = in.nextInt();
		//Finding second highest from list of values
		max = Math.max(list[0], list[1]);
		smax = Math.min(list[0], list[1]);
		for (int i = 2; i<size; i++) {
			if (max < list[i]) {
				smax = max;
				max = list[i];
			}
			else if (smax < list[i])
				smax = list[i];
		}
		System.out.println(smax);
	}

}
