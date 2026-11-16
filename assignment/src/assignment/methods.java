package assignment;

public class methods {
	static void method1() {
	
		System.out.println("method 1 called");
		
	}
	static void method2() {
		System.out.println("method 2 called");
	}
	void method3() {
		System.out.println("method 3 called");
	
	}
	void method4() {
		System.out.println("method 4 called");
		method1();
		method2();
		method3();
	}
	public static void main(String[] args) {
		methods m1 = new methods();
		m1.method4();
		
		

	}

}
