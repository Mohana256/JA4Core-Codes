package lab.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class Age {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer,Integer>();
		hm.put(1, 16);
		hm.put(2, 20);
		hm.put(3, 13);
		hm.put(4, 21);
		hm.put(5, 22);
		hm.put(6, 24);
		System.out.println(getvoters(hm));
	}
	public static List<Integer> getvoters(LinkedHashMap<Integer,Integer>hm){
		List<Integer> l = new ArrayList<Integer>();
		Iterator<Entry<Integer, Integer>> i = hm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer,Integer> e = i.next();
			if(e.getValue()>=18) {
				l.add(e.getKey());
			}
		}
		return l;
	}
}
		
		