package javaee3;
import java.util.Scanner;
public class Cainum {
	public static void main(String[]args){
		Scanner Sc=new Scanner(System.in);
		System.out.println("������һ����������Χ��1-100֮��");
		int Cainum=(int)(Math.random()*100)+1;
		while(true){
			int result=Sc.nextInt();
			if(result>Cainum){
				System.out.println("�����أ��ɶ�");
			}
			else if(result<Cainum){
				System.out.println("С���أ��ɶ�");
			}
			else{
				System.out.println("����������");
			}
		}
	} 

}
