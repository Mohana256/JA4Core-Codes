package lab.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SquareMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements you want to store: ");
		int ar = sc.nextInt(),i;
		int[] arr = new int[ar];
		System.out.println("Enter array elements");
		for(i=0;i<ar;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		for(int j : arr) {
			hm.put(j, j*j);
		}
		Iterator<Integer> it = hm.keySet().iterator();
		while(it.hasNext()) {
		Integer key = it.next();
		System.out.println(key+" : "+hm.get(key));
	}
	}

}
