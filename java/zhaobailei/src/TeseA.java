
public class TeseA {
	public static void main(String[] args){
		int[] a = {2, 4 ,6, 7,3,5,1,9,8};
//		for(int i =0; i <a.length; i++){
//			System.out.print(a[i]+" ");
//		}
//		for(int i = 0; i<args.length;i++){
//			System.out.println(args[i]);
//		}
//		if(args.length<3){
//			System.out.println("Usage:java Tese \"n1\"op\"n2\"");
//			System.exit(-1);
//		}
//		double d1 = Double.parseDouble(args[0]);
//		double d2 = Double.parseDouble(args[2]);
//		double d= 0;
//		if(args[1].equals("+")) d= d1+d2;
//		else if (args[1].equals("-")) 	d = d1-d2;
//		else if (args[1].equals("x")) d = d1*d2; 
//		else if (args[1].equals("/")) d = d1/d2;
//		else{
//			System.out.println("Error operator!");
//			System.exit(-1);
//		}
//		System.out.println(d);
//		for(int i =0; i <a.length; i++){
//			
//		}
		
		
		 String c [] [] = {{"c++","����","��ѧ","��ѧ","����","����"},{"c++","����","��ѧ","��ѧ","����","����"},
				 			{"c++","����","��ѧ","��ѧ","����","����"},
		 					{"c++","����","��ѧ","��ѧ","����","����"},{"c++","����","��ѧ","��ѧ","����","����"},
		 					{"c++","����","��ѧ","��ѧ","����","����"},{"c++","����","��ѧ","��ѧ","����","����"},
		 					{"c++","����","��ѧ","��ѧ","����","����"},{"c++","����","��ѧ","��ѧ","����","����"},
		 					{"c++","����","��ѧ","��ѧ","����","����"}};  
		int q ,j;
		for( q= 0;q<c.length;q++){
			for(j=0;j<c[q].length;j++){
				
					System.out.print("c["+q+"]["+j+"] = "+c[q][j]+" ");
				
				
			}System.out.println(" ");
			
		}
}		
}
