package io_1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Io1 {
public static void main(String args[]) throws IOException{
	FileInputStream f=new FileInputStream("xxx.txt");   //创建流对象
	int x;
	while((x = f.read()) != -1){
		System.out.println(x);
	}	 	
	f.close();
}
}
