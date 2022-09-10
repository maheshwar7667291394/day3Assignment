package question2;

import java.util.function.Consumer;

import question3.Student;

public class consUmer {
	
	public static void main(String[] args) {
		Consumer<Student> c=s->{
			System.out.println(s.getName());
			System.out.println(s.getMarks());
			System.out.println(s.getRoll());
		};
		c.accept(new Student(29,"ramlal", 890));
		
	}
	
	
	
	
	
	

}
