package zhengze;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datalei {

	public static void main(String[] args) throws ParseException {
		dangqianhm();
		demo1();
		//��ʱ���ַ���ת��Ϊ���ڶ���
		/*String  str= "2000��8��8��08:08:08";
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy��mm��dd��HH:mm:ss ");
		Date d=sdf.parse(str);
		System.out.println(d);*/
	
	}

	private static void demo1() {
		Date d=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy��mm��dd��HH:mm:ss ");//�������ڸ�ʽ������	
		System.out.println(sdf.format(d));//�����ڶ���ת��Ϊ�ַ���
	}

	private static void dangqianhm() {
		long start=System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}

}
