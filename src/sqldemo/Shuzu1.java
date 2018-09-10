package sqldemo;
import java.util.Scanner;

public class Shuzu1 {
	
public static void main(String[] args){
	System.out.println("请输入对应的星期范围在1—7");
	int week=new Scanner(System.in).nextInt();
	System.out.println("星期"+ riqi(week));
}	
//		int []arr={11,22,33,44,55};
//		fanzhuan(arr);
//		print(arr);
//	}
//	public static  void  fanzhuan(int arr[]){
//		for(int i=0;i<arr.length/2;i++){
//			int temp=arr[i];
//			//temp是一个临时变量，在程序中用于替换两个变量而声明的一个临时变量
//			arr[i]=arr[arr.length-1-i];
//			arr[arr.length-1-i]=temp;
//			
//		} 	
//	}
//	public static void print(int arr[]){
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]+" ");
//		}
	public static char riqi(int week){
		char []arr={'，','一','二','三','四','五','六','日'};
		return arr[week];
	}
	public static int chazhao(int [] arr,int value ){
		for(int i=0;i<arr.length;i++){ 				//数组的遍历
			if(arr[i]==value){						//如果数组中的元素与查找的元素相同
				return i;
			}	
		}
		return -1;
	}
}
