package leiXX;
import java.util.Scanner;
public class Moni {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
		System.out.println("�������û���");
		String username=sc.nextLine();//������¼����û����洢��username�С�
		System.out.println("����������");
		String passworld=sc.nextLine();
		//������ַ����������ַ��������Ƚϣ�ͨ�������ַ����������÷����������������������ݣ���ֹ��ָ���쳣��
		if("admin".equals(username)&&"admin".equals(passworld)){
			System.out.println("��ӭ"+username+"��¼");
			break;
		}else{
			if(i==2){
				System.out.println("gun");
			}else{
			System.out.println("�û������������,�㻹��"+(2-i)+"�λ���");
		}
		}
	} 
	}
}
