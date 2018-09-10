package javaee3;

public class dianYing {
	private String name;
	private int age;
	public dianYing(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public dianYing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
//public static void main(String args[]){
//	person3 p=new person3();
//	person3.name ="²Ô";
//	person3.country="japanese";
//	p.speak();
//	
//}
//}
//class person3{
//	static String name;
//	static String country;
//	public  void speak(){
//		System.out.println(name+"..."+country);
//	}
//}
