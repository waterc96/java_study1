package io_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Fis1 {

	public static void main(String[] args) {
		File qq=new File("qq.txt");
			try{
				qq.createNewFile();
				System.out.println("文件已创建");
				FileReader x=new FileReader("qq.txt");
				int y=x.read();
				if((y)!=-1) {
					System.out.println(y);
				}
				FileOutputStream z=new FileOutputStream(qq);
				byte[]ye="下午还要补作业。。可恶".getBytes();
				z.write(ye);
				z.close();
				FileInputStream i=new FileInputStream(qq);
				byte byt[]=new byte[2048];
				int len=i.read(byt);
				System.out.println("文件中的信息是："+new String(byt,0,len));
				i.close();
				long length=qq.length();
				System.out.println("长度是"+length);
				
				
			}catch(Exception e){
				e.printStackTrace();
		

	}
		}}

