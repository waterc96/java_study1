package zhengze;

import java.util.Calendar;

public class Calender1 {

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();//��������ָ���������
		System.out.println(c.get(Calendar.YEAR));//ͨ���ֶε�ȡ��
		System.out.println(c.get(Calendar.MONTH));//ͨ���ֶε�ȡ��,�������Ǵ�0��ʼ��ŵ�
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//���еĵڼ���
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//�����ǵ�һ�죬���������һ��
		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)	+"��"+
		c.get(Calendar.DAY_OF_WEEK)+"��"+getweek(c.get(Calendar.DAY_OF_WEEK)));

	}

	public static String getweek(int week){
		String []arr={"","������","����һ","���ڶ�","������","������","������","������",};
		return arr[week];
	}
} 
