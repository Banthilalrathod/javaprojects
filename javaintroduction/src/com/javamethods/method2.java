package com.javamethods;


//1)no return type & no parameters
public class method2 {
	
	void addition(){
		int a=10;
		int b=20;
		System.out.println("addition is " +(a+b));
	}
	void addition1(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition is " +c);
	}
	//System.out.println("addition is " +(a+b));
	//               (or )	
	//int c=a+b;
	//System.out.println("addition is " +c);
		
		void sub() {
		int a=50;
		int b=20; 
		System.out.println("subraction is " +(a+b));
	}
		void multiply(){
			byte a=10;
			short b=20;
			System.out.println("multiplication is "+a*b);	
		}
		void division(){
			int  a=20;
			long b=3;
			System.out.println("division is "+a/b);	
		}
		void module(){
			int  a=10;
			long b=20;
			System.out.println("module is "+a%b);	
		}
	
	public static void main(String[] args) {
		System.out.println("main method started ");
		method2 m=new method2();
		
		m.addition();
		m.addition1();
		m.sub();
		m.multiply();
		m.division();
		m.module();
		System.out.println("main method ended ");


	}

}
