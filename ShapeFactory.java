import java.util.List;


public class ShapeFactory {

	/**
	 * Constructor to
	 * Create a new shape
	 * 
	 * @param shapeType
	 * @param coordinate
	 * @param length
	 * @return shape
	 */
	public static Shape typeShapeFactory(String shapeType, Point coordinate, List<Double> length){
		Shape obj = null;
		if(Shape.typeOfShape.SQUARE.toString().equalsIgnoreCase(shapeType))
			obj = new Square(coordinate,length);
		else if(Shape.typeOfShape.RECTANGLE.toString() == shapeType)
			obj = new Rectangle(coordinate,length);
		else if(Shape.typeOfShape.TRIANGLE.toString() == shapeType)
			obj = new Triangle(coordinate,length);
		else if(Shape.typeOfShape.CIRCLE.toString() == shapeType)
			obj = new Circle(coordinate,length);
		return obj;
	}
}