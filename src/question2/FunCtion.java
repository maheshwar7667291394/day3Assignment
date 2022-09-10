package question2;

import java.util.function.Function;

import question3.Student;

public class FunCtion {
    public static void main(String[] args) {
    	Function<Student, String> fr=s-> "welcome "+s.getName().toUpperCase();
    	
    	System.out.println(fr.apply(new Student(23, "mahesh",890)));
    }
  

}
