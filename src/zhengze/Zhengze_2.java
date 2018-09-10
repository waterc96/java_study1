package zhengze;

import java.util.Arrays;

public class Zhengze_2 {

	public static void main(String[] args) {
		//qie();
		String s="91,27,46,38,50";
		//将字符串切割成字符数组
		String sarr[]=s.split("");
		//将字符串转化成数字并将其存储在一个等长的int数组中
		int[]qarr=new int[sarr.length];
		for (int i = 0; i < qarr.length; i++) {
			qarr[i]=Integer.parseInt(sarr[i]);//将数字字符转化成数字
		}
		Arrays.sort(qarr);//排序
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < qarr.length; i++) {
			if(i==qarr.length-1){
				sb.append(qarr[i]);
			}else{
				sb.append(qarr[i]+" ");
			}
		}
		System.out.println(sb);
	}

	private static void qie() {
		String s="郭美.陈吃藕.螺旋桨";
		String arr[]=s.split("\\.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
