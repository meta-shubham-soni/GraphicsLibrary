import java.sql.Timestamp;


public interface Shape {
	
	/**
	 * shape that can be used
	 */
	enum typeOfShape
	{
		SQUARE, RECTANGLE, TRIANGLE, CIRCLE;

		public String toString(){
			switch(this){
			case SQUARE :
				return "square";
			case RECTANGLE :
				return "rectangle";
			case TRIANGLE :
				return "triangle";
			case CIRCLE:
				return "circle";
			}
			return null;
		}

	}

	/**
	 * @return area of shape
	 */
	public double getArea();
	
	/**
	 * @return perimeter of shape
	 */
	public double getPerimeter();

	/**
	 * @return origin of shape
	 */
	public double getOrigin();

	/**
	 * @return shape is bounded or not
	 */
	public boolean isPointEnclosed(Point obj);

	/**
	 * @return type of shape
	 */
	public String getShapeType();

	/**
	 * @return timestamp of shape
	 */
	public Timestamp getTimeStamp();
}