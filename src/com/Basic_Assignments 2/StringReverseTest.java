import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringReverseTest 
{
	private StringReverse stringReverse;
	@Before
	public void setUp()
	{
		stringReverse = new StringReverse();
	}

	@Test
	public void stringreversal() {
		String reverse = stringReverse.change("Let's take LeetCode contest");
		assertEquals("s'teL ekat edoCteeL tsetnoc",reverse);
	}

}
