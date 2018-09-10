package javaee3;
import java.util.Scanner;
public class Cainum {
	public static void main(String[]args){
		Scanner Sc=new Scanner(System.in);
		System.out.println("请输入一个整数，范围在1-100之间");
		int Cainum=(int)(Math.random()*100)+1;
		while(true){
			int result=Sc.nextInt();
			if(result>Cainum){
				System.out.println("大了呢，可恶");
			}
			else if(result<Cainum){
				System.out.println("小了呢，可恶");
			}
			else{
				System.out.println("终于中了呢");
			}
		}
	} 

}
