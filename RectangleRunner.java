// Name: Timothy Pham
// Period: 2nd

public class RectangleRunner {
	
	public static void main (String args[]) {
		
		Rectangle rectangle = new Rectangle(4,6);
		System.out.println(rectangle.getLength());
		System.out.println(rectangle.getWidth());
		rectangle.setDimensions(2,3);
		System.out.println(rectangle.toString());
		
		System.out.println();
		Square square = new Square(5);
		System.out.println(square.toString());
		square.setDimensions(7);
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
		System.out.println(square.toString());
		
	}
}

