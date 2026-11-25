
package com.javamethods;

import java.util.Scanner;
//2)without return type & with parameters
public class method4 {
	void add(int a,int b){
		System.out.println("sum of a,b is:"+(a+b));

	}
	void sub(int c,int d) {
		System.out.println("subraction of a,b is:"+(c-d));

	}
	void multiply(float x, double y) {
		System.out.println("multiplication of x,y is:"+x*y);
	}



	public static void main(String[] args) {
		method4 m=new method4();
		System.out.println("main method started");
		
		Scanner sc =new Scanner(System.in);
	//addition
		System.out.println("enter a value ;");
		int a =sc.nextInt();
		System.out.println("enter b value"); 
		int b =sc.nextInt();
		m.add(a,b);
		
	//subraction
		System.out.println("enter a value ;");
		int c =sc.nextInt();
		System.out.println("enter b value"); 
		int d =sc.nextInt();
		System.out.println("main method ended");
		m.sub(c,d);
		
	//subraction
		System.out.println("enter a value ;");
		float f1 =sc.nextInt();
		System.out.println("enter b value"); 
		double d1 =sc.nextInt();
		System.out.println("main method ended");
		m.multiply(f1,d1);
		
		
		
		System.out.println("main method ended");
		


	}

}
