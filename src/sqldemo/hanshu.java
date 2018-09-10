package sqldemo;

public class hanshu {

public static void  main(String[] args){
  drow(5,4);
  cfb(10);
}
//一个矩形
public static int drow(int chang,int kuan){
	for(int x =0;x<=chang;x++){
	for(int y=0;y<=kuan;y++){		
		System.out.print("*");
		
}
	System.out.println();
}
	return 0;
	
}
//一个方法，加法
static int add(int a,int b){
return a+b;
}
//一个乘法表
public static  void cfb(int num){
	for(int a=1;a<=num;a++){
		for(int b=1;b<=a;b++){
			System.out.println(b+"*"+a+"="+b*a);
		}
		System.out.println();
	}
} 
}