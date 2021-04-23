package thread.test;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectCnc {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java");
		al.add("apple");
		al.add("mango");
		al.add("buffer");
		al.add("dragan");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			al.add("hello");
		}
		
	}

}
