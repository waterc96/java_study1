package io_1;

import java.io.File;

public class Finechuangjian {
	public static void main(String[] args) {
	File file=new File("word.txt");
	if(file.exists()){
		file.delete();
		System.out.println("�ļ���ɾ��");
	}else{
		try{
			file.createNewFile();
			System.out.println("�ļ��Ѵ���");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	}

}
