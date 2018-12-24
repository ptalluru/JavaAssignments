import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RectangleTest {

	private Rectangle rectangle;
	private Rectangle rectangle1;
	@Before
	public void setUp()
	{
		rectangle = new Rectangle(5,2);
		rectangle1 = new Rectangle(15,10);	
	}
	
	@Test
	public void area() {
		
		double area=rectangle.area();
		double area1=rectangle1.area();
		assertEquals(10,area,00);
		assertEquals(150,area1,00);
		
	}

	@Test
	public void perimeter() {
		double perimeter=rectangle.perimeter();
		double perimeter1=rectangle1.perimeter();
		assertEquals(14,perimeter,00);
		assertEquals(50,perimeter1,00);
	}

	@Test
	public void lengthOfDiagonal() {
		double lengthOfDiagonal=rectangle.lengthOfDiagonal();
		double lengthOfDiagonal1=rectangle1.lengthOfDiagonal();
		assertEquals(5.385164807134504,lengthOfDiagonal,00);
		assertEquals(18.027756377319946,lengthOfDiagonal1,00);
	}
	@Test
	public void objectCompare() {
		boolean compare = Rectangle.areaCompare(rectangle,rectangle1);
		assertEquals(false,compare);
	}

}
