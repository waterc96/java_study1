package zhengze;

public class Fengzu {
	public static void main(String[]args){
		demo1();
		demo2();
		String s3="我我我我我我我爱爱爱爱中国国国";
		String f1=s3.replaceAll("(.)\\1+", "$1");//$1代表第一组中的内容
		System.out.println(f1);
	}

	private static void demo2() {
		String s2="qqqsdsddffffasdsdmmmmcb";
		String f="(.)\\1+";//＋代表第一组出现一次到多次哦
		String arr[]=s2.split(f);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	private static void demo1() {
		String s="(.)\\1(.)\\2";//(.)代表任意字符//1代表第一组字符又出现一次
		System.out.println("快快乐乐".matches(s)); 
		String s1="(..)\\1";
		System.out.println("德玛德玛".matches(s1));
	}

}
