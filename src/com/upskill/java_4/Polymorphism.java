package com.upskill.java_4;

import com.upskill.java_1.MethodType;

/* Polymorphism is the ability of an object to take on many forms.
- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
public class Polymorphism extends MethodType{

	public static void main(String[] args) {
	 car(4,4);
	 Polymorphism obj = new Polymorphism();
	 obj.AnnualIncomeVoid();
	}
		// TODO Auto-generated method stub
		public static void car (){
			System.out.println("My car is a tesla!");
		}
			public static void car (int door){
				System.out.println("My car is a tesla, it has door: " + door);	
			}
			
			public static void car (String color){
				System.out.println("My car is a tesla, it has color: " + color);
			}
			
			public static void car (boolean motor){
				System.out.println("My car is a tesla, it has motor: " + motor);
			}
			public static void car (int seat, String bodytype){
				System.out.println("My car is a tesla, it has seat : "+ seat +"it has bodytype" + bodytype);
			
			}
			public static void car (int door, int wheels){
				System.out.println("My car is a tesla, it has door : "+ door +" it has wheels" + wheels);
			
			}
}




