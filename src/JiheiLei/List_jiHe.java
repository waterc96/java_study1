package JiheiLei;

import java.util.*;
public class List_jiHe {
public static void main(String[]args){
	List<String> list= new ArrayList<>();//�������϶���
	list.add("a");
	list.add("b");
	list.add("c");
int i=(int)(Math.random()*list.size());	//���0-2֮��������
	System.out.println("�����ȡ�����е�Ԫ�أ�"+list.get(i));
	list.remove(2);//��ָ������λ�õ�Ԫ���Ƴ�
	System.out.println("��������2�����ش��������Ƴ��Ժ������е�Ԫ���ǣ�" );
	for(int j=0;j<list.size();j++){
		System.out.println(list.get(j));
	}
}
}
