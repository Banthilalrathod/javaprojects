package com.javamethods;

import java.util.Scanner;
//2)without return type & with parameters
public class method3 {
	void add(int a,int b){
		System.out.println("addition is "+(a+b));

	}
	void sub(int a,int b) {
		System.out.println("subraction "+(a-b));

	}
	void mul(int a,int b) {
		System.out.println("multiplication "+(a*b));
	}

	void div(int a,int b) {
		System.out.println("division "+(a/b));
	}

	void mod(int a,int b) {
		System.out.println("module "+(a%b));
	}


	public static void main(String[] args) {
		System.out.println("main method started");

		method3 m=new method3();
		m.add(10,20);
		m.sub(200,100);
		m.mul(20,10);
		m.div(50,20);
		m.mod(200,12);



		System.out.println("main method ended");


	}

}
