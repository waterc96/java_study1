package javaee3;

public class DuiXiangThis {
	public static void main(String args[]){
		personq x=new personq();
		x.setName=("ˢˢ");
		x.setAge(111);
		System.out.print(x.getName()+"..."+x.getAge());
		
	}

}
class personq{
	
	public String setName;
	String name;
	private int age;
	public  void setAge(int a){
		if(a>0&&a<=150){
			 age=a;}
			 else{
				System.out.println("�㻹�ǻع�����ɡ���");
		}
	}
	public int getAge(){
		return age;
	}
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
}