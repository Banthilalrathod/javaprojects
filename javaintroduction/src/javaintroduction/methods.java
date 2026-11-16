package javaintroduction;

public class methods {
	  static  void hello(){
		System.out.println("hello java");


	}
	void welcome(){
		System.out.println("welcome method called");
	}

// we have only one thread in this program --main() tread.
public static void main(String[] args) {
	
	System.out.println("main method started ");
	hello();
	methods m = new methods();
	m.welcome();
	System.out.println("main method ended");
	
	
	}
 	

}

