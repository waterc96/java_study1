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
			//����fileoutputstream����
			byte buy[]="��Ҳ����һͷСë¿����ѧ������".getBytes();
			//����byte������
			out.write(buy);//�������е���Ϣд���ļ���
			out.close();
			FileInputStream in = new FileInputStream("d://ss//xx.txt");
			//����fileinputstream�����
			byte byt[]=new byte[2048];
			int len=in.read(byt);//���ļ��ж�ȡ��Ϣ
			System.out.println("�ļ��е���Ϣ�ǣ�"+new String(byt,0,len));
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
