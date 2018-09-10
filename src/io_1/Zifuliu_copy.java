package io_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zifuliu_copy {
public static void main(String args[]) throws IOException{
	FileReader p=new FileReader("xxx.txt");
	FileWriter b=new FileWriter("zzz.txt");
	int c;
	while((c=p.read())!=-1){
		b.write(c);
	}
	p.close();
	b.close();
}
}
