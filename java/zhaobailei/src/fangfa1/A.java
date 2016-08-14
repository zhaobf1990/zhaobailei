package fangfa1;

public class A {
	public static void main(String[] args) {
		String s = "this is a demo of the getChars method.";
		char buf[] = new char[20];
		s.getChars(10, 14, buf, 0);
		for(int i = 0;i<buf.length;i++){
			System.out.println(buf[i]);
		}
	}

}
