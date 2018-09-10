package sqldemo;

public class shuzu {
	public static void main(String[] args) {
//	int abc[]=new int[3];//动态初始化，在内存中开辟出5块连续的空间
//	int abc1[]=new int[3];
//	System.out.println(abc);//系统给出的默认化初始值，整数类型的都是0
//	System.out.println(abc1);
//	System.out.println("--------------------------------");
//	abc[0]=10;
//	abc1[2]=20;
//	System.out.println(abc[0]);
//	System.out.println(abc[1]);
//	System.out.println(abc[2]);
//	System.out.println("---------------------------------");
//	System.out.println(abc1[0]);
//	System.out.println(abc1[1]);
//	System.out.println(abc1[2]);
//	System.out.println("---------------------------------");
//	/*
//	 数组的遍历--标准格式：for(int i=0;i<arr.length;i++){
//	 System.out.println(arr[i])
//	 }
//	  */
//	int[] arr ={11,22,23,24};
//	print(arr);
//	}
//	public static void print(int[] arr){
//		for(int i= 0; i<arr.length; i++){
//			System.out.println(arr[i]+"");
//		}
//	}
	int[] brr={56,65,87,69,23,12,89};
	int max =GetMax(brr);
	System.out.println(max);
	}
	
	
	public static int GetMax(int[] brr){
		int max=brr[0];
		for(int i=1;i<brr.length;i++){
			if(max<brr[i]){
				max=brr[i];
			}
		}
		return max;
	}
	
}
  