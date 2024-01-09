package workshop;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] names;
		String search;
		int size;
		size = in.nextInt();
		names = new String[size];
		in.next();
		//get ting names for array
		for (int i = 0; i<size; i++)
			names[i] = in.nextLine();
		System.out.println("Name to be searched : ");
		search = in.nextLine();
		//Implementing linear search algorithm
		for (int i = 0; i<size; i++) {
			if (names[i].equalsIgnoreCase(search)) {
				System.out.println("Found!");
				return;
			}
		}
		System.out.println("Not Found");

	}

}
