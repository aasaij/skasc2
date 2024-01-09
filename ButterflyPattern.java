package workshop;

public class ButterflyPattern {

	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		int len = str.length();
		for (int i = len-1;i>=0; i-- )
			System.out.println(str.substring(0,len-i)+" ".repeat(i*2) + str.substring(0,len-i));
		
		for (int i = 0;i<len; i++ )
			System.out.println(str.substring(0,len-i)+" ".repeat(i*2) + str.substring(0,len-i));
			}
}
