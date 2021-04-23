package lab.collection;

//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.Map.Entry;
import java.util.TreeMap;

public class Hashing1 {
	public static void main(String[] args) {
		TreeMap<String, Integer> hm = new TreeMap<>();
		// TODO Auto-generated method stub
		hm.put("Java", 8);
		hm.put("Spring", 4);
		hm.put("Java", 9);
		hm.put("Hyd", 100);
		hm.put("Blr", 12);
		hm.put("Blr", 6);
		System.out.println(hm);
		
		/*LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<>();
		// TODO Auto-generated method stub
		hm1.put("java", 8);
		hm1.put("spring", 4);
		hm1.put("java", 9);
		hm1.put("hyd", 100);
		hm1.put("blr", 12);
		hm1.put("blr", 6);
		System.out.println(hm1);
		*/
		/*Iterator<Entry<String,Integer>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> et = itr.next();
			System.out.println("Key : "+et.getKey()+" Value : "+et.getValue());
		}*/

	}

}

