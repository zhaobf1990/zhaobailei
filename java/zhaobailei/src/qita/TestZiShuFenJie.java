package qita;

import java.util.ArrayList;

public class TestZiShuFenJie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 80;
		System.out.print(a + "=");
		for (int i = 2; i < 10;) {
			if (a % i == 0) {
				a = a / i;
				System.out.print(i + "*");
			} else if (a % i != 0) {
				i++;
			}
		}
	}

}
