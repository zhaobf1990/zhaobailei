package zhaobailei;

class Animal{
	private String name;
	Animal(String name ){ this.name = name;}
	
	public void enjoy(){
		System.out.print("½ÐÉù.....");
	}
}


class Cat extends Animal{
	private String eyesColor;
	Cat(String n, String c ) {super(n); eyesColor = c;}
	public void enjoy(){
		System.out.println("Ã¨½ÐÉù.....");
	}
	
}

class DogDog extends Animal{
	private String furColor;
	DogDog (String n, String c){super(n); furColor = c;}
	public void enjoy(){
		System.out.println("goujiaoshng .......");
	}
}

class Lady{
	private String name ;
	private Animal pet;
	Lady(String name , Animal pet){
		this.name = name; this.pet = pet;
	}
	public void myPetEnjoy(){pet.enjoy();}
}
                         
public class Ass {
	public static void main (String[] arg){		
		Cat c = new Cat("catname","blue");
		DogDog d = new DogDog ("catname" , "black");
		Lady l1= new  Lady("l1", c);
		Lady  l2 = new  Lady ("l2", d );
		l1.myPetEnjoy();
		l2.myPetEnjoy();
		}	
}
