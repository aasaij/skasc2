package workshop;

public class OTPGenerataion {

	public static void main(String[] args) {
		String OTP = "";
		for (int i = 1; i<=6; i++)
			OTP = OTP +(int) (Math.random() * 10);
		System.out.println(OTP);

	}

}
