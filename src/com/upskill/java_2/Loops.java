package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	PracticeForLoop();
	//	PracticeForLoopUp();
	//	whileLoop();
	//	doWhileLoop();
	//	infiniteLoop();
		nestedLoop();

//	public static void PracticeForLoop(){
		//int i; 
		//for (i = 10; i >= 1; i--){
			//System.out.println(i);
		}
	//	}
		
		public static void PracticeForLoopUp(){
			int i; 
			for (i = 1; i <= 10; i++){
				System.out.println(i);
			}
	}
		
		public static void whileLoop(){
			int i= 1;
			while(i <= 10){
				System.out.println("while loops = " +i); 
				i++;
			}
		}
		
		public static void doWhileLoop(){
			int i = 1;
			do{
				System.out.println("do while loop number = " + i);
				i++;
			} while (i <= 10);
			
		}
		
		public static void infiniteLoop(){
			int i; 
			for (i = 1; ; i++){
				System.out.println(i);
			}
		}
		
		public static void nestedLoop(){
			int i; 
			int j;
			for (i = 1; i <= 10; i++){
				for (j = 1; j <= 10; j++){
					int multiplicationTable = i * j;
					System.out.print(multiplicationTable + " ");
				}
			
				System.out.println(" ");
			}
		}
}
