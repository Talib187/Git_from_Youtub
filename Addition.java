package com.java_programs;

import java.util.Scanner;

public class Addition {
	
	// Addition of two number using parametrized method.
	
	
	public float getadd(float input1, float input2) {
		
		float add = input1+input2;
		
		return add;
		
	}
	
	public static void main(String[] args) {
		
		 Addition obj	= new Addition();
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pleae enter two number for addition");
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
	   
	  float output =  obj.getadd(a, b);
	   
	
		System.out.println(output);
				
		
		
	}

}
