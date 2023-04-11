package test.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressBook {
	@Value("9146698128")
	private String phoneNumber;
	@Autowired
	private Address tempAddess;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getTempAddess() {
		return tempAddess;
	}
	public void setTempAddess(Address tempAddess) {
		this.tempAddess = tempAddess;
	}
	@Override
	public String toString() {
		return "AddressBook [phoneNumber=" + phoneNumber + ", tempAddess=" + tempAddess + "]";
	}
	

}
