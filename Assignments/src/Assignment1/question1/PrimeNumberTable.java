package Assignment1.question1;

public class PrimeNumberTable {

	public static void main(String[] args) {
			if(args.length == 3) {
				for(int i=0; i<args.length; i++) {
					int n = Integer.parseInt(args[i]);
					NumberServices.checkPrime(n);
				}
			}

		}

}
