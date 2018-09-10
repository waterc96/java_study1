package javaee3;

public class Arrto {
	//如果一个方法中全部是静态的方法，需要私有构造方法，不让其他类创建本类对象，直接用类名.调用即可。
	private Arrto(){}
	//1.获取最大值
	public int Getmax1(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
			max=arr[i];
			}
			}
		return max;
	}
	//2.数组的遍历
	public static void prints(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"  ");
		}
	}
	//3.数组的反转
	public void xunhuan(int []arr){
		for(int i=0; i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
	}
	
}


