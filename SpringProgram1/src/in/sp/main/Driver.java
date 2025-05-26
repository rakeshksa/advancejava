package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student2;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("in\\sp\\resources\\applicationContext.xml");
		Student2 stu = (Student2)context.getBean("stdO");
		stu.display(); 

	}

}
