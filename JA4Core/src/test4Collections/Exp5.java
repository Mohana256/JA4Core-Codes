package test4Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Exp5 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		// TODO Auto-generated method stub
		hm.put("java", 8);
		hm.put("spring", 4);
		hm.put("java", 9);
		hm.put("hyd", 100);
		hm.put("blr", 12);
		hm.put("blr", 6);
		System.out.println(hm);
		
		LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<>();
		// TODO Auto-generated method stub
		hm1.put("java", 8);
		hm1.put("spring", 4);
		hm1.put("java", 9);
		hm1.put("hyd", 100);
		hm1.put("blr", 12);
		hm1.put("blr", 6);
		System.out.println(hm1);
		
		Iterator<Entry<String,Integer>> itr = hm1.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> et = itr.next();
			System.out.println("Key : "+et.getKey()+" Value : "+et.getValue());
		}

	}

}
