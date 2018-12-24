import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ArrayOccurenceOfElementsTest 
{

	private ArrayOccurenceOfElements arrayOccurence;
	@Before
	public void setUp()
	{
		arrayOccurence = new ArrayOccurenceOfElements();
	}
	@Test
	public void test() 
	{
		String names[]={"Dave", "George","Ann", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "George", "Sam", "Ted"};
		int actual =arrayOccurence.countOccurrence(names,"George");
		int expected=2;
		assertEquals(expected, actual);

	}
	@Test

	public void testNameNotPresentInArray()
	{
		String names[]={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "George", "Sam", "Ted"};
		int actual =arrayOccurence.countOccurrence(names,"Ajay");
		int expected=0;
		assertEquals(expected, actual);
		}


}


