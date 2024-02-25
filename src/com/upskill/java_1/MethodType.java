package com.upskill.java_1;

public class MethodType extends Variables{
	
	public static int hourlyIncome = 65;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodType obj= new MethodType();
		obj.AnnualIncomeVoid();
		System.out.println("My Monthly Income= " + obj.monthlyIncomeReturn());
		weeklyIncomeStatic();
		
		
	}

	//void method 
	public void AnnualIncomeVoid(){
		int calculateAnnualIncome= hourlyIncome * 2000;
		System.out.println("calculateAnnualIncome "+ calculateAnnualIncome);
		
	}
	
	//return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 200;
		return calculateMonthlyIncome;
	}
	
	//Static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome *40;
		System.out.println("calculateWeeklyIncome "+ calculateWeeklyIncome);
	}
	
}
