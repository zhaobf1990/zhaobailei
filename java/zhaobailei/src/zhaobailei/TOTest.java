package zhaobailei;

public class TOTest {
	public static void main (String[] args){
//		Dog d = new Dog();
//		System.out.println("d "+d );
		
//		for(int a = 1; a<10 ; a++){
//			for(int b = 1; b<10 ; b++){
//				int c = a * b;																	
//			
//				System.out.print(" "+ b + "*"+a+"="+c);	
//				if(a==b){
//					break;
//				}
//			}
//			System.out.println();
//		}
//		for(int a = 9 ;a>0; a-=2){
//			for(int b = a;b>0; b--){
//				System.out.print("*");
//			}System.out.println();
//		}
		int a , b;
		for( a = 101; a<1000;a+=2){
			
			for ( b = 2 ; b<a; b++){								
				if(a%b==0){
					
					break;					
				}				
				}
				if(a==b){
			System.out.println(" "+a);
			
			}
		
		}
	}	
}


