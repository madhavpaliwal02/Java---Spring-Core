package com.stereotype;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//	StereoType Annotations
//@Component		// Default("driver")
@Component("don")		// Parameterized used to declare variable name explicitly
@Scope("prototype")
public class Driver {

	@Value("Madhav Paliwal")
	private String name;
	@Value("1234")
	private int vehNo;
	@Value("Agar Malwa")
	private String city;
	@Value("#{mymap}")
	private Map<String, Integer> rate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVehNo() {
		return vehNo;
	}
	public void setVehNo(int vehNo) {
		this.vehNo = vehNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Driver [name=" + name + ", vehNo=" + vehNo + ", city=" + city + "]";
	}
	public Map<String, Integer> getRate() {
		return rate;
	}
	public void setRate(Map<String, Integer> rate) {
		this.rate = rate;
	}
	
	
}
