package test.classes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
   @Value("15")
	private long customerId;
	@Autowired
	private AddressBook contactDetails;
	@Autowired
	private List<Order> order;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public AddressBook getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(AddressBook contactDetails) {
		this.contactDetails = contactDetails;
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", contactDetails=" + contactDetails + ", order=" + order + "]";
	}
	

}
