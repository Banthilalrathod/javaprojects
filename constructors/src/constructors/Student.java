package constructors;

public class Student {
	int stu_id;
	String stu_name;
	int stu_marks;

	Student(){
		stu_id=01;
		stu_name="ravi";
		stu_marks=90;
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.method1();
		
	}
		void method1() {
			System.out.println("student id is "+stu_id);
			System.out.println("student name is "+stu_name);
			System.out.println("student marks is "+stu_marks);

	}

}
