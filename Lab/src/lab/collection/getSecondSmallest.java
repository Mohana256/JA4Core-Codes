package lab.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class getSecondSmallest {
	public static void main(String[] args) {
		ArrayList<Integer> hm = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt(),i;
		int ar[] = new int[n];
		System.out.println("Enter array elements: ");
		for(i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		for(int j : ar) {
			hm.add(j);
		}
		Collections.sort(hm);
	System.out.println(hm.get(1));
	}
	

}
