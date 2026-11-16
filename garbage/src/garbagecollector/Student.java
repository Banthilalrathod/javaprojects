package garbagecollector;

public class Student {
	static void method1() {
		System.out.println("method 1 called ");
	}
	void method3() {
		System.out.println("method 3 called ");
	}
	
	void method2() {
		System.out.println("method 2 called");
	}




	public static void main(String[] args) {
		
		
		Student m1 = new Student();
		m1.method3();
		m1.method2();
		method1();
		




	}
}
