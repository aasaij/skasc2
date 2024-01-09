package workshop;

import java.util.Scanner;

//Program to find least element in a list
public class FindingMinimum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int list[], min, size;
		size = in.nextInt();
		list = new int[size];
		for (int i = 0; i<size; i++)
			list[i] = in.nextInt();
		min = list[0];
		for(int i = 1; i<size; i++) {
			if(min > list[i])
				min = list[i];
		}
		System.out.println(min);
	}

}
