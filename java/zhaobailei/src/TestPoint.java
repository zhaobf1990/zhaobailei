public class TestPoint {
	protected double x, y;

	public TestPoint(double x1, double y1) {
		x = x1;
		y = y1;
	}

	public static void main(String[] args) {
//		Circle  c = new Circle(1,1,1);
		Cylinder c = new Cylinder(1, 1,1);
	}
}

/**
 * 圆的面积
 *
 */
class Circle extends TestPoint {
	protected static  double r;

	public Circle(double x1, double y1,double r1) {
		super(x1, y1);
		r1 = r1/2;
		r = r1 * r1 * 3.14;
//		System.out.println(r);


		// TODO Auto-generated constructor stub
	}
}

/**
 * 圆柱体
 */
class Cylinder extends Circle {
	protected double h;


	public Cylinder(double x1, double y1 ,double h1) {
		super(x1, y1, h1);
		double h = h1 * r;
		System.out.println(h);
		// TODO Auto-generated constructor stub
	}
}
