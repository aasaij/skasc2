package workshop;

import java.util.Scanner;

public class LoginChecking {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final String userName = "ADMIN";
		final String password = "Admin@123";
		String user, pwd;
		int i;
		mainLoop: //label
		for (i = 1; i<=3; i++) {
			System.out.print("User Name : ");
			user = in.next();
			if (userName.equalsIgnoreCase(user)) {
				for (;i<=3;i++) {
					System.out.print("Password : ");
					pwd = in.next();				
					if (password.equals(pwd)) {
						System.out.println("Login Successful!");
						break mainLoop; //break with label
					}
					else
						System.out.println("Invalid password");
				}
			}
			else
				System.out.println("Invalid Username");
		}
		if (i == 4)
			System.out.println("Your account has been locked!" + i);
	}

}
