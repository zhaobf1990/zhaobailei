package qita;

import java.util.ArrayList;
import java.util.Collections;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class A121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		Collections.addAll(a, "1", "4", "6", "3", "8", "4");
		for (int i = 0; i < a.size(); i++) {
			a.add(0, a.get(a.size() - 1));
			a.remove(a.size() - 1);
			for (int q = 0; q < a.size(); q++) {
				System.out.print(a.get(q));
			}
			System.out.println();
		}
	}

}
