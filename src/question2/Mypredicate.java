package question2;

import java.util.List;
import java.util.function.Predicate;

import question3.Student;

public class Mypredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t>15;
	}

	
}


	

	


