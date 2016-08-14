package diliu;

public class B {
	public static void main(String args){
		String s = "1,2;3,4,5;6,7,8,";
		String[] sFirst = s.split(";");
		for(int i = 0;i<sFirst.length;i++){
			System.out.println(sFirst[i]);
		}
		
	}

}
