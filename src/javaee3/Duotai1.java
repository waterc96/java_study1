package javaee3;

public class Duotai1 {
	public static void main(String args[]){
		Baseteacher mi=new Baseteacher("鸣人",22);
	}

}
abstract class ren{
	private String name;
	private int age;
	public ren(){};
	public  ren(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void Setname(String name){
		this.name=name;
	}
	public String Getname(){
		return name;
	}
	public void Setage(int age){
		this.age=age;
	}
	public int Getage(){
		return age;
	}	
}
class Baseteacher extends ren{
	public Baseteacher(){}
	public Baseteacher(String name,int age){
		super(name,age);
	}	
	public void teach(){
		System.out.println("我的名字是:"+this.Getname()+"我的年龄是："+this.Getname());
	}
}




