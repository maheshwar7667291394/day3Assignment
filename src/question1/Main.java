package question1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
	
	public static Map<String, Student> ShortedMap(Map<String,Student> map){
		
		Comparator<Map.Entry<String, Student>> sort=(s1,s2)->{
			
			return s1.getValue().getMarks()>s2.getValue().getMarks() ?+1:-1;
		};
		
		Set<Map.Entry<String, Student>> set=map.entrySet();
		
		Set<Map.Entry<String,Student>> sortedset= new TreeSet<>(sort);
		
		sortedset.addAll(set);
		
	LinkedHashMap<String,Student> finalset=new LinkedHashMap<>();
	for(Map.Entry<String,Student> item:sortedset) {
		finalset.put(item.getKey(),item.getValue());
	}
		
		
		return finalset;
	}
	
	
	public static void main(String[] args) {
		
		Map<String,Student> hm=new HashMap<>();
		hm.put("india", new Student(11,"mahes","mkuamr@gmai", 500));
		hm.put("japan", new Student(12,"hirala","kklluamr@gmai", 300));
		hm.put("usa", new Student(13,"ramlal","mkuamr@gmai", 600));
		hm.put("pok", new Student(14,"viany","mkuamr@gmai", 300));
		hm.put("rus", new Student(15,"ramlal","mkuamr@gmai", 200));
		
		Map<String,Student> sorted=ShortedMap(hm);
        Set<Map.Entry<String, Student>> etr=sorted.entrySet();
        for(Map.Entry<String, Student> item:etr) {
        	System.out.println(item.getValue());
        }
		
		
	}

}
