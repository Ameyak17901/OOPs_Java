
public class Student {
	private int id;
	private String name;
	private int m1,m2,m3;
	static int count;

	
	static {
		count = 0;
	}
	/*
	private String generateID() {
		
		return name.substring(0,1)+count;			
	}
	*/
	public Student() {
		this(0,null,0,0,0);
		
	}
	
	public Student(int id,String name, int m1,int m2,int m3) {
		if(name != null) {
			this.name = name;
		}
			this.id = id;
			this.m1=m1;
			this.m2=m2;
			this.m3=m3;
			count++;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getM1() {
		return m1;
	}
	public int getM2() {
		return m2;
	}
	public int getM3() {
		return m3;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setM1(int m) {
		m1 = m;
	}
	public void setM2(int m) {
		m2 = m;
	}
	public void setM3(int m) {
		m3 = m;
	}
	
	public String toString() {
		return "ID : "+this.id+"\nName : "+ this.name + "\nM1 : "+this.m1+ "\nM2 : "+this.m2+ "\nM3 : "+this.m3;
	}
}
