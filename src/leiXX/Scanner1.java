package leiXX;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String args[]){
//	@SuppressWarnings("resource")
//	Scanner sc=new Scanner(System.in);//����¼��
//	int c= sc.nextInt();//����¼��һ����������i��\
//	System.out.print(c);}
	Scanner sc=new Scanner(System.in);
	if(sc.hasNextInt()){
		int i=sc.nextInt();
		System.out.println(i);
	}else
	System.out.println("������");
}
}
