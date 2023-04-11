package test.classes;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"test.classes"})
public class CustomerConfig {
	
	
	@Bean("order")
	public List<Order> getOrder()
	{
		List<Order> list=new ArrayList();
		Order order1=new Order();
		order1.setOrderNumber(119);
		order1.setOrderAmount(34000.00);
		order1.setOrderDate(LocalDate.now());
		
		Order order2=new Order();
		order2.setOrderNumber(24);
		order2.setOrderDate(LocalDate.now());
		order2.setOrderAmount(56000.00);
		
		list.add(order1);
		list.add(order2);
		
		return list;
		
	}

}
