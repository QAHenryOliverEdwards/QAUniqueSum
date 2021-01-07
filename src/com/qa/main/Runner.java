package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Sum sum1 = new Sum(1, 2, 3);
		Sum sum2 = new Sum(3, 3, 3);
		Sum sum3 = new Sum(1, 1, 2);
		
		System.out.println(sum1.countNums());
		System.out.println(sum2.countNums());
		System.out.println(sum3.countNums());
	}

}
