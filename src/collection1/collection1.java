package collection1;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
public class collection1 {
public static void main(String args[]){	
	//demo();
	//set���ϵĻ������Դ洢�ظ�ֵ������false��list���Ͽ��Դ洢�ظ�ֵ����һֱ����true
	//ArrayList�ĸ�����дtostring�����������ڴ�ӡ�����ʱ������Ľ������object����tostring�Ľ��
	Collection c=new ArrayList();
	boolean b1=c.add(1);
	boolean b2=c.add(new student("����",24));
	boolean b3=c.add(true);
	boolean b4=c.add(1);
	c.add("5");
	c.remove("5");
	System.out.println(c);
	//
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	System.out.println(b4);
}

private static void demo() {
	//int arr[]=new int[5];//����������������
	student arr[]=new student[5];//�������������������� 
	arr[0]=new student("����",23);//����һ��ѧ�����󣬴洢������ĵ�һ��λ��
	arr[1]=new student("����",24);
	arr[2]=new student("����",25);
	for (int i = 0;  i< arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
