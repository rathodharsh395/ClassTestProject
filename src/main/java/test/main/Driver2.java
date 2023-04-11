package test.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test.classes.*;

public class Driver2 {
	public static Customer loadAddresBook()
	{
		ApplicationContext  context=new AnnotationConfigApplicationContext(CustomerConfig.class);
		
		Customer c=	context.getBean("customer", Customer.class);
		return c;
	}
	

	public static void main(String[] args) {
		
		 System.out.println(loadAddresBook());
		
	}
}
