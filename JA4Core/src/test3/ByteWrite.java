package test3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ByteWrite {

	public static void main(String[] args) throws Exception {
		File fle = new File("src/Write.txt");
		FileOutputStream fout = new FileOutputStream(fle);
		String msg = "Hello this is file handling example using byte stream";
		fout.write(msg.getBytes());
		System.out.println("Done....");
		

	}

}
