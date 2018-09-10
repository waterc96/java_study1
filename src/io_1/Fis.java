package io_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fis {
	public static void main(String args[]) throws FileNotFoundException{
		File file=new File("d://ss//xx.txt");
		try {
			FileOutputStream out=new FileOutputStream(file);
			//创建fileoutputstream对象
			byte buy[]="我也想有一头小毛驴，上学天天骑".getBytes();
			//创建byte型数组
			out.write(buy);//将数组中的信息写到文件中
			out.close();
			FileInputStream in = new FileInputStream("d://ss//xx.txt");
			//创建fileinputstream类对象
			byte byt[]=new byte[2048];
			int len=in.read(byt);//从文件中读取信息
			System.out.println("文件中的信息是："+new String(byt,0,len));
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
