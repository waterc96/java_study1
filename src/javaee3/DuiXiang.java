package javaee3;

public class DuiXiang {
	public static void main(String args[]){
		person p=new person();
		p.setage(222);
//		p.age=3;              
		p.name="丽丽";
//		p.speak();
		System.out.println(p.getAge());
	}

}
 class person{
	String name;
	 private int age;
	 	public void setage(int a){
			if(a<200&&a>0){
			age=a;}
			else{
				System.out.println("你认真的？？");
			}
		}
		public int getAge(){
			return age;
		}
//		public void speak(){
//			System.out.print(name+"今年"+age+"啦");
//		}
}

