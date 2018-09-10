package collection1;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
public class collection1 {
public static void main(String args[]){	
	//demo();
	//set集合的话不可以存储重复值，返回false，list集合可以存储重复值，会一直返回true
	//ArrayList的父类重写tostring方法，所以在打印输出的时候，输出的结果不是object类中tostring的结果
	Collection c=new ArrayList();
	boolean b1=c.add(1);
	boolean b2=c.add(new student("张三",24));
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
	//int arr[]=new int[5];//基本数据类型数组
	student arr[]=new student[5];//创建引用数据类型数组 
	arr[0]=new student("张三",23);//创建一个学生对象，存储在数组的第一个位置
	arr[1]=new student("李四",24);
	arr[2]=new student("王五",25);
	for (int i = 0;  i< arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
