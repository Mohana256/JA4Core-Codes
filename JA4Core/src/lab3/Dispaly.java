package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dispaly{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\N Mohana\\Documents\\mohana.txt"));
		String str=br.readLine();
		int lineCount=0,wordcount=0,charcount=0;
		while(str!=null) {
			String[] word=str.split(" ");
			wordcount+=word.length;
			for(String w:word) {
				charcount+=w.length();
			}
			lineCount++;
			str=br.readLine();
			
		}
		System.out.println("The num of characters are: "+charcount);
		System.out.println("The num of words are: "+wordcount);
		System.out.println("The num of lines are: "+lineCount);
	}
		
}