package zhaobailei;

public class Cal {
	public static int zxc() {
		int a;
		int b = 0;
		return b;

	}
	
	
	public static void main(String[] args){
		for(int i = 100; i<1000 ; i++){
			boolean s = false;
			for(int a = 2 ; a<i;a++){
				if (i %a==0){
					s = true;
				}
			}
			if(s==true){
				System.out.println(" "+i);
			}
		}
	}
}
