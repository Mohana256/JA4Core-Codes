package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeException {
	public static void Test(int s) throws InvalidSalaryException{
		if(s<3000) {
			throw new InvalidSalaryException("Salary is below 3000");
		}else {
			System.out.println("Salary is more than 3000 that is: "+s);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary");
		int sal = sc.nextInt();
		try {
			Test(sal);
		}catch(Exception ex) {
			System.out.println("Exception occured......"+ex);
		}
		
	}

}
