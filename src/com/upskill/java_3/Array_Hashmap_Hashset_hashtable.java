package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array
		int age = 30;								// variable
		
		int [] ageFalcon = new int [] {25, 30, 28, 40, 35 };    // array
		
		                 //array index [0] [1] [2] [3] [4] 
		System.out.println("student age ; " + ageFalcon[3]);
		System.out.println("total student : " + ageFalcon.length);
		
		String[] nameFalcon = new String[]{"Salman", "Uddin", "Adam"};
		
		System.out.println("Student name ; " + nameFalcon [1]);
		System.out.println("total student count : " + nameFalcon.length);
		
		boolean [] attendanceFalcon = new boolean []{true, false, true};
		
		System.out.println("student attendence ; " +attendanceFalcon [1]);
		
		
		//multi Dimentional array 
		int [][] ageFalcon2D = {{25, 30, 28, 40, 35},
								{26, 31, 29, 41, 36}};
		System.out.println("Student Age 2D ; " + ageFalcon2D[1][3]);
		
		
		// HashMap- use key-value pair
		
		HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
		StudentAge.put("Salman", 27);
		StudentAge.put("Uddin", 31);
		StudentAge.put("Adam", 28);
		
		System.out.println("Hashmap Student Age; " + StudentAge.get("Salman"));
	
		
		HashMap<String, String> StateCity = new HashMap<String, String>();
		StateCity.put("NewYork", "Albany");
		StateCity.put("Ct", "Bridgeport");
		StateCity.put("NewJersey", "Patterson");
		System.out.println("Hashmap State City; " + StateCity.get("Ct"));
		
		//HashTable- no duplicate uses key-value input
	
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("NewYork", "America");
		Region.put("India", "Asia");
		Region.put("Colombia", "South America");
		System.out.println("Hashtable Region; " + Region.get("India"));
		
		
		//HashSet 
		HashSet<String> car = new HashSet<>();
		car.add("BMW");
		car.add("Tesla");
		car.add("Audi");
		car.add("Ford");
		car.add("Acura");
		System.out.println("car: " +car);
		
		HashSet < Integer > StudentiD = new HashSet <>();
		StudentiD.add(1234);
		StudentiD.add(2345);
		StudentiD.add(3456);
	
		System.out.println( "Studenid :" + StudentiD);
		
	}

	
}


