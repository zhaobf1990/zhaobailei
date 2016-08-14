package qita;

public class Yinhang {
	public static void main(String[] args) {
		int beng = 1000;
		beng = Qu(beng, 100);
		System.out.println(beng+" ");
		beng = 	Qu(beng, 500);
		System.out.println(beng+"");
		beng = 	Cun(beng, 1000);
		System.out.println(beng+"");
		beng = 	Qu(beng, 300);
		System.out.println(beng+"");
		beng = Cun(beng, 200);
		System.out.println(beng+"");
	}

	public static int Cun(int beng, int cun) {
		beng = beng + cun;
		return beng;
	}

	public static int Qu(int beng, int qu) {
		beng = beng - qu;
		return beng;
	}
}
