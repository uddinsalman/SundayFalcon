package com.upskill.java_3;

import java.util.HashMap;


public class arrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Boolean> StudentAttendence = new HashMap<String, Boolean >();
		
		StudentAttendence.put("Salman", true);
		StudentAttendence.put("Rasel", false);
		StudentAttendence.put("Mahi", true);
		StudentAttendence.put("Olive", false);
		StudentAttendence.put("SNahian", true);
		
		System.out.println("Student is " + StudentAttendence.get("Salman"));
		
		
		HashSet < Integer > StudentiD = new HashSet <>();
		StudentiD.add(1234);
		StudentiD.add(2345);
		StudentiD.add(3456);
	
		System.out.println( "Studenid :" + StudentiD);
	}

}
