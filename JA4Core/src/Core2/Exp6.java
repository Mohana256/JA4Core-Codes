package Core2;

public class Exp6 {
	static int pincode;//static data 	`
	int atmpin;// non static data stored in heap area
	

	public static void main(String[] args) {//string class properties example
		 
		String str1 = "java"; //by string literal method//pool area
		String str3 = "java";//it stores in pool area
		String str5 = "bvrit";
	    //String str7 = null;
		
		String str4 = new String("java"); //heap memeory //constant area
		String str2 = new String("java");
		
         System.out.println(str1==str3);//true
         System.out.println(str1==str2); //false
         System.out.println(str2==str4);// double equal checks only refrence //false due to new operator hashcode same
         System.out.println(str1.equals(str4)); //it checks for value in variable//true
         System.out.println(str4.equals(str2));//true
         System.out.println(str1 == str5);//false hashcode diff
         System.out.println(str2.hashCode());
         System.out.println(str4.hashCode());
         System.out.println(str1.hashCode());
         System.out.println(str3.hashCode());
         System.out.println(str5.hashCode());
         StringBuffer sb= new StringBuffer(str1);
         sb.append(1.8);
         System.out.println(sb);
         //System.out.println(str4.hashCode());
	}// total three objects are there and 6 references are created
	// literal is string pool area. new operator is string constant area.

}
