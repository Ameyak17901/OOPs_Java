import java.util.Scanner;

public class StudentServices {
	public static Student[] sarr;
	public static int count;
	
	static {
		sarr = new Student[10];
		count = 0;
	}
	
	public static void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id : ");
		int id = sc.nextInt();
		System.out.println("Enter the Name : ");
		String name = sc.next();
		System.out.println("Enter the marks (m1): ");
		int m1 = sc.nextInt();
		System.out.println("Enter the marks (m2): ");
		int m2 = sc.nextInt();
		System.out.println("Enter the marks (m3): ");
		int m3 = sc.nextInt();
		sarr[count] = new Student(id,name,m1,m2,m3);
		count++;
	}
	
	public static void displayAll() {
		for(int i=0; i<count; i++) {
			System.out.println(sarr[i]);
		}
	}
	
	public static void displayById(int id) {
		for(int i=0; i<count; i++) {
			if(sarr[i].getId() == id) {
				System.out.println(sarr[i]);
				break;
			}
		}
	}
	
	public static void displayByName(String nm) {
		for(int i=0; i<count; i++) {
			if(sarr[i].getName().equals(nm)) {
				System.out.println(sarr[i]);
			}
		}
	}
	
	public static void updateMarksById(int id,int nM1) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<count; i++) {
			if(sarr[i].getId() == id) {
				System.out.println(sarr[i]);
				System.out.println("Enter the choice (Y for yes/N for No)");
				String ans = sc.next();
				if(ans.equals("Y")) {
					sarr[i].setM1(nM1);
					break;
				}
			}
		}
	}
}
