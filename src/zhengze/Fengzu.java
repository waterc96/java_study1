package zhengze;

public class Fengzu {
	public static void main(String[]args){
		demo1();
		demo2();
		String s3="�������������Ұ��������й�����";
		String f1=s3.replaceAll("(.)\\1+", "$1");//$1�����һ���е�����
		System.out.println(f1);
	}

	private static void demo2() {
		String s2="qqqsdsddffffasdsdmmmmcb";
		String f="(.)\\1+";//�������һ�����һ�ε����Ŷ
		String arr[]=s2.split(f);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	private static void demo1() {
		String s="(.)\\1(.)\\2";//(.)���������ַ�//1�����һ���ַ��ֳ���һ��
		System.out.println("�������".matches(s)); 
		String s1="(..)\\1";
		System.out.println("�������".matches(s1));
	}

}
