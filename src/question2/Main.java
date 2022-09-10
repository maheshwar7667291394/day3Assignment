package question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import question3.Student;

public class Main {
	public static void main(String[] args) {
		
		List<Student> student=new ArrayList<>();
		
		student.add( new Student(1,"ramlal", 234));
		student.add(new Student(2,"mkuamr", 230));
		student.add(new  Student(3,"sambhu", 5000));
		student.add(new  Student(4,"ganesh", 100));
		student.add(new Student(8,"kusal", 450));
		student.add(new  Student(5,"parera", 600));
		
//		Mypredicate result=new Mypredicate(new Student(2,"mkuamr", 230));
		
//		Predicate<Student> tr=new Mypredicate();
//		System.out.println(tr.test(new Student(2,"mkuamr", 500)));
		
//		student.removeIf(new Mypredicate());
//		for(Student item:student) {
//			System.out.println(item);
//		}
		
		List<Integer> intg=new ArrayList<>();
		intg.add(12);
		intg.add(14);
		intg.add(10);
		intg.add(19);
		intg.add(18);
		
		
		
		
		intg.removeIf(new Mypredicate());
	  System.out.println(intg);
		
		
		
		

		
		
	}

}
