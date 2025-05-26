package in.interview;

class Employee{
	private String name ;
	private int id;
	private double salary;
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		 if (salary > 0) {
		        this.salary = salary;
		    } else {
		        System.out.println("Salary can't be negative! Setting to 0.");
		        this.salary = 0;
		    }
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary=salary;
		}
		else {
			System.out.println("salary can't be negative");
		}
	}
	
	
	
	
}


public class TestEmployee {

	public static void main(String[] args) {
		Employee e=new Employee("Rakesh", 121, 30000);
		Employee e1=new Employee("karan", 121, -30000);
		System.out.println(e.getSalary());
		System.out.println(e1.getSalary());
		
	}

}
