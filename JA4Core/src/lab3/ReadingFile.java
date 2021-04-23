package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileReader;
		public class ReadingFile {

			public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				FileReader fr = new FileReader("src/mohana.txt");
				BufferedReader br = new BufferedReader(fr);
				System.out.println(br.readLine());

			}

		}
