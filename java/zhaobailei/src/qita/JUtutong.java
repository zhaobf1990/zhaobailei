package qita;

public class JUtutong {
	public static void main(String[] args){
		for(int i = 1; i<6;i++){
			for(int j = 1; j<14;j++){
				for(int k = 1 ;k<16;k++){
					if(i+j+k==16&&i*10+j*4+k/2==55){
						System.out.println(i);
						System.out.println(j);
						System.out.println(k);

					}
				}
			}
		}
	}

}
