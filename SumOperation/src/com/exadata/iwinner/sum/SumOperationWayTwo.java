package com.exadata.iwinner.sum;

public class SumOperationWayTwo {

	
	int p=100;// INstance (class level) variable
	
	static int z=400; //static variable
	public void sum(int numberOne,int numberTwo){
		
		// Sum is local variable
		int sum=numberOne+numberTwo;
		
		System.out.println("Sum of 2 Numebrs =>"+sum);
	}
	public static void main(String anji[]){
		
		SumOperationWayTwo obj=new SumOperationWayTwo();
		
		
		// Local Variable 
		int x=10;
		int y=20;
		
		obj.sum(x, y);
	}
	
	
	
}
