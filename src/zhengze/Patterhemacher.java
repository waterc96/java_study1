package zhengze;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Patterhemacher {

	public static void main(String[] args) {
		/*Pattern p=Pattern.compile("a*b");//获取到正则表达式
		Matcher m=p.matcher("aaaaab");//获取匹配器
		boolean b=m.matches();//看是否能匹配，匹配就返回true
		System.out.println(b);
		System.out.println("aaaaab".matches("a*b"));*/
		String s="我的手机号码是18988889999，曾经用过13066668888";
		String regex="1[23856]\\d{9}";//手机号的正则表达式
		Pattern p=Pattern.compile("regex");//获取到正则表达式
		Matcher m=p.matcher(s);//获取匹配器
//		boolean b=m.matches();//看是否能匹配，匹配就返回true
		while(m.find()){
		System.out.println(m.group());
	}
	}

}
