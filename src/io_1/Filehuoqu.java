package io_1;

import java.io.File;

public class Filehuoqu {
public static void main(String args[]){
	File file1=new File("word.txt");
	if(file1.exists()){
		String name=file1.getName();
		long length=file1.length();
		boolean hidden=file1.isHidden();
		System.out.println("文件名称"+name);
		System.out.println("文件长度是"+length);
		System.out.println("该文件是隐藏文件吗？"+hidden);
	}else{
		System.out.println("该文件不存在");
	}
	
}
}
