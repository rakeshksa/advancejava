package in.interview;

class student{
	private String name;
	private int id;
	private String cname;
	Address address;
	public student(String name, int id, String cname, Address address) {
		
		this.name = name;
		this.id = id;
		this.cname = cname;
		this.address = address;
	}
	public void Display() {
		System.out.println("student name : "+name);
		System.out.println("student id : "+id);
		System.out.println("student cname : "+cname);
		address.display();
	}
	
	
}

class Address{
	private String city;
	private String state;
	public Address(String city, String state) {
		
		this.city = city;
		this.state = state;
	}
	public void display() {
		System.out.println("city name : "+city);
		System.out.println("State name : "+state);
	}
	
}

public class Studentdemo {

	public static void main(String[] args) {
		Address a1=new Address("bengaluru", "karnataka");
		Address a2 = new Address("nimapada", "puri");
		
		student s1 = new student("Rakesh", 101, "jspider", a1);
		student s2 = new student("karan", 102, "high school", a2);
		s1.Display();
		System.out.println("============================");
		s2.Display();

	}

}
