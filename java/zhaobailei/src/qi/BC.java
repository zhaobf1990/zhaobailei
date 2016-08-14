package qi;

import java.util.Collection;

public class BC {
	public static void main(String[] arge){
		Collection c = new HashSet();
		c.add(new Name ("fff3","lll3"));
		c.add(new Name ("fff1","lll1"));
		c.add(new Name("f2","l2"));
		
		c.remove(new Integer(100));
		System.out.print(c.remove(new Name("f1","l1")));
		System.out.
	}

}
