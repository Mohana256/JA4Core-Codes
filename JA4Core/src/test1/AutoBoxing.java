package test1;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 2345;
		Long l1 = new Long(l);//wrapper class....using object
		//we are converting fundamental to wrapper classes using objects
		System.out.println(l1);
		System.out.println(l);
		Double d = new Double(34.55);// Auto unboxing
		double dd = d;
		System.out.println(dd);
		System.out.println(d);
		String str1 = String.valueOf(l);
		String str2 = String.valueOf(dd);//converting to string from numerical data
		System.out.println(Long.toString(2345));
		System.out.println(str1);
		

	}

}
