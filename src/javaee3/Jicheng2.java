package javaee3;

public class Jicheng2 {
	public static void main(String args[]){
		student x=new student();
		x.setName("����");
		x.setAge(23);
		System.out.println(x.getName()+"--------"+x.getAge());
		x.study();
		x.eat();
		System.out.println("---------------------");
		teacher y=new teacher("����",24);
		System.out.println(y.getName()+"--------"+y.getAge());
		y.eat();
		y.teach();
		
		}
}
class person2{
	private String name;
	private int age;
	public person2(){}
	public person2(String name,int age){
		this.name=name;
		this.age=age;
		}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void eat(){
		System.out.println("�Է�");
	}
	}

class student extends person2 {
	public student(){}
	public student(String name,int age){
		super(name,age);
		}
	public void study(){
		System.out.println("ѧ��ѧϰ");
	}
}
class teacher extends person2{
	public teacher(){}
	public teacher(String name,int age){
		super(name,age);
		}
	public void teach(){
		System.out.println("��ʦ����");
	}
}
