package leiXX;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String args[]){
//	@SuppressWarnings("resource")
//	Scanner sc=new Scanner(System.in);//键盘录入
//	int c= sc.nextInt();//键盘录入一个整数存在i中\
//	System.out.print(c);}
	Scanner sc=new Scanner(System.in);
	if(sc.hasNextInt()){
		int i=sc.nextInt();
		System.out.println(i);
	}else
	System.out.println("出错了");
}
}
