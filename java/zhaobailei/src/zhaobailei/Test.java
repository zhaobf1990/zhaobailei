package zhaobailei;
/*class BirthDate{
	private int day;
	private int month;
	private int year;
	
	public BirthDate(int d , int m, int y){
		day = d ; month = m; year = y; 
	}
	public void setDay(int d){
		day = d;
	}
	public void srtMonth(int m){
		month = m ;
	}
	
	public void setYear(int y){
		year=y;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	public void display(){
		System.out.println
		(day+" - "+month+" - " +year);
	}
}

public class Test {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
	Test test = new Test();
	int date = 9;
	BirthDate d1 = new BirthDate(7,7,1970);
	BirthDate d2 = new BirthDate(1,1,2000);
	test.change1 (date);
	test.change2 (d1);
	test.change3 (d2);
	System.out.println("date="+date);
	d1.display();
	d2.display();
	}

	public void change1(int i) {
		// TODO Auto-generated method stub
		i = 1234;		
	} 
	
	public void change2(BirthDate b){
		b = new BirthDate(22,2,2004);
	}
	
	public void change3(BirthDate b){
		b.setDay(22);
	}
}
class DataOnly{
	int i;
	double d;
	boolean b;
	DataOnly data = new DataOnly();
	objectreferece.member();
}
class membre{
	
}*/

class Person{
	private String name;
	private String location;
	
	Person (String name){
		this.name = name;
		this.location = location;
	}
	Person(String _name,String _location){
		this.name = _name;
		this.location = _location;
	}
	public String info(){
		return
				"name: " +this.name+	"location: "+this.location;
	}
}

class Student extends Person{
	private String school;
	Student(String name , String school){
		this(name,"beijing",school);
	}
	Student(String n , String l, String school ){
		super(n , l);
		this.school = school;
	}
	Student(String n , String l, String school,String abc){
		super(n , l);
		this.school = school;
	}
	

	public String info(){
		return super.info()+"school: " + school;
	}
}
public class Test{
	public static void main(String[] args){
		Person p1 = new Person("A");
		Person p2 = new Person("B" , "shanghai");
		Student s1 = new Student("C", "S1");
		Student s2 = new Student("C" , "shanhai", "S2");
	
	System.out.println(p1.info());
	System.out.println(p2.info());
	System.out.println(s1.info());
	System.out.println(s2.info());
	}
}

