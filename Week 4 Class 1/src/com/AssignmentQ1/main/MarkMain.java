package com.AssignmentQ1.main;

public class MarkMain {

	public static void main(String[] args) {

		MarkProcess m1 = new MarkProcess(1123, 50);
		MarkProcess m2 = new MarkProcess(1164, -50);
		
		try {
			
			m1.validation();
			m1.result();
			
			m2.validation();
			m2.result();	
		} 
		
		catch (IllegalMarkException e) {
			System.out.println(e.getMessage());
		}
	}
}