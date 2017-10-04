package com.exadata.iwinner.sum;

public class SumOperationWayFour {

	int x=30;
	int y=40;
	public void sum(){
		
		int sum=x+y;
		
		System.out.println("Sum of 2 numbers is ==>"+sum);
	}
	public static void main(String[] args) {
		
		
		SumOperationWayFour obj=new SumOperationWayFour();
		
		obj.sum();
	}
}
