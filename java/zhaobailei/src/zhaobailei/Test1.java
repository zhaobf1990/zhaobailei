package zhaobailei;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Test1 {
	 public static void main(String[] args) {
	// Frame f = new Frame();
	// Label l = new Label("Party at Tim's");
	// Button b = new Button("You bet");
	// Button c = new Button("shoot me");
	// Panel p = new Panel();
	// p.add(l);
	//
	// }

	// public static void main(String[] args) {
	// // System.out.println("I Rule");
	// // System.out.println("The Wofydtrdfiig89urld");
	//
	// // float x = 3.9f;
	// // String name = "Dirk";
	// // x = x *17;
	// // System.out.print("x is " + x);
	// // double d = Math.random();
	// //
	// int x = 11111;
	// while (x > 12){
	// //x =x -1;
	// System.out.println(x);
	//
	// }
	// // for (int x = o; x <10; x = x+1)
	//
	//
	// }

//	public static void main(String[] args) {
////		System.out.println((char)0+":"+0);
////		System.out.println((char)1+":"+1);
////		System.out.println((char)2+":"+2);
//		
//		for(int i=0;i<=127;i++){
//		   System.out.println((char)i+":"+i);
//		}
//	}
//	int a = 1;
//	int b = 1;
//	int i = 1;
//	for(a=1 ;a<=9;a++){
//	for( b =1; b<=9 ;b++ ){
//		i = b*a;
//		System.out.print(" "+ a +"*"+ b +"="+i);
//		if(a==b){
//			break;
//		}		
//	}
//	System.out.println();
//		}
//		 long a = 814113705020l;
//		 int b = 116916;
//		 long c ;
//		int a;
//		for (int i = 101; i < 1000; i += 2) {
//			for (a = 2; a < i; a++) {
//				// System.out.println(" "+i);
//
//				if (i % a == 0) {
//					break;
//				}
//			}
//			if (i == a) {
//				System.out.println(" " + i);
//			}
//		}
		 for (int i =101; i<1000;i+=2){
			 boolean f =true;
			 for (int a = 2; a<i; a++){
				 if(i%a==0  ){
					f = false; 
					 break;
				 }
				 
			 }
			 if(f==true){
				 System.out.println(""+i);
			 }
		 }

	}
}
