import java.util.Scanner;
public class MenuProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 1;
		do {
			System.out.println("Enter the choice: \n 1. print table \n 2. display whether number is prime or not \n 3. display diamond pattern");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
					MenuServices.displayTable();
					break;
			case 2: 
					MenuServices.checkPrimeNumber();
					break;
//			case 3:
//				    MenuServices.displayDiamondPattern();
//				    break;
//			default:
//					System.out.println("Invalid choice");
			}
			n--;
		} while(n > 0);
		sc.close();
	}

}
