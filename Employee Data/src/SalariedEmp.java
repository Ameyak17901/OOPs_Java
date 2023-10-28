import java.time.LocalDate;

public class SalariedEmp extends Employee {
	private int salary;
	private int bonus;
	
	
	public SalariedEmp() {
		super();
	}
	
	
	public SalariedEmp(int pid, String pname, String pmob, String pemail,String dept, String designation, LocalDate dateOfJoining,int salary, int bonus) {
		super(pid,pname,pmob,pemail,dept,designation,dateOfJoining);
		this.salary = salary;
		this.bonus = bonus;
	}


	@Override
	public String toString() {
		return "SalariedEmp [salary=" + salary + ", bonus=" + bonus + "]";
	}


	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
