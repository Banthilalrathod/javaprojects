package com.javamethods;
import java.util.Scanner;
//with return type &without parameters
public class salaryinfo {
	double basicsalary() {
		System.out.println("basic salary is");
		
		return 100.0;
		}
	double rent() {
		System.out.println("rent is ");
		return 100;
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		salaryinfo si=new salaryinfo ();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter basic salary:");
		double bs = sc.nextDouble();
		System.out.println("enter rent:");
		double re = sc.nextDouble();
		double totalsalary=bs+re;
		System.out.println("total salary is :"+totalsalary);

		System.out.println("main method ended");	
		
	}

}
