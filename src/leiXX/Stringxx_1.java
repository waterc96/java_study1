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
		String s2="兰州兰州";
		byte[]arr2=s2.getBytes();//通过gbk编码将字符串转化为字节数组
		for (int i = 0; i < arr2.length; i++) {//编码：把我们看的懂得转化为计算机看的懂得
			System.out.println(arr2[i]+"");//gbk特点：中文的第一个字节肯定是负数
			
		}
		char[]arr1={'a','b','c'};
		String s3=String.valueOf(arr1);
		System.out.println(s3);
	
		Duotai1 mi=new Duotai1();
		String s4=String.valueOf(mi);
		System.out.println(s4);
		
	}
	
} 	
