package com.mitali.assignment.utilities;

import com.mitali.assignment.emolyoee.Developer;
import com.mitali.assignment.emolyoee.Manager;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		
		m.setName("Mitali");
		m.setEmplyoeeId(1);
		m.setSalary(150);
		m.setDepartment("it");
		Developer d = new Developer();
		d.setProgramminLanguage("Java");
		
		System.out.println("name : " +m.getName());
		System.out.println("employee id : "+m.getEmplyoeeId());
		System.out.println("salary : "+m.getSalary());
		System.out.println("department name : "+m.getDepartment());
		System.out.println("developer programming launguage : "+d.getProgramminLanguage());

	}

}
