package com.vendor.demo.services;

import java.util.LinkedHashMap;
import java.util.Map;

public class UtilService {

	public static Map<String, String> getCustomerList() {
		Map<String, String> customers = new LinkedHashMap<String, String>();
		customers.put("MN", "MN");
		return customers;
	}

	public static Map<String, String> getCourses() {
		Map<String, String> courses = new LinkedHashMap<String, String>();
		courses.put("138", "Grrade 3 Math");
		return courses;
	}

	public static Map<String, String> getStandards() {
		Map<String, String> standards = new LinkedHashMap<String, String>();
		standards.put("3.1.1.1", "3.1.1.1");
		standards.put("3.1.1.2", "3.1.1.2");
		standards.put("3.1.1.3", "3.1.1.3");
		standards.put("3.1.1.4", "3.1.1.4");
		standards.put("3.1.1.5", "3.1.1.5");
		standards.put("3.1.2.1", "3.1.2.1");
		standards.put("3.1.2.2", "3.1.2.2");
		standards.put("3.1.2.3", "3.1.2.3");
		standards.put("3.1.2.4", "3.1.2.4");
		standards.put("3.1.2.5", "3.1.2.5");
		standards.put("3.1.3.1", "3.1.3.1");
		standards.put("3.1.3.2", "3.1.3.2");
		standards.put("3.1.3.3", "3.1.3.3");
		
		standards.put("3.2.1.1", "3.2.1.1");
		standards.put("3.2.2.1", "3.2.2.1");
		standards.put("3.2.2.2", "3.2.2.2");
		
		standards.put("3.3.1.1", "3.3.1.1");
		standards.put("3.3.1.2", "3.3.1.2");
		standards.put("3.3.2.1", "3.3.2.1");
		standards.put("3.3.2.2", "3.3.2.2");
		standards.put("3.3.2.3", "3.3.2.3");
		standards.put("3.3.3.1", "3.3.3.1");
		standards.put("3.3.3.2", "3.3.3.2");
		standards.put("3.3.3.3", "3.3.3.3");
		standards.put("3.3.3.4", "3.3.3.4");
		
		standards.put("3.4.1.1", "3.4.1.1");
		
		
		return standards;
	}

}
