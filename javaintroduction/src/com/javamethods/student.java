package com.javamethods;

import java.util.Scanner;

public class student {
	static void stufullname(String fname,String lname){
		System.out.println("student fullname:"+fname +""+ lname);

	}
	static void stuage(int age) {
		System.out.println("student age:"+age );


	}
	public static void main(String[] args) {
		System.out.println("main method started");

		student s=new student();

		Scanner sc =new Scanner(System.in);

		System.out.println("enter first name");
		String fn = sc.nextLine();
		System.out.println("enter last name");
		String ln = sc.nextLine();


		System.out.println("enter age");
		int age = sc.nextInt();
		s.stufullname(fn,ln);
		s.stuage(age);



		System.out.println("main method ended");




	}

}
