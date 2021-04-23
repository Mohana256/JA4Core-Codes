package test4Collections;

import java.util.Set;
import java.util.TreeSet;

public class Exp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set t = new TreeSet();//only numerical or characters that is one type of data
		//orelse do typecast//it gives in sorted order...
		Set<String> ts = new TreeSet<String>();//it takes only string//generics means what type of data you want
		ts.add("java");
		ts.add("mohana");
		ts.add("vishwa");
		ts.add("vihan");
		System.out.println(ts);
		System.out.println(ts.contains("java"));
		

	}

}
