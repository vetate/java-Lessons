package principles;

//Main.java
public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle("Red", 5.0);
		Shape square = new Square("Blue", 4.0);

		printShapeArea(circle);
		printShapeArea(square);
	}

	public static void printShapeArea(Shape shape) {
		System.out.println("Shape: " + shape.getClass().getSimpleName());
		System.out.println("Colour: " + shape.getColour());
		System.out.println("Area: " + shape.calculateArea());
		System.out.println();
	}
}
