package javaee3;

public class Arrto {
	//���һ��������ȫ���Ǿ�̬�ķ�������Ҫ˽�й��췽�������������ഴ���������ֱ��������.���ü��ɡ�
	private Arrto(){}
	//1.��ȡ���ֵ
	public int Getmax1(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
			max=arr[i];
			}
			}
		return max;
	}
	//2.����ı���
	public static void prints(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"  ");
		}
	}
	//3.����ķ�ת
	public void xunhuan(int []arr){
		for(int i=0; i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
	}
	
}


