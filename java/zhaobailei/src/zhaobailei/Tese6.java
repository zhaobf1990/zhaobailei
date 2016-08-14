package zhaobailei;

import java.util.Scanner;

class Po {
	
	double x, y, z;

	Po(double x1, double y1, double z1) {
		x = x1;
		y = y1;
		z = z1;
	}

	void setX(double x1) {
		x = x1;
	}

	void setY(double y1) {
		y = y1;
	}

	void setZ(double z1) {
		y = z1;
	}

	double gD(Po p) {
		return (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.y)
				* (z - p.y);
	}
}


public class Tese6 {
	public static void main(String[] args){
//		Po p = new Po (1.0, 2.0, 3.0);
//		Po p1 = new Po(0.0,0.0,0.0);
//		System.out.println(p.gD(p1));
//		
//		p.setX(5.0);
//		System.out.println(p.gD(new Po(1.0,1.0,1.0)));
//	}
//}
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double b;
		int k = -1;
		double pi;
		int count = 0;
		System.out.print("input the terms:\n");
		int n = input.nextInt();
		for (int i = 1; i < n; i++) {
			k = -k;
			b = (2 * i - 1) * k;
			sum += 1 / b;
			pi = 4 * sum;
			count++;
			if (pi < 3.14) {
				System.out.printf("%f\n%d", pi, count);
				System.out.print("\n");
			}
			if ((pi < 3.141) && (pi > 3.14)) {
				System.out.printf("%f\n%d", pi, count);
				System.out.print("\n");
			}
			if ((pi > 3.141) && (pi < 3.1415)) {
				System.out.printf("%f\n%d", pi, count);
				System.out.print("\n");
			}
			if ((pi > 3.1415) && (pi < 3.1459)) {
				System.out.printf("%f\n%d", pi, count);
				System.out.print("\n");
			}
		}
	}
}
