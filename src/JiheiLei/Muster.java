package JiheiLei;
import java.util.*;
public class Muster {

	public static void main(String[] args) {
		Collection<String>list=new ArrayList<>();//实例化集合类对象
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Iterator<String>it=list.iterator();//创建迭代器
		while(it.hasNext()){
			String str=(String)it.next();
			System.out.println(str);
		}
	}

}
