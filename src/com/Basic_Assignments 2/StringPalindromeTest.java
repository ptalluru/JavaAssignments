import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringPalindromeTest 
{
	StringPalindrome stringPalindrome;
	@Before
	public void setUp()
	{
		stringPalindrome=new StringPalindrome();
	}
	@Test
	public void test()
	{
		String[] input={"ABCD","PPPOOOOPPP","PQRS","AABB","ABBA","ABA","ACCCA","ANMMNA","MAAM","HIJKJIH"};
		String []actual=stringPalindrome.checkPalindromAndSortArrayInDescendingOrder(input);
		String expected[]={"PPPOOOOPPP", "MAAM", "HIJKJIH", "ANMMNA", "ACCCA", "ABBA", "ABA"};
		assertArrayEquals(expected, actual);
	}
}
