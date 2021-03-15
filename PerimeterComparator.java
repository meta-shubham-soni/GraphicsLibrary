import java.util.*;

/**
 * This class implements comparator to sort objects based on perimeter.
 * 
 * @author avinash.kumar_metacu
 *
 */
public class PerimeterComparator implements Comparator<Shape> {

	@Override
	public int compare(Shape s1,Shape s2){  
		if(s1.getPerimeter()==s2.getPerimeter())  
			return 0;  
		else if(s1.getPerimeter()>s2.getPerimeter())  
			return 1;  
		else  
			return -1;  
	}
}