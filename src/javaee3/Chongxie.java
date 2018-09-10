package javaee3;

public class Chongxie {
	public static void main(String args[]){
		ios8 x= new ios8();
		x.siri();
		x.call();
		
	}

}
class ios7{
	public void call(){
		System.out.println("打电话");
		
	}
	public void siri(){
		System.out.println("speak English");
		
	}
}
class ios8 extends ios7{
	public void siri(){
		System.out.println("说中文");
		super.siri();
		
	}
}