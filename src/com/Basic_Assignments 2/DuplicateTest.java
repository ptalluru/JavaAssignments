import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DuplicateTest 
{
	private Duplicate duplicate;
	@Before
	public void setUp()
	{
	duplicate = new Duplicate();
	}
	@Test
	public void test() 
	{
		String word1 = "abcabcabc";
		String expectedWord1="abc";
		String word= duplicate.removeDuplicate(word1);
		assertEquals(expectedWord1,word);
	}
	@Test
	public void test2() 
	{
		String word1 = "javaforschool";
		String expectedWord1="javforschl";
		String word= duplicate.removeDuplicate(word1);
		assertEquals(expectedWord1,word);
	}
	@Test
	public void test3() 
	{
		String word1 = "Mississippi";
		String expectedWord1="Misp";
		String word= duplicate.removeDuplicate(word1);
		assertEquals(expectedWord1,word);
	}

}
