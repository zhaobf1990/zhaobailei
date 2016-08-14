package zhaobailei;

public class TestEz {
public static void main (String[] args){
	int[] arr = {1 , 2, 3,};
	System.out.println(arr[2]);
	try{
		System.out.println(2/0);
	}catch (ArithmeticException ae){
		System.out.println("xitong");
		ae.printStackTrace();
	}
		}
void m (int i) throws ArithmeticException{
	if(i == 0){
		throw new ArithmeticException("±»³ýÊýÎª0");
	}
}
}
