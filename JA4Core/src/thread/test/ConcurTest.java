package thread.test;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurTest extends Thread{
	//static ArrayList al = new ArrayList();
	static CopyOnWriteArrayList al = new CopyOnWriteArrayList();
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		al.add("java");
	}
public static void main(String[] args) throws Exception{
	al.add("java");
	al.add("apple");
	al.add("mango");
	al.add("buffer");
	al.add("dragan");
	ConcurTest t1 = new ConcurTest();
	t1.start();
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		Thread.sleep(3000);
	}
}

}
