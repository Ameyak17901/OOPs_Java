import java.util.Scanner;

public class ArrayServices {
	public static int[] getArray1D() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 2D array : ");
		int m1 = sc.nextInt();
		int[] arr = new int[m1];
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<m1; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static int[][] getArray2D() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 2D array : ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int[][] arr = new int[m1][m2];
		System.out.println("Enter the values for array: ");
		for(int i=0; i<m1; i++) {
			for(int j=0; j<m2;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	public static void displayArray1D(int[] a) {
		System.out.println("Elements of array are : ");
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void displayArray2D(int[][] a) {
		System.out.println("Elements of 2D array : ");
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[] sumArray() {
		
		System.out.println("Enter the elements of array 1:");
		int[] a1 = getArray1D();
		System.out.println("Enter the elements of array 2:");
		int[] a2 = getArray1D();
		int[] result = new int[a1.length];
		for(int i=0; i<a1.length; i++) {
			result[i] = a1[i] + a2[i];
		}
		
		return result;
	}
	
	
	
	public static int[][] transposeArray(int[][] arr) {
		int [][] t = new int[arr.length][arr[0].length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int temp = t[i][j];
				t[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return t;
	}
	public static int findMinElement(int[][] a) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[0].length; j++) {
				if(min > a[i][j]) min = a[i][j];
			}
		}
		return min;
	}
	
	public static int findMaxElement(int[][] a) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[0].length; j++) {
				if(max < a[i][j]) max = a[i][j];
			}
		}
		return max;
	}
	public static int countOccurences(int v, int[] a) {
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == v) {
				count++;
			}
		}
		return count;
	}
}
