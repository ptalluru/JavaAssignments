import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;
public class MultiDimensionArrayTest 
{
	private MultiDimentionalArray multidimentional;
	@Before
	public void setUp()
	{
		multidimentional = new MultiDimentionalArray();
	}
	@Test
	public void findingNumberTest() 
	{
		int array[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		boolean result = multidimentional.findingNumber(5,array);
		assertEquals(true,result);
		}
	@Test
	public void findingNoNumberTest() 
	{
		int array[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		boolean result = multidimentional.findingNumber(10,array);
		assertEquals(false,result);
		}
	}



