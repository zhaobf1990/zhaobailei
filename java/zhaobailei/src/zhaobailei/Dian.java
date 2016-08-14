package zhaobailei;
//class Pa{
//	double x, y, c;
//	Pa(double x1, double y1, double c1){
//		x = x1;
//		y = y1;
//		c = c1;						
//	}
//	void setX(double x1){
//		x= x1;
//	}
//	
//	 getDistance(){
////		return (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(c-p.c)*(c-p.c);
//		double i ;
//		 i =  (x-0.0)*(x-0.0)+(y-0.0)*(y-0.0)+(c-0.0)*(c-0.0);
//		 System.out.println(" "+i);
//		
//	}
//} 
//
//
//public class Dian {
// public static void main (String[] args){
//	 Pa  p = new Pa (1.0, 2.0, 3.0);
////	 Pa  p1 =new Pa(0.0 ,0.0 ,0.0 );
////	 System.out.println(p.getDistance());
//	 p.getDistance();
// }
//}
class QweR{
	double x, y, z;
	
	QweR(double x1, double y1 ,double z1){
		x = x1;
		y = y1;
		z = z1;		
	}
	double  asD(){
		 return (x-0.0)*(x-0.0)+(y-0.0)*(y-0.0)+(z-0.0)*(z-0.0);
		 
	 }
}

public class Dian {
	public static void main (String[] args){
		QweR  p = new QweR(1.0, 2.0, 3.0);
		
		System.out.println(p.asD());
	}
}
