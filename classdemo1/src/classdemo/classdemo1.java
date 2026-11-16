package classdemo;

public class classdemo1 {
	classdemo1 d1=new classdemo1();
	
	static {
		System.out.println("static block1");
	
	}
	{
		System.out.println("instance block1");
	}

	public static void main(String[] args) {
		
		System.out.println("instance block2");
	}

}
