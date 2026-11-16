package com.java;

public class Loader {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("welcome to vcube");
		System.out.println("welcome to java class");
		System.out.println(Class.forName("com.javaintro.Welcome"));
		
	}

}
