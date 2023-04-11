package test.main;
import test.classes.DBConfig;
import test.classes.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.classes.EmployeeDAO;

public class Driver1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("test1.xml");
	    EmployeeDAO empDAO =(EmployeeDAO)context.getBean("EmpDAO");
	    System.out.println(empDAO);
	}
}
