package zhengze;

import java.util.Arrays;

public class Zhengze_2 {

	public static void main(String[] args) {
		//qie();
		String s="91,27,46,38,50";
		//���ַ����и���ַ�����
		String sarr[]=s.split("");
		//���ַ���ת�������ֲ�����洢��һ���ȳ���int������
		int[]qarr=new int[sarr.length];
		for (int i = 0; i < qarr.length; i++) {
			qarr[i]=Integer.parseInt(sarr[i]);//�������ַ�ת��������
		}
		Arrays.sort(qarr);//����
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
		String s="����.�³�ź.������";
		String arr[]=s.split("\\.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
