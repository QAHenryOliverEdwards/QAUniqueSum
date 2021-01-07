package com.qa.main;

public class Sum {
	
	double number1;
	double number2;
	double number3;
	double totalcount = 0;
	
	public Sum (double num1, double num2, double num3) {
		this.number1 = num1;
		this.number2 = num2;
		this.number3 = num3;
	}
	
	public double countNums() {
		if (this.number1 != this.number2) {
			totalcount += this.number1;
		}
		
		if ((this.number2 != this.number1) && (this.number2 != this.number3)) {
			totalcount += this.number2;
		}
		
		if (this.number3 != this.number2) {
			totalcount += this.number3;
		}
		
		return totalcount;
	}
}
