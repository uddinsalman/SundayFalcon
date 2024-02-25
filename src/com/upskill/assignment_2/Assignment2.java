package com.upskill.assignment_2;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s;
		for (s=50; s>=1 ; s--){
			System.out.println(s+ " ");
		}
		
		
		 int grade = 70;
			
		 if (grade < 60){
			 System.out.println("Fail");
		 }
		 else if (grade >=60 & grade < 70 ) {
			 System.out.println("grade D");
		 }
		 else if (grade >= 70 & grade < 80) {
			 System.out.println("grade c");
		 }
		 else if (grade >= 80 & grade <90) {
			 System.out.println("grade b");
		 }
	
		 else {
				 System.out.println("grade A");
		 }
		 
	
		 
		int a= 5;
		int b= 10;
		
		if (a>b);{
		System.out.println( a + " is the smaller number");
		}
		if (a<b);{
			System.out.println( b + " is the bigger number");
		}
		
		 
		
		for (int i=1; i<500; i=i*2) {
			System.out.println("Double Values " + i);
		}
	}

}
