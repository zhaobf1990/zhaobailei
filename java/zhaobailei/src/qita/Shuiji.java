package qita;

import java.util.Random;

public class Shuiji {
	public static void main(String[] aegs) {
		int a = 0;
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int shuiji = random.nextInt(1000) + 50;
			System.out.print(shuiji + "  ");
			if (a < shuiji) {
				a = shuiji;
			}
		}
		System.out.println();
		System.out.println( "  ×î´óÊý"+a);
	}
}
