package Assignment1.question1;

public class NumberServices {
	public static void checkPrime(int p) {
		for(int i=2; i<p; i++) {
			if(p % i == 0) {
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println("prime");
	}
}
