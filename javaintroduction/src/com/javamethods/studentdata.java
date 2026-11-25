package com.javamethods;

import java.util.Scanner;

public class studentdata {
	void fullname(String fn , String ln){
		System.out.println("student fullanme is:"+fn+ln);
		
	}
	void age(int st_age) {
		System.out.println("student age is :"+st_age);
	}

	public static void main(String[] args) {

		System.out.println("main method started");
		studentdata s=new studentdata();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student firstname:");
		String fn = sc.nextLine();
		System.out.println("enter student last name");
		String ln= sc.nextLine();
		
		System.out.println("enter student age:");
		int age=sc.nextInt();
		
		
		
		s.fullname(fn,ln);
		s.age(age);
		
		
		System.out.println("main method ended");
	}

}
