package principles;

//Square.java
public class Square extends Shape {
	private double sideLength;

	public Square(String colour, double sideLength) {
		super(colour);
		this.sideLength = sideLength;
	}

	public double getSideLength() {
		return sideLength;
	}

	@Override
	public double calculateArea() {
		return sideLength * sideLength;
	}
}
