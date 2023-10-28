import java.time.LocalDate;

public class Employee extends Person {
	private String dept;
	private String designation;
	private LocalDate DateOfJoining;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int pid, String pname, String pmob, String pemail,String dept, String designation, LocalDate dateOfJoining) {
		super(pid,pname,pmob,pemail);
		this.dept = dept;
		this.designation = designation;
		DateOfJoining = dateOfJoining;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDate getDateOfJoining() {
		return DateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		DateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", designation=" + designation + ", DateOfJoining=" + DateOfJoining + "]";
	}
	
	
	
	
}
