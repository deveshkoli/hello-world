package com.AssignmentQ1.main;

public class MarkProcess {

	private int regno;
	private int marks;
	
	public MarkProcess() {
	}

	public MarkProcess(int regno, int marks) {
		super();
		this.regno = regno;
		this.marks = marks;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void validation() throws IllegalMarkException {
		if (marks < 0) 
			throw new IllegalMarkException(marks+ " is Illegal Mark");
	}
	
	public void result() throws IllegalMarkException {
		 if (marks >= 40)
			 System.out.println("PASS");
		 else
			 throw new IllegalMarkException ("FAIL");
	}
}