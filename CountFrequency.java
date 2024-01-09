package workshop;

import java.util.Scanner;

public class CountFrequency {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int list[], size, search;
		size = in.nextInt();
		list = new int[size];
		//getting elements from the user
		for (int i = 0; i<size; i++)
			list[i] = in.nextInt();
		System.out.print("Enter an element to be searched : ");
		search = in.nextInt();
		int cnt = 0;
		for (int i = 0; i<size; i++) {
			if (list[i]==search)
				cnt++;
		}
		System.out.println(cnt);

	}

}
