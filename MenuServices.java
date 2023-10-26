import java.util.Scanner;
public class MenuServices {
	public static void displayTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose table you want: ");
		int n = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
	public static void checkPrimeNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				System.out.println(n + " is not a prime number");
				return;
			}
		}
		System.out.println(n + " is a prime number");

	}
//	public static void displayDiamondPattern() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the height of diamond: ");
//		
//	}
}
