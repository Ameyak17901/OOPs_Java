import java.util.Scanner;
public class MenuDrivenArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			
			System.out.println("Enter the choice : \n 1. Add 2 arrays \n 2. Transpose array \n 3. Minimum Element \n 4. Maximum Element \n 5. Display Array \n 6. count of occurences of a value \n 7. Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1: 
				int a[] = ArrayServices.sumArray();
				ArrayServices.displayArray1D(a);
				break;
			case 2:
				int[][] a1 = ArrayServices.getArray2D();
				int[][] ar = new int[a1.length][a1[0].length];
				
				ar= ArrayServices.transposeArray(a1);
				ArrayServices.displayArray2D(ar);
				break;
			case 3:
				int[][] arr1 = ArrayServices.getArray2D();
				int minEl = ArrayServices.findMinElement(arr1);
				System.out.println("Minimum Element : "+minEl);
				break;
			case 4:
				
				int[][] maxArr = ArrayServices.getArray2D();
				int maxEl = ArrayServices.findMaxElement(maxArr);
				System.out.println("Maximum Element : "+maxEl);
				break;
			case 5:
				int[] d = ArrayServices.getArray1D();
				ArrayServices.displayArray1D(d);
				break;
			case 6:
				int v = sc.nextInt();
				int[] v1 = ArrayServices.getArray1D();
				int c = ArrayServices.countOccurences(v,v1);
				System.out.println("Ocuurences of " + v + " : " + c);
				break;
			case 7:
				System.exit(0);
			default: 
				System.out.println("Invalid choice! ");
			}	
		} while(ch != -1);
		sc.close();
	}
}
