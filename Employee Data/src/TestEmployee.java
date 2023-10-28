import java.time.LocalDate;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1,"Ameya","3333","a@gmail.com","HR","manager",LocalDate.of(2001,02,23));
		System.out.println(e.getPemail());
		
		// implicit typecasting (upcasting)
		Employee e1 = new SalariedEmp(1,"Ameya","3333","b@gmail.com","HR","manager",LocalDate.of(2001,02,23),2500,5000); 
		SalariedEmp e2 = (SalariedEmp)e1;
		
		SalariedEmp s1 = (SalariedEmp)e1;
		System.out.println(s1.getPname());
	}

}
