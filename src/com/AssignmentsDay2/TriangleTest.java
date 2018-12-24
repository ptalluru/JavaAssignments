import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	private Triangle triangle,triangle1,triangle2,triangle3;
	@Before
	public void setUp(){
		triangle = new Triangle(3,4,5,90,45,45);
		triangle1 = new Triangle(3,7,12,35,45,100);
		triangle2 = new Triangle(5,10,10,80,50,50);
		triangle3 = new Triangle(9,9,9,60,60,60);
	}

	@Test
	public void isRight() {
		boolean expected = true;
		boolean actual=triangle.isRight();
		assertEquals(expected,actual);
	}
	@Test
	public void isRight1() {
		boolean expected = false;
		boolean actual=triangle1.isRight();
		assertEquals(expected,actual);
	}
	@Test
	public void isRight2() {
		boolean expected = false;
		boolean actual=triangle2.isRight();
		assertEquals(expected,actual);
	}
	@Test
	public void isRight3() {
		boolean expected = false;
		boolean actual=triangle3.isRight();
		assertEquals(expected,actual);
	}

	@Test
	public void isScalene() {
		boolean expected = true;
		boolean actual=triangle1.isScalene();
		assertEquals(expected,actual);
	}
	@Test
	public void isScalene1() {
		boolean expected = false;
		boolean actual=triangle.isScalene();
		assertEquals(expected,actual);
	}
	@Test
	public void isScalene2() {
		boolean expected = false;
		boolean actual=triangle2.isScalene();
		assertEquals(expected,actual);
	}
	@Test
	public void isScalene3() {
		boolean expected = false;
		boolean actual=triangle3.isScalene();
		assertEquals(expected,actual);
	}
	@Test
	public void isIsoceles() {
		boolean expected = true;
		boolean actual=triangle2.isIscoceles();
		assertEquals(expected,actual);
	}
	@Test
	public void isIsoceles1() {
		boolean expected = false;
		boolean actual=triangle.isIscoceles();
		assertEquals(expected,actual);
	}
	@Test
	public void isIsoceles2() {
		boolean expected = false;
		boolean actual=triangle1.isIscoceles();
		assertEquals(expected,actual);
	}
	@Test
	public void isIsoceles3() {
		boolean expected = true;
		boolean actual=triangle3.isIscoceles();
		assertEquals(expected,actual);
	}
	@Test
	public void isEquilateral() {
		boolean expected = true;
		boolean actual=triangle3.isEquilateral();
		assertEquals(expected,actual);
	}
	@Test
	public void isEquilateral1() {
		boolean expected = false;
		boolean actual=triangle.isEquilateral();
		assertEquals(expected,actual);
	}
	@Test
	public void isEquilateral2() {
		boolean expected = false;
		boolean actual=triangle1.isEquilateral();
		assertEquals(expected,actual);
	}
	@Test
	public void isEquilateral3() {
		boolean expected = false;
		boolean actual=triangle2.isEquilateral();
		assertEquals(expected,actual);
	}

}
