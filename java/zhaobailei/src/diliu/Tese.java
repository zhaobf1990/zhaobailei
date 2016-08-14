package diliu;

public class Tese {

	public static void main(String[] args) {
		int q = 0, a = 0, z = 0, w=0;
/*		String s = "zxavacjavavbnmasavadfghjklqweavartyavauioavap"
				+ "	ZXCVavaBNMASDFGHJKLQavaWERTavaYUavaIOP!@#$ava%%^&*";
		for (int t = 0; t < s.length(); t++) {
			
			char c = s.charAt(t);
			
			if ((c >= 'a' && c <= 'z')) {
				q++;
			} else if (c >= 'A' && c <= 'Z') {
				a++;
			} else {
				z++;
			}
//			System.out.println(""+q+" "+a + " "+z);
		}
		System.out.println(""+q+" "+a + " "+z);
		*/
		String s = "zxavacjavavbnmasavadfghjklqweavartyavauioavap"
				+ "	ZXCVavaBNMASDFGHJKLQavaWERTavaYUavaIOP!@#$ava%%^&*";
		for (int t = 0; t < s.length(); t++) {
			String c =  s.toUpperCase();
			if(c == "java"){
				a++;
			}else;
			
		}System.out.println(" "+a);
	}
}
