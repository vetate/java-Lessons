package principles;

//Circle.java
public class Circle extends Shape {
	private double radius;

	public Circle(String colour, double radius) {
		super(colour);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
