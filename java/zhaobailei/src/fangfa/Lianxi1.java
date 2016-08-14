package fangfa;

public class Lianxi1 {
	public static void main(String[] args) {
		String s = "javasfljsdjava fdsfsjava fhfjava dfjava";
		String a = "java";

		int b = 0;
		int c = -1;
		while ((c = s.indexOf(a)) != -1) {
			s = s.substring(c + a.length());
			b++;
		}
		System.out.println(b);
	}
}
