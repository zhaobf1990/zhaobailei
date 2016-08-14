package zhaobailei;
public class Dog{
	public static void main(String[]ages) {
		Pereon p = new Pereon();
		Pereon p1 = new Pereon(400);
		p.info();
		p.info("ok");
	}			
}

class Pereon{
	
	Pereon(){
		id = 100;
		age = 20;				
	}
	
	Pereon(int _id){
		id = _id;
		age = 20;	
	}
	
	Pereon(int _id , int _age){
		id = _id;
		age = _age;
	}
	private int id;
	private int age ;
	
	public int getAge() {return age;}
	public void setAge (int i ) {age = i;}
	public int getId() {return id;}
	
	void info() {
		System.out.println("  a"+id);
	}
	
	void info(String t) {
		System.out.println(t+"  id"+id);
	}

}
