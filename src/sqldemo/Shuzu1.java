package sqldemo;
import java.util.Scanner;

public class Shuzu1 {
	
public static void main(String[] args){
	System.out.println("�������Ӧ�����ڷ�Χ��1��7");
	int week=new Scanner(System.in).nextInt();
	System.out.println("����"+ riqi(week));
}	
//		int []arr={11,22,33,44,55};
//		fanzhuan(arr);
//		print(arr);
//	}
//	public static  void  fanzhuan(int arr[]){
//		for(int i=0;i<arr.length/2;i++){
//			int temp=arr[i];
//			//temp��һ����ʱ�������ڳ����������滻����������������һ����ʱ����
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
		char []arr={'��','һ','��','��','��','��','��','��'};
		return arr[week];
	}
	public static int chazhao(int [] arr,int value ){
		for(int i=0;i<arr.length;i++){ 				//����ı���
			if(arr[i]==value){						//��������е�Ԫ������ҵ�Ԫ����ͬ
				return i;
			}	
		}
		return -1;
	}
}
