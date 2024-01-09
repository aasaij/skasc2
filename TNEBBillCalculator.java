package workshop;

public class TNEBBillCalculator {

	public static void main(String[] args) {
		int units = new java.util.Scanner(System.in).nextInt();
		double amt;
		if (units <= 100)
			amt = 0;
		else if (units <= 200)
			amt = 0 + (units - 100) * 1.5 + 20;
		else if (units <=300)
			amt = 0 + 200 + (units-200)*3 + 30;
		else if (units<=500)
			amt =0 +350+450+(units-300)*6 + 50;
		else
			amt = 0 + 350 +450 + 1200 + (units-500)*8 + 50;
		System.out.printf("Bill Amount : %.2f", amt);

	}

}
