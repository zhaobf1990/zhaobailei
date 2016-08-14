package Integet;

import java.util.ArrayList;

public class Gerbil {
	static int gerbilNumber;
	int counter;
		public Gerbil(String hl){
		gerbilNumber = ++counter;
		hopInfo = hl;
	}String hopInfo;
	

	public static void main(String[] args) {
		ArrayList a = new ArrayList(); 
		a.add("25");
		a.add("26" );
		for(int i = 0; i<a.size();i++){
			System.out.println("´üÊóµÄÃû×Ö"+a.get(i)+"´üÊóµÄºÅÂë"+gerbilNumber);

		}
		// TODO Auto-generated method stub

	}

	
	
	/**´òÓ¡
	 * 
	 */
	void hop(){
		System.out.println("´üÊóµÄÃû×Ö"+hopInfo+"´üÊóµÄºÅÂë"+gerbilNumber);
	}

}
