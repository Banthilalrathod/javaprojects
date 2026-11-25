package com.javamethods;
import java.util.Scanner;

public class empsalary {
	Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		System.out.println("main method started:");
		empsalary em=new empsalary();
		double ba = em.basic();
		double re = em.rent();
		double sl =em.specialallowance();
		
		double totalsalary=ba+re+sl;
		System.out.println("total salary:"+totalsalary);
	}
	double basic() {
		System.out.println("enter basic salary:");
		double ba=sc.nextDouble();
		return ba;
		
			
		}
	double rent() {
		System.out.println("enter rent");
		double re=sc.nextDouble();
		return re;
	}
	double specialallowance() {
		System.out.println("enter special allowance:");
		double sl = sc.nextDouble();
		return sl;
	}
		
		
}

	


