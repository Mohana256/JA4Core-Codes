package com.code;

import java.util.Scanner;
public class Fullname {
	public static void validate(String s1,String s2) throws InvalidNameException {
		if(s1.isEmpty() || s2.isEmpty()) {
			throw new InvalidNameException("Invalid name");
		}else {
			System.out.println("Valid");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String s1= sc.nextLine();
		System.out.println("Enter your last name: ");
		String s2 = sc.nextLine();
		try{
		       validate(s1,s2);
		     }catch(Exception ex){
		        System.out.println("Exception occured: "+ex);
		     }

		     //System.out.println("rest of the code...");
		 }
		
	}
