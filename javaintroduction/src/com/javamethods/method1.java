package com.javamethods;

//no parameters & no return type
public class method1 {
	static void welcome() {
		System.out.println("welcome method called");
	}
	static void hello() {
		System.out.println("hello method called");
	}


	public static void main(String[] args) {
		System.out.println("main method started ");
		welcome();
		hello();

		System.out.println("main method ended ");

	}

}
