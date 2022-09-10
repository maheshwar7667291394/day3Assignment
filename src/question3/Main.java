package question3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;

public class Main {
	
	public static Map<String,Student> getSored(Map<String, Student> map){
		
	Comparator<Map.Entry<String,Student>> sortedMap=(s1,s2)->{
		return s1.getValue().getMarks()>s2.getValue().getMarks() ?+1:-1;
		
	};
	Set<Map.Entry<String,Student>> set=map.entrySet();
	Set<Map.Entry<String,Student>> sorte=new TreeSet<>(sortedMap);
	  sorte.addAll(set);
	  
	  LinkedHashMap<String, Student> lmap=new LinkedHashMap<>();
	  
	  for(Map.Entry<String,Student> item:sorte) {
		  lmap.put(item.getKey(), item.getValue());
	  }
 		
		return lmap;
		
	}
	
	public static void main(String[] args) {
		Map<String, Student> hm=new HashMap<>();
		
		hm.put("delhi",new Student(1,"ramlal", 234));
		hm.put("panjab",new Student(2,"mkuamr", 230));
		hm.put("chandigar",new Student(3,"sambhu", 5000));
		hm.put("patna",new Student(4,"ganesh", 100));
		hm.put("afganistan",new Student(8,"kusal", 450));
		hm.put("india",new Student(5,"parera", 600));
		
	  Map<String, Student> result=getSored(hm);
	  
	  Set<Map.Entry<String, Student>> re=result.entrySet();
	  
	  
	  for(Map.Entry<String, Student> item:re) {
		  System.out.println(item.getValue());
	  }

		
	}

}
