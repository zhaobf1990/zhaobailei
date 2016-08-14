package qita;

import java.util.ArrayList;
import java.util.Collections;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class A12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		Collections.addAll(a, "1", "4", "6", "3", "8", "4");
/*		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i));
		}*/
		System.out.println(a.size());
		Object s =  a.get(5);
		System.out.println(s);
		 
		a.add(0, a.get(a.size()-1));
		for (int i = 0; i < a.size()-1; i++) {
			System.out.print(a.get(i));
		}
	}

}
