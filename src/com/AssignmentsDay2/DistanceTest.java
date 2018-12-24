import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DistanceTest {
	private Distance distance;
	private Distance distance1;
	
	@Before
	public void setUp(){
		distance = new Distance(5.1f,6.4f);
		distance1 = new Distance(7.2f,8.3f);
	}
	@Test
	public void test() {
		String expectedResult="12.299999 ft 14.700001 in";
		Distance answer = Distance.sum(distance, distance1);
		answer.display();
	
		assertEquals(expectedResult, answer.feet+" ft "+answer.inches+" in");
	}

}
