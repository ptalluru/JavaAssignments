import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {
	private Person person,person1;
	@Before
	public void setUp(){
		person = new Person("Ajay",05,06,1980);
		person1 = new Person("Navya",02,03,1987);
	}

	
	@Test
	public void display() {
		person.display();
		//String expected="Ajay is older than Navya by 2 years ,5 months, and 25days";
		//String result =person1.olderOne(person,person1);
		//assertEquals(expected,result);
	}
	@Test
	public void olderOne() {
		String expected="Ajay is older than Navya by 6 years ,8 months, and 25days";
		String result =person1.olderOne(person,person1);
		assertEquals(expected,result);
	}
}
