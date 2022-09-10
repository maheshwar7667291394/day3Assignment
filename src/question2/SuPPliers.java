package question2;

import java.util.function.Supplier;

import question3.Student;

public class SuPPliers {
	
	public static void main(String[]args) {
		
		Supplier<Student> s=()->new Student(23,"hiralal", 90);
		System.out.println(s.get().getName());
		
	}

}
