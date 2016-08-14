package qi;

import java.util.LinkedList;
import java.util.List;



public class Y {
	public static void main(String[] ages){
		List l1 = new LinkedList();
		for(int i=0; i<=5; i++){
			l1.add("a"+i);
		}
		System.out.println(l1);
		l1.add(3,"a100");
		System.out.println(l1);
		l1.set(6, "a200");
		System.out.print((String )l1.get(2)+" ");
		System.out.println(l1.indexOf("a3"));
		l1.remove(1);
		System.out.println(l1);
		
	}
}
