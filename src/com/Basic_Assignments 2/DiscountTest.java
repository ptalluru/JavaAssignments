import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DiscountTest 
{
	private Discount discount;
	@Before
	public void setUp()
	{
		discount = new Discount();
	}
	@Test
	public void test1() 
	{
		int itemValue= 100;
		int actual = discount.itemDiscount(itemValue);
		int expected =65;
		assertEquals(expected,actual);
	}
	@Test
	public void test2() 
	{
		int itemValue= 35;
		int actual = discount.itemDiscount(itemValue);
		int expected =23;
		assertEquals(expected,actual);
	}
	@Test
	public void test3() 
	{
		int itemValue= -305;
		int actual = discount.itemDiscount(itemValue);
		int expected =0;
		assertEquals(expected,actual);
	}

	
	

}
