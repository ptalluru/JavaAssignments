import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class PalindromeTest {
	private Palindrome  palindrome ;
	@Before
	public void setUp()
	
	{
		palindrome = new Palindrome();
	}
	@Test
	public void positiveNumber() 
	{
		boolean result = palindrome.isPalindrome(121);
		assertEquals(true,result);
	}
	@Test
	public void negitiveNumber() 
	{
		boolean result = palindrome.isPalindrome(-121);
		assertEquals(false,result);
	}
	@Test
	public void zeroLast() 
	{
		boolean result = palindrome.isPalindrome(10);
		assertEquals(false,result);
	}
	@Test
	public void singleDigit() 
	{
		boolean result = palindrome.isPalindrome(9);
		assertEquals(false,result);
	}
	

}
