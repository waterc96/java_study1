package zhengze;

public class Zhengze1 {
public static void main(String args[]){ 
	System.out.println(Ckqq("12312312"));
	System.out.println(Ckqq("012312312"));
	demo();

}
public static void demo() {
	String re="[1,9]\\d{4,14}";
	System.out.println("056456455".matches(re));
}
public static boolean Ckqq(String qq){
	boolean flag=true;
	if(qq.length()>=5&&qq.length()<=15){
		if(!qq.startsWith("0")){
			char[]arr=qq.toCharArray();//���ַ���ת��Ϊ�ַ�����
		for (int i = 0; i < arr.length; i++) {
			char ch=arr[i];//��¼ÿһ���ַ�
			if(!(ch>='0' && ch<='9')){
				flag=false;
			}
		}
		}else{
			flag=false;
		}
	}else{
		flag=false;
	}
	return flag;
	
}
}
