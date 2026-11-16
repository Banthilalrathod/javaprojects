package com.javaintroduction;

public class garbage {
	int id;
	String name;
	
	 
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
		
		
	}
		void outscope() {
			garbage g2 = new garbage();
			
		}
			
	
	public static void main(String[] args) {
		garbage g =new garbage();
		System.out.println(g);
		
		garbage g1 =new garbage();
		System.out.println(g1);
		
		garbage g2 =new garbage();
		System.out.println(g2);
// 1.NULLIFYING THE OBJECTS
	// eligible for garbage collection,removes from heap memory
		g=null;
	// when we write g1=null , the gc() method automatically calls finalize method ,
	//we no need to call explicitly
			
// 2.REASSIGNIMG REFERENCE
		g1 = g2;
		
// 3.OUT OF SCOPE
		g2.outscope();
//4.ANONYMOUS OBJECT CREATION	
		new garbage().outscope();
		
		// it calls finalize method automatically,when above above cases are eligible 
		System.gc();
		

	}

}
