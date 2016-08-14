package qita;

import java.util.Random;

public class This {
	private static int length;
	String name;
	int hp;
	int lv;

	public void This() {

	}

	public This(String name, int hp, int lv) {
		this.name = name;
		this.hp = hp;
		this.lv = lv;
	}

	public void desc() {
		System.out.println("姓名" + name + "血量" + hp + " 等级" + lv);
	}

	public static void main(String[] args) {
		This[] a = new This[20];
		String[] s = {"AAA","BBB","CCC","DDDD","EEE"};
		for(int c = 0 ; c<a.length;c++){
		a[c] = new This(s[(dengji()-1)], xue(), dengji());
		a[c].desc();
		}

	}
	public static int dengji(){
		Random c = new Random();
		int a = c.nextInt(5)+1;
		return a ;
	}
	
	public static int xue(){
		Random c = new Random();
		int a = c.nextInt(100)+1;
		return a ;
	}
}
