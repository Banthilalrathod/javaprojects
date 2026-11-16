package javaintroduction;

public class testdemo {

	public static void main(String[] args) {
		System.out.println("main method started");
		method1();
		System.out.println("main method ended");
		
		
	}
	public static void method1() {
		method2();
		System.out.println("method1 called");
	}
	public static void method2() {
		testdemo m3 = new testdemo();
		m3.method3();
		
		System.out.println("method2 called ");
	}
	void method3() {
		testdemo  m4= new testdemo();
		m4.method4();
		
		System.out.println("method3 called");
	}
	void method4() {
		method5();
		System.out.println("method4 called ");
	}
	public static void method5() {
		System.out.println("method5 called ");
	}

}
