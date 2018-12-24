import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ComplexTest {
	private Complex complex;
	private Complex complex1;
	
	@Before
	public void setUp(){
		complex = new Complex(5.5,4);
		complex1 = new Complex(1.2,3.5);
		/*complex.setReal(5.5);
		complex1.setReal(1.2);
		complex.setImaginary(4);
		complex1.setImaginary(3.5);*/
	}

	@Test
	public void sum() {
		String expectedResult="6.7+7.5i";
		Complex answer = Complex.sum(complex, complex1);
		answer.display();
		assertEquals(expectedResult, answer.real+"+"+answer.imaginary+"i");
	}

}
