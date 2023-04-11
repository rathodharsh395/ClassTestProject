package test.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("moti Sadan")
	private String houseName;
	@Value("ram mandir road")
	private String street;
	@Value("Mumbai")
	private String city;
	@Value("Maharastra")
	private String state;
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseName=" + houseName + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	

}
