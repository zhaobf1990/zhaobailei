package qi;

import java.rmi.Naming;
import java.util.Collection;
import java.util.Iterator;

public class Z {
	public static void main(String[] ages){
		Collection<E> c = new Hashset();		
		c.add(new Naming("fff1","lll1"));
		c.add(new Name ("f2", "l2"));
		c.add(new Name ("fff3","lll3"));
		for(Iterator i = c.iterator();i.hasNext();){
			Name name = (Name )i.next();
			if(name.getFirstName().length()<3){
				i.remove();
			}
		}
		System.out.print(c);
	}

}
