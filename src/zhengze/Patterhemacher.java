package zhengze;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Patterhemacher {

	public static void main(String[] args) {
		/*Pattern p=Pattern.compile("a*b");//��ȡ��������ʽ
		Matcher m=p.matcher("aaaaab");//��ȡƥ����
		boolean b=m.matches();//���Ƿ���ƥ�䣬ƥ��ͷ���true
		System.out.println(b);
		System.out.println("aaaaab".matches("a*b"));*/
		String s="�ҵ��ֻ�������18988889999�������ù�13066668888";
		String regex="1[23856]\\d{9}";//�ֻ��ŵ�������ʽ
		Pattern p=Pattern.compile("regex");//��ȡ��������ʽ
		Matcher m=p.matcher(s);//��ȡƥ����
//		boolean b=m.matches();//���Ƿ���ƥ�䣬ƥ��ͷ���true
		while(m.find()){
		System.out.println(m.group());
	}
	}

}
