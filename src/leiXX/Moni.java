package leiXX;
import java.util.Scanner;
public class Moni {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
		System.out.println("请输入用户名");
		String username=sc.nextLine();//将键盘录入的用户名存储在username中。
		System.out.println("请输入密码");
		String passworld=sc.nextLine();
		//如果是字符串常量与字符串常量比较，通常都是字符串常量调用方法，将变量当做参数传递，防止空指针异常。
		if("admin".equals(username)&&"admin".equals(passworld)){
			System.out.println("欢迎"+username+"登录");
			break;
		}else{
			if(i==2){
				System.out.println("gun");
			}else{
			System.out.println("用户名或密码错误,你还有"+(2-i)+"次机会");
		}
		}
	} 
	}
}
