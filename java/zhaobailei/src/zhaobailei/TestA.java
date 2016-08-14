package zhaobailei;
class Fatherclass{
	public int value;
	public void f(){
		value = 100;
		System.out.println("∏∏¿‡class"+value);
	}
}

class ChildClass extends Fatherclass{
	public int value ;
	public void f (){
		super.f();
		value = 200;
		System.out.println("◊”¿‡class" +value);
		System.out.println(value);
		System.out.println(super.value);
	}
}

public class TestA {
	public static void main (String[] args){
		ChildClass cc = new ChildClass();
		cc.f();
	}
}
