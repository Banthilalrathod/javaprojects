package com.javaintroduction;

public class testdemo1 {
	static testdemo1 t1 = new testdemo1();

	static {

		System.out.println("method 1 called");
		System.out.println(Thread.currentThread());
	}
	{
		System.out.println("instance method called");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");	
		System.out.println("main method ended ");
	}
	static {
		System.out.println("method 3 called ");
	}

	
	static {
		System.out.println("method 2 called");
	}

}
