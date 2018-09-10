package zhengze;

import java.util.Calendar;

public class Calender1 {

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();//父类引用指向子类对象
		System.out.println(c.get(Calendar.YEAR));//通过字段调取年
		System.out.println(c.get(Calendar.MONTH));//通过字段调取月,但是月是从0开始编号的
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//月中的第几天
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//周日是第一天，周六是最后一天
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)	+"月"+
		c.get(Calendar.DAY_OF_WEEK)+"日"+getweek(c.get(Calendar.DAY_OF_WEEK)));

	}

	public static String getweek(int week){
		String []arr={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六",};
		return arr[week];
	}
} 
