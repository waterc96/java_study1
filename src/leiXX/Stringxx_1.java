package leiXX;

import javaee3.Duotai1;

public class Stringxx_1 {
	public interface person {

	}

	public static void main(String args[]){
		String s1="abc";
		byte[]arr=s1.getBytes();
		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]+" ");
			
		}
		String s2="��������";
		byte[]arr2=s2.getBytes();//ͨ��gbk���뽫�ַ���ת��Ϊ�ֽ�����
		for (int i = 0; i < arr2.length; i++) {//���룺�����ǿ��Ķ���ת��Ϊ��������Ķ���
			System.out.println(arr2[i]+"");//gbk�ص㣺���ĵĵ�һ���ֽڿ϶��Ǹ���
			
		}
		char[]arr1={'a','b','c'};
		String s3=String.valueOf(arr1);
		System.out.println(s3);
	
		Duotai1 mi=new Duotai1();
		String s4=String.valueOf(mi);
		System.out.println(s4);
		
	}
	
} 	
