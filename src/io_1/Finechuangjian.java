package io_1;

import java.io.File;

public class Finechuangjian {
	public static void main(String[] args) {
	File file=new File("word.txt");
	if(file.exists()){
		file.delete();
		System.out.println("文件已删除");
	}else{
		try{
			file.createNewFile();
			System.out.println("文件已创建");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	}

}
