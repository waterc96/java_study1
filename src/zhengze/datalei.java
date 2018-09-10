package zhengze;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datalei {

	public static void main(String[] args) throws ParseException {
		dangqianhm();
		demo1();
		//把时间字符串转化为日期对象
		/*String  str= "2000年8月8日08:08:08";
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy年mm月dd日HH:mm:ss ");
		Date d=sdf.parse(str);
		System.out.println(d);*/
	
	}

	private static void demo1() {
		Date d=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy年mm月dd日HH:mm:ss ");//创建日期格式化对象	
		System.out.println(sdf.format(d));//将日期对象转化为字符串
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
