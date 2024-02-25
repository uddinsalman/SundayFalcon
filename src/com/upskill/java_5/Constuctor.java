package com.upskill.java_5;

public class Constuctor {
	
	String studentName;
	int studentAge;

	public Constuctor(String name, int age){
		studentName= name;
		studentAge= age;
			
	}
	
	public Constuctor(String name){
		studentName= name;
	}
	public Constuctor(int age){
		studentAge= age;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constuctor obj = new Constuctor("upskill", 25);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);
		
		Constuctor obj2 = new Constuctor("upskill");
		System.out.println(obj2.studentName);
		
		Constuctor obj3 = new Constuctor(27);
		System.out.println(obj3.studentAge);
	}

}
