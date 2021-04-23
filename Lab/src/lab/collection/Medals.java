package lab.collection;

import java.util.HashMap;
import java.util.Set;

public class Medals {
	//public static void main(String[] args) {
		public HashMap<String,String>getStudent(HashMap<String,Integer>stu){
		HashMap<String, String> medal = new HashMap<>();
		Set<String> set = stu.keySet();
		for(String s:set) {
			Integer marks =stu.get(s);
			if(marks>=90) {
				medal.put(s,"Gold");
			}else if(marks>=80) {
				medal.put(s, "Silver");
			}else if(marks>=70) {
				medal.put(s, "Bronze");
			}
		}
		return medal;
	}
		public static void main(String[] args) {
			HashMap<String,Integer> stu = new HashMap<>();
			Medals m = new Medals();
			stu.put("123", 65);
			stu.put("124", 76);
			stu.put("126", 89);
			stu.put("127", 90);
			stu.put("128", 93);
			System.out.println(m.getStudent(stu));
			
		}

}
