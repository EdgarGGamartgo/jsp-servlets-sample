package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents() {
		
		// create an empty list
		
		List<Student> students = new ArrayList<>();
		
		// add sample data
		
		students.add(new Student("Mary", "Public", "mary@gamul.com"));
		students.add(new Student("Edgar", "Public", "edgar@gamul.com"));
		students.add(new Student("Jess", "Public", "jess@gamul.com"));
		
		// return the list
		return students;
		
	}

}
