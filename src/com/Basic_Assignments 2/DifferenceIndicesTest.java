import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DifferenceIndicesTest 
{
	private DifferenceIndices differenceIndices;
	@Before
	public void setUp()
	{
		differenceIndices = new DifferenceIndices();
	}

	@Test
	public void array1() 
	{
		int k=2;
		int array[] ={1,2,3,4,5,1,10,9};
		boolean result=differenceIndices.isDistinctValue(array,k);
		assertEquals(false,result);
	}
	@Test
	public void array2() 
	{
		int k=4;
		int array[] ={1,2,3,4,5,4,10,9};
		boolean result=differenceIndices.isDistinctValue(array,k);
		assertEquals(true,result);
	}
	@Test
	public void array3() 
	{
		int k=5;
		int array[] ={1,2,3,4,5,1,10,9};
		boolean result=differenceIndices.isDistinctValue(array,k);
		assertEquals(true,result);
	}

}
