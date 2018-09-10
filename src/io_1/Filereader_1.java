package io_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader_1 {
	public static  void main(String args[]) throws FileNotFoundException{
		try {
			FileReader s=new FileReader("xxx.txt");
			int x=s.read();
			while((s.read())!=-1){
//			char y=(char) x;
			System.out.println(s.read());
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 

}
