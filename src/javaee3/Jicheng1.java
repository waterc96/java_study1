package javaee3;

public class Jicheng1 {
	public static void main(String args[]){
		cat c=new cat();
		c.setColor("花");
		c.setLeg(4);
		System.out.println(c.getLeg()+"..."+c.getColor());
		c.eat();
		c.sleep();
		dog x=new dog("黑",4);
		System.out.println("---------------------");
		System.out.println(x.getLeg()+"..."+x.getColor());
		x.eat();
		x.kan();
	}

}
class animal{
 private String color;
 private int leg;
 public animal(){}
 public animal(String color,int leg){
	 this.color=color;
	 this.leg=leg;
 }
	public void setColor(String color){
	this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setLeg( int leg){
		this.leg=leg;
		}
		public int getLeg(){
			return leg;
		}
	public void sleep(){
		System.out.println("睡觉");		
	}
	public void eat(){
		System.out.println("吃饭");
	}
}
class cat extends animal{
	public cat(){}
	public cat(String color,int leg){
		super(color,leg);
	}
	public void zhua(){
		System.out.println("抓老鼠");
	}

}
class dog extends animal{
	public dog(){}
	public dog(String color,int leg){
		super(color,leg);
	}
	public void kan(){
		System.out.println("看家");
	}

}
