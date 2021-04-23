package test4Collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exp6 {//TreeMap??it gives data in natural sorting order//it gives priority to captial 
	//letter and not allow duplicates....

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> tm1 = new TreeMap<>();
		tm1.put("java", 8);
		tm1.put("spring", 4);
		tm1.put("java", 8);
		tm1.put("hyd", 100);
		tm1.put("Blr", 12);
		tm1.put("blr", 6);
		tm1.put("asus", 300);
		tm1.put("DELL", 300);
		tm1.put("python", 40);
			
		System.out.println(tm1);
		
		Iterator<Entry<String, Integer>> itr = tm1.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> et = itr.next();
			System.out.println("Key : "+et.getKey()+" Value : "+et.getValue());
		}
		

	}

}
