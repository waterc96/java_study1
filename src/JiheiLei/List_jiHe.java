package JiheiLei;

import java.util.*;
public class List_jiHe {
public static void main(String[]args){
	List<String> list= new ArrayList<>();//创建集合对象
	list.add("a");
	list.add("b");
	list.add("c");
int i=(int)(Math.random()*list.size());	//获得0-2之间的随机数
	System.out.println("随机获取数组中的元素："+list.get(i));
	list.remove(2);//将指定索引位置的元素移除
	System.out.println("将索引是2的因素从数组中移除以后，数组中的元素是：" );
	for(int j=0;j<list.size();j++){
		System.out.println(list.get(j));
	}
}
}
