package in.interview;

import java.util.ArrayList;
import java.util.List;

class employ {
	private String name;
	private int id;
	private String designation;
	public employ(String name, int id, String designation) {
		this.name = name;
		this.id = id;
		this.designation = designation;
	}
	public void displayempdata() {
		System.out.println("emp name : "+name);
		System.out.println("emp id number : "+id);
		System.out.println("designation is : "+designation);
	}

}
class department{
	private String dname;
	private List<employ> employees;
	public department(String dname, List<employ> employees) {

		this.dname = dname;
		this.employees = employees;
	}




	public void displaydep() {
		System.out.println("department name is : "+dname);
		for(employ emp:employees) {
			emp.displayempdata();
		}
	}
	
}

 public class CompanyDemo {
	public static void main(String[] args) {
		employ e1=new employ("Rakesh", 102, "devloper");
		employ e2=new employ("karan", 103, "tester");
		employ e3=new employ("sahil", 104, "QA");
		
		List<employ> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		department d1 = new department("IT", l1);
		company c1=new company(d1);
		c1.displayCom();
	}
	
	
	
	

}
 class company{
	 private department dept;

		public company(department dept) {
			this.dept = dept;
		}
		public void displayCom() {
			System.out.println("this is company structure");
			dept.displaydep();
		}
 }

