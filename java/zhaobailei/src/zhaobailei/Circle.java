package zhaobailei;

public class Circle {
	private Point o;
	private double radius;

	Circle(Point p, double r) {
		o = p;
		radius = r;
	}

	public Point geto() {
		return o;
	}

	public double getRadius() {
		return radius;
	}
}
