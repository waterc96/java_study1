package io_1;

import java.io.File;

public class Filehuoqu {
public static void main(String args[]){
	File file1=new File("word.txt");
	if(file1.exists()){
		String name=file1.getName();
		long length=file1.length();
		boolean hidden=file1.isHidden();
		System.out.println("�ļ�����"+name);
		System.out.println("�ļ�������"+length);
		System.out.println("���ļ��������ļ���"+hidden);
	}else{
		System.out.println("���ļ�������");
	}
	
}
}
