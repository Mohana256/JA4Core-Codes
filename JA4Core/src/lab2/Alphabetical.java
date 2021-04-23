package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabetical {
	public static void sortString(String s1) {
		char s2[] =s1.toCharArray();
		Arrays.sort(s2);
		s1=new String(s2);
		int l=s1.length();
		System.out.println("sorted string is...");
		//System.out.println(s2);
		if(l%2==0) {
			l=l/2;
		}else {
			l=(l/2)+1;
		}
		for(int j=0;j<s1.length();j++) {
			if(j<l) {
				System.out.print(Character.toUpperCase(s1.charAt(j)));
			}else {
				System.out.print(Character.toLowerCase(s1.charAt(j)));
			}
		}
		//int k=s2.length;
		//for(int j=0;j<k/2;j++) {
			//s2[j]=sc.nextLine();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s1 = sc.nextLine();
		sortString(s1);

	}

}
