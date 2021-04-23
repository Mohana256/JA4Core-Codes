package lab.collection;

import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String t = sc.next();
		HashMap<Character,Integer> mm = new HashMap<>();
		char[] st = t.toCharArray();
		for(char c : st) {
			if(mm.containsKey(c)) {
				mm.put(c, mm.get(c)+1);
			}
			else {
				mm.put(c, 1);
			}
		}
		System.out.println(t+":"+mm);
	}
	
}
