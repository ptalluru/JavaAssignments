import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TrainingTest {
	private Training trainingPublic,trainingCorporate;
	@Before
	public void setUp(){
		trainingPublic = new PublicTraining("Java",5000,50);
		trainingCorporate = new corporateTraining("Big Data",35000,4);

	}
	@Test
	public void publicTrainingCharges() {
		int expected = 250000;
		int actual = trainingPublic.getOrderValue();
		assertEquals(expected,actual);
	}

	@Test
	public void publicCorporateCharges() {
		int expected = 140000;
		int actual = trainingCorporate.getOrderValue();
		assertEquals(expected,actual);
	}
}
