import java.util.Scanner;

public class TestStudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the choice:\n1. Add student\n2. display All\n3. display by id\n4. display by name\n5. update marks of m1 by Id\n6. exit\nchoice");
			ch=sc.nextInt();
			
			switch(ch) {
				case 1:
					StudentServices.addStudent();
					break;
				case 2: 
					StudentServices.displayAll();
					break;
				case 3:
					System.out.println("Enter the id:");
					int id = sc.nextInt();
					StudentServices.displayById(id);
					break;
				case 4:
					System.out.println("Enter the name:");
					String nm = sc.next();
					StudentServices.displayByName(nm);
					break;
				case 5:
					System.out.println("Enter the id: ");
					id = sc.nextInt();
					System.out.println("Enter the new marks (m1): ");
					int m1 = sc.nextInt();
					StudentServices.updateMarksById(id,m1);
					break;
				case 6:
					break;
			}
			
		}while(ch != 6);
		sc.close();
	}

}
